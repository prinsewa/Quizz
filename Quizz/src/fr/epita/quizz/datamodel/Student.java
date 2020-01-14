package fr.epita.quizz.datamodel;

public class Student {
	private String name;
	private String id;
	private Answer[] answers;
	private MCQAnswer[] mcqAnswers;
	
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Answer[] getAnswers() {
		return answers;
	}

	public void setAnswers(Answer[] answers) {
		this.answers = answers;
	}

	public MCQAnswer[] getMcqAnswers() {
		return mcqAnswers;
	}

	public void setMcqAnswers(MCQAnswer[] mcqAnswers) {
		this.mcqAnswers = mcqAnswers;
	}
	
	
	
	
}
