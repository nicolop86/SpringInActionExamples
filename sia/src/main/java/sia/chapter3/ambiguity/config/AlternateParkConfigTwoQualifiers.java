package sia.chapter3.ambiguity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import sia.chapter3.ambiguity.park.AlternateAmericanPark;
import sia.chapter3.ambiguity.park.AlternateCanadianPark;
import sia.chapter3.ambiguity.park.Park;
import sia.chapter3.ambiguity.tree.Maple;
import sia.chapter3.ambiguity.tree.Oak;
import sia.chapter3.ambiguity.tree.Tree;

@Configuration
public class AlternateParkConfigTwoQualifiers {

	@Bean
	@Profile({"us","ca"})
	public Tree mapleTree(){
		return new Maple();
	}

	@Bean
	@Profile({"us","ca"})
	public Tree oakTree(){
		return new Oak();
	}

	@Bean
	@Profile("us")
	public Park usPark() {
		AlternateAmericanPark usPark = new AlternateAmericanPark();
		return usPark;
	}
	
	@Bean
	@Profile("ca")
	public Park caPark() {
		AlternateCanadianPark caPark = new AlternateCanadianPark();
		return caPark;
	}
	
}
