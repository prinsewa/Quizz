package fr.epita.quizz.datamodel;

public class Answer {
	private String text;

	public Answer(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
