package sia.knights.config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import sia.knights.BraveKnight;
import sia.knights.Knight;
import sia.minstrel.Minstrel;
import sia.quest.Quest;
import sia.quest.SlayDragonQuest;

@Configuration
public class KnightConfig {

	private static final String _fileName = "slayDragonQuest.log";
	private PrintStream ps = _getPrintStream();

	private PrintStream _getPrintStream(){
		File logFile = new File(_fileName);
		PrintStream filePs = null;

		try{
			filePs = new PrintStream(logFile);
		} catch (FileNotFoundException e){
			System.err.println(e);
		}
		return filePs;

	}

	@Bean
	public Quest quest() {
		return new SlayDragonQuest(ps);
	}

	@Bean
	public Knight knight() {
		return new BraveKnight(quest());
	}

	@Bean
	public Minstrel minstrel() {
		return new Minstrel(ps);
	}
	
	@Aspect
	@EnableAspectJAutoProxy
	public class MinstrelAspect {
		
		@Before("execution(* *.embarkOnQuest(..))")
		public void singBefore(JoinPoint jp) {
			minstrel().singBeforeQuest();
		}

		@After("execution(* *.embarkOnQuest(..))")
		public void singAfter(JoinPoint jp) {
			minstrel().singAfterQuest();
		}

	}

}