package demo;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Musicien {
	 //@Qualifier permet de determiner quel component on va scanner.
	
	@Inject  private String partition;
	@Inject @Qualifier("nom") private String nom;
	@Inject private Instrument instrument;
	
	public void jouer() {
//		new Spectateur().prendrePlace();
		System.out.println("partition : "+partition);
		System.out.println("nom : "+nom);
		instrument.jouer();
	}
	public String getPartition() {
		return partition;
	}
	public Instrument getInstrument() {
		return instrument;
	}
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	public void setPartition(String partition) {
		this.partition = partition;
	}
	
	public Musicien() {
		super();
	}
	@Autowired
	public Musicien(@Value ("au clair de la lune") String partition,
	@Qualifier("violon") Instrument instrument) {
		super();
		this.partition = partition;
		this.instrument = instrument;
	}
	

	
}
