package demo;

import org.springframework.stereotype.Component;

@Component
public class Violon implements Instrument  {

	@Override
	public void jouer() {
		System.out.println("ro ro ro");
		
	}

}
