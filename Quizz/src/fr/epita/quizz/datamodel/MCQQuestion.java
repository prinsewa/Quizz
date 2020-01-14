package fr.epita.quizz.datamodel;

public class MCQQuestion extends Question{
	private MCQChoice[] choices;
	
	public MCQQuestion(String question, String[] topics, Integer difficulty, MCQChoice[] choices, Answer answer) {
		super(question, topics, difficulty, answer);
		this.choices = choices;
	}

	public MCQChoice[] getChoices() {
		return choices;
	}

	public void setChoices(MCQChoice[] choices) {
		this.choices = choices;
	}
	
}
