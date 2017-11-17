package sia.chapter3.ambiguity.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sia.chapter3.ambiguity.config.AlternateParkConfigTwoQualifiers;
import sia.chapter3.ambiguity.park.Park;

public class AmbiguityParkTwoQualifiersMain {

	public static void main(String[] args) {
		String profile = null;
		if(args.length>0){
			try{
				profile = args[0].toString();
			} catch(Exception e) {
				System.err.println(e.getStackTrace());
				System.exit(-1);
			}
		} else {
			System.err.println("No arguments found");
			System.exit(-1);
		}
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles(profile);
		context.register(AlternateParkConfigTwoQualifiers.class);
		context.refresh();
		Park newPark = context.getBean(Park.class);
		newPark.showingTrees();
		context.close();
	}

}
