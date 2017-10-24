package sia.knights;

import sia.quest.Quest;
import sia.quest.QuestException;

public class BraveKnight implements Knight {

	private Quest quest;

	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	public void embarkOnQuest() throws QuestException {
		quest.embark();
	}

}