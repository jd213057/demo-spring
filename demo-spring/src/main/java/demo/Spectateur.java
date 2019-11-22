package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class Spectateur {
	@Before("execution(* demo.Musicien.jouer(..))")
	public void prendrePlace() {
		System.out.println("Les spectateurs prennent place");
	}

}
