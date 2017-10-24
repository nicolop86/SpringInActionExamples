package sia.chapter2.soundsystem.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sia.chapter2.soundsystem.config.AlterCDPlayerConfig;
import sia.chapter2.soundsystem.mediaPlayers.CDPlayer;

public class SoundSystemMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AlterCDPlayerConfig.class);
		CDPlayer technics = context.getBean(CDPlayer.class);
		technics.play();
		context.close();
	}

}