package sia.knight.tests;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import sia.knights.BraveKnight;
import sia.quest.Quest;
import sia.quest.QuestException;

public class BraveKnightTest {
	@Test
	public void knightShouldEmbarkOnQuest() {
		Quest mockQuest = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		try {
			knight.embarkOnQuest();
		} catch (QuestException e) {
			e.printStackTrace();
		}
		try {
			knight.embarkOnQuest();
		} catch (QuestException e) {
			e.printStackTrace();
		}
		verify(mockQuest, times(2)).embark();
	}
}