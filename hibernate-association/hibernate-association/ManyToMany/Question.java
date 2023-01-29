package ManyToMany;

import java.util.Map;

public class Question {
	
	private int qid;  
	private String name;  
	private Map<String,User> answers;
	
	public Question() {}  
	public Question(String name, Map<String, User> answers) {  
	    super();  
	    this.name = name;  
	    this.answers = answers;  
	}  
	
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, User> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<String, User> answers) {
		this.answers = answers;
	}  

}
