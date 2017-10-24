package sia.firstExamples.quest;

public class QuestException extends Exception {

	/**
	 * 
	 */
	
	private static final String _message = "QuestException thrown";
	private static final long serialVersionUID = 1L;

	public QuestException() {
		super(_message);
	}
}
