package sia.chapter4.instruments;

import org.springframework.stereotype.Component;

@Component("guitar")
public class Guitar implements Instrument {

	@Override
	public void play() {
		System.out.println("Playing the guitar!");
	}

}
