package sia.chapter3.ambiguity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import sia.chapter3.ambiguity.park.FrenchPark;
import sia.chapter3.ambiguity.park.ItalianPark;
import sia.chapter3.ambiguity.park.Park;
import sia.chapter3.ambiguity.tree.Pine;
import sia.chapter3.ambiguity.tree.Poplar;
import sia.chapter3.ambiguity.tree.Tree;

@Configuration
public class ParkConfig {

	@Bean("poplarTree")
	@Profile({"it","fr"})
	public Tree poplarTree(){
		return new Poplar();
	}

	@Bean("pineTree")
	@Profile({"it","fr"})
	public Tree pineTree(){
		return new Pine();
	}

	@Bean
	@Profile("it")
	public Park itPark() {
		ItalianPark italianPark = new ItalianPark();
		return italianPark;
	}
	
	@Bean
	@Profile("fr")
	public Park frPark() {
		FrenchPark frenchPark = new FrenchPark();
		return frenchPark;
	}

}