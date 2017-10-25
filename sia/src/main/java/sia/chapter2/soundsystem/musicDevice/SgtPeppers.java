package sia.chapter2.soundsystem.musicDevice;

import org.springframework.stereotype.Component;

@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {

	private final static String _title = "Sgt. Pepper's Lonely Hearts Club Band";
	private final static String _artist = "The Beatles";

	@Override
	public void play() {
		System.out.print("Playing " + _title + " by " + _artist);
	}

}