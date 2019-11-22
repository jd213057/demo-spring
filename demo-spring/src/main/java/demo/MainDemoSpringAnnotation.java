package demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.AbstractApplicationContext;


@ComponentScan
@EnableAspectJAutoProxy
public class MainDemoSpringAnnotation {

	public static void main(String[] args) {
		try(AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(MainDemoSpringAnnotation.class)) {
			Musicien musicien = ctx.getBean(Musicien.class);
			musicien.jouer();
		}
		
		

	}
	
	@Bean 
	public String partition() {
		return "Ma partition";
	}
	
	@Bean 
	public String nom() {
		return "Jean-Albert";
	}


}
