package sia.chapter3.ambiguity.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sia.chapter3.ambiguity.config.ParkConfig;
import sia.chapter3.ambiguity.park.Park;

public class AmbiguityParkMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ParkConfig.class);
		Park newPark = ctx.getBean(Park.class);
		newPark.showingTrees();
		ctx.close();
	}

}
