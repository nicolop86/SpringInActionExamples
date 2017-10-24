package sia.chapter2.soundsystem.mediaPlayers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sia.chapter2.soundsystem.musicDevice.CompactDisc;

@Component
public class CDPlayer implements MediaPlayer {

	private CompactDisc cd;

	@Autowired
	public CDPlayer(CompactDisc cd) {
		setCompactDisc(cd);
	}

	public void play() {
		cd.play();
	}

	@Autowired
	public void setCompactDisc(CompactDisc cd) {
		this.cd = cd;
	}

	public void insertDisc(CompactDisc cd) {
		this.cd = cd;
		System.out.println("Inserting cd...");
	}
}