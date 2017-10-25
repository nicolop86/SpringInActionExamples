package sia.chapter3.conditional.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sia.chapter3.conditional.config.MagicConfig;
import sia.chapter3.conditional.park.Park;

public class ConditionalParkMain {
	
	public static void main(String[] args){
		String s = null;
		if(args.length>0){
			try{
				s = args[0].toString();
			} catch(Exception e) {
				System.err.println(e.getStackTrace());
				System.exit(-1);
			}
		} else {
			System.err.println("No arguments found");
			System.exit(-1);
		}
		
		System.setProperty(s, "true");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MagicConfig.class);
		Park park = ctx.getBean(Park.class);
		park.showingTrees();
		ctx.close();
	}

}
