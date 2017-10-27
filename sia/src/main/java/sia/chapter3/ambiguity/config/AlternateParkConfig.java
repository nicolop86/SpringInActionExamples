package sia.chapter3.ambiguity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import sia.chapter3.ambiguity.myQualifiers.MapleQualifier;
import sia.chapter3.ambiguity.myQualifiers.OakQualifier;
import sia.chapter3.ambiguity.park.AmericanPark;
import sia.chapter3.ambiguity.park.CanadianPark;
import sia.chapter3.ambiguity.park.Park;
import sia.chapter3.ambiguity.tree.Maple;
import sia.chapter3.ambiguity.tree.Oak;
import sia.chapter3.ambiguity.tree.Tree;

@Configuration
public class AlternateParkConfig {

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
	public Park usPark(@OakQualifier Tree t) {
		AmericanPark usPark = new AmericanPark(t);
		return usPark;
	}
	
	@Bean
	@Profile("ca")
	public Park caPark(@MapleQualifier Tree t) {
		CanadianPark caPark = new CanadianPark(t);
		return caPark;
	}
	
}
