package fr.epita.quizz.datamodel;

public class MCQChoice {
	private String choice;
	private boolean valid;
	private MCQAnswer answer;
	
	public MCQChoice(String choice, boolean valid) {
		this.choice = choice;
		this.valid = valid;
		this.answer = new MCQAnswer(this.valid);
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public MCQAnswer getAnswer() {
		return answer;
	}

	public void setAnswer(MCQAnswer answer) {
		this.answer = answer;
	}
	
	

}
