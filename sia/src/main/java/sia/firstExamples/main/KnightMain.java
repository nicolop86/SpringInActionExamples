package sia.firstExamples.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sia.firstExamples.knights.Knight;
import sia.firstExamples.knights.config.KnightConfig;

public class KnightMain {
	public static void main(String[] args) throws Exception {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}
}