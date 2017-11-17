package sia.chapter4.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sia.chapter4.config.ConcertConfig;
import sia.chapter4.performer.Performer;
import sia.chapter4.performer.PerformerException;

public class MainConcert {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConcertConfig.class);
		Performer p = ctx.getBean(Performer.class);
		try {
			p.perform();
		} catch (PerformerException e) {
			e.printStackTrace();
		}
		ctx.close();
	}

}
