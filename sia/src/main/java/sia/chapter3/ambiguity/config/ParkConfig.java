package sia.chapter3.ambiguity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sia.chapter3.ambiguity.park.FrenchPark;
import sia.chapter3.ambiguity.park.ItalianPark;
import sia.chapter3.ambiguity.park.Park;
import sia.chapter3.ambiguity.tree.Pine;
import sia.chapter3.ambiguity.tree.Poplar;
import sia.chapter3.ambiguity.tree.Tree;

@Configuration
public class ParkConfig {

	@Bean
	public Tree poplarTree(){
		return new Poplar();
	}

	@Bean
	public Tree pineTree(){
		return new Pine();
	}

	@Bean
	public Park itPark(Tree tree) {
		ItalianPark italianPark = new ItalianPark(tree);
		return italianPark;
	}
	
	@Bean
	public Park frPark(Tree tree) {
		FrenchPark frenchPark = new FrenchPark(tree);
		return frenchPark;
	}

}