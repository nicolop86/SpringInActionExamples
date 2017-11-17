package sia.chapter4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import sia.chapter4.audience.Audience;
import sia.chapter4.instruments.Instrument;
import sia.chapter4.instruments.Piano;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages={"sia.chapter4"})
public class ConcertConfig {

	@Bean
	public Audience audience(){
		return new Audience();
	}
	
	@Bean
	public Instrument instrument(){
		return new Piano();
	}
}
