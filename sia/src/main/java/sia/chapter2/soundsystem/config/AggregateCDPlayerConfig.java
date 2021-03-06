package sia.chapter2.soundsystem.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import sia.chapter2.soundsystem.mediaPlayers.CDPlayer;
import sia.chapter2.soundsystem.mediaPlayers.MediaPlayer;
import sia.chapter2.soundsystem.musicDevice.BlankDisc;
import sia.chapter2.soundsystem.musicDevice.CompactDisc;
import sia.chapter2.soundsystem.musicDevice.SgtPeppers;

@Configuration
public class AggregateCDPlayerConfig {

	@Bean(name="lonelyHeartsClubBand")
	@Profile("sgt")
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}
	
	@Bean
	@Profile({"aDisc","sgt"})
	public MediaPlayer cdPlayer(CompactDisc cd) {
		CDPlayer cdPlayer = new CDPlayer(cd);
		return cdPlayer;
	}
	
	@Bean(name="aDisc")
	@Profile("aDisc")
	public CompactDisc aDisc() {
		String title = "Rainbow";
		String artist = "Rammstein";
		List<String> trackList = new ArrayList<>();
		trackList.add("01 Warlord");
		trackList.add("02 Upside-down");
		trackList.add("03 Running");
		trackList.add("04 Step-by-step");
		trackList.add("05 Something bitter");
		trackList.add("06 EUrope");
		trackList.add("07 Sunbathing");
		trackList.add("08 Show who you are");
		trackList.add("09 Pilgrims!");
		trackList.add("10 Happiness");
		CompactDisc cd = new BlankDisc(title, artist, trackList);
		return cd;
	}
	
}
