package sia.chapter4.audience;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {

	@Before("performancePointcut()")
	public void takeSeats() {
		System.out.println("The audience is taking their seats.");
	}

	@Before("performancePointcut()")
	public void turnOffCellPhones() {
		System.out.println("The audience is turning off their cellphones");
	}

	@AfterReturning("performancePointcut()")
	public void applaud() {
		System.out.println("CLAP CLAP CLAP CLAP CLAP");
	}

	@AfterThrowing("performancePointcut()")
	public void demandRefund() {
		System.out.println("Boo! We want our money back!");
	}
	
	@Pointcut("execution(** sia.chapter4.performer.Performer.perform(..))")
	public void performancePointcut(){};
}
