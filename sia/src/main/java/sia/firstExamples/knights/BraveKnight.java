package sia.firstExamples.knights;

import sia.firstExamples.quest.Quest;
import sia.firstExamples.quest.QuestException;

public class BraveKnight implements Knight {

	private Quest quest;

	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	public void embarkOnQuest() throws QuestException {
		quest.embark();
	}

}