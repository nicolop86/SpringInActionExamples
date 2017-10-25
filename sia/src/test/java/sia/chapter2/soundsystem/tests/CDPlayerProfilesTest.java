package sia.chapter2.soundsystem.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sia.chapter2.soundsystem.config.AggregateCDPlayerConfig;
import sia.chapter2.soundsystem.mediaPlayers.CDPlayer;
import sia.chapter2.soundsystem.musicDevice.CompactDisc;

@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AggregateCDPlayerConfig.class})
@ActiveProfiles("aDisc")
public class CDPlayerProfilesTest {
	
	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	
	@Autowired
	private CDPlayer player;
	
	@Autowired
	private CompactDisc cd;
	
	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}
	
	@Test
	public void testOutput() {
		player.play();
		assertEquals(
				"Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles",
						log.getLog());
	}

}
