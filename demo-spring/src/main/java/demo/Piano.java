package demo;

import javax.inject.Named;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Named
@Primary
public class Piano implements Instrument {

	@Override
	public void jouer() {
		System.out.println("ta ta ta");
		
	}

}
