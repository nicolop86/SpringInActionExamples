package sia.chapter4.performer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sia.chapter4.instruments.Instrument;

@Component("instumentalist")
public class Instrumentalist implements Performer {

	public void perform() throws PerformerException {
	    instrument.play();
	  }

	  private Instrument instrument;

	  @Autowired
	  public void setInstrument(Instrument instrument) {
	    this.instrument = instrument;
	  }

	  public Instrument getInstrument() {
	    return instrument;
	  }

}
