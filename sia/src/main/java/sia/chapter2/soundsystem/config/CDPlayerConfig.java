package sia.chapter2.soundsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sia.chapter2.soundsystem.mediaPlayers.CDPlayer;
import sia.chapter2.soundsystem.mediaPlayers.MediaPlayer;
import sia.chapter2.soundsystem.musicDevice.CompactDisc;
import sia.chapter2.soundsystem.musicDevice.SgtPeppers;

@Configuration
//@ComponentScan(basePackages={"sia.chapter2.soundsystem.musicDevice","sia.chapter2.soundsystem.mediaPlayers"})

public class CDPlayerConfig {

	@Bean(name="lonelyHeartsClubBand")
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}
	
	@Bean
	public MediaPlayer cdPlayer(CompactDisc cd) {
		CDPlayer cdPlayer = new CDPlayer(cd);
		return cdPlayer;
	}

}