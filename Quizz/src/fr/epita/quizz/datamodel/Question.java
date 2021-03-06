package fr.epita.quizz.datamodel;

public class Question {
	private String question;
	private String[] topics;
	private Integer difficulty;
	private Answer answer;
	
	public Question(String question, String[] topics, Integer difficulty, Answer answer) {
		this.question = question;
		this.topics = topics;
		this.difficulty = difficulty;
		this.answer = answer;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String[] getTopics() {
		return topics;
	}

	public void setTopics(String[] topics) {
		this.topics = topics;
	}

	public Integer getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Integer difficulty) {
		this.difficulty = difficulty;
	}
	
	public Answer getAnswer() {
		return this.answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	
}
