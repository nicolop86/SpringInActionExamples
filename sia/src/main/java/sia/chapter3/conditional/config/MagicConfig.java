package sia.chapter3.conditional.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import sia.chapter3.conditional.condition.CanadaParkExistsCondition;
import sia.chapter3.conditional.condition.USAParkExistsCondition;
import sia.chapter3.conditional.park.CanadianPark;
import sia.chapter3.conditional.park.Park;
import sia.chapter3.conditional.park.USAPark;
import sia.chapter3.conditional.tree.Maple;
import sia.chapter3.conditional.tree.Oak;
import sia.chapter3.conditional.tree.Tree;

@Configuration
public class MagicConfig {


	@Bean
	@Conditional(USAParkExistsCondition.class)
	public Tree oakTree() {
		System.out.println("Oak tree creation");
		return new Oak();
	}

	@Bean
	@Conditional(USAParkExistsCondition.class)
	public Park usaPark(Tree tree) {
		System.out.println("USA Park creation");
		return new USAPark(tree);
	}

	@Bean
	@Conditional(CanadaParkExistsCondition.class)
	public Tree mapleTree(){
		System.out.println("Maple tree creation");
		return new Maple();
	}

	@Bean
	@Conditional(CanadaParkExistsCondition.class)
	public Park canadaPark(Tree tree) {
		System.out.println("Canadian park creation");
		return new CanadianPark(tree);
	}

}