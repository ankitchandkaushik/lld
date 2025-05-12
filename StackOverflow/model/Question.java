package model;
import java.util.*;
public class Question {
    String id;
    String description;
    Set<Topic> topics;
    List<Answer> answers;
    boolean answered;
    String raisedBy;

    public Question (String id, String description, List<Topic> topics, String userId) {
        this.id = id;
        this.description = description;
        this.topics = (Set<Topic>) topics;
        this.answers = new ArrayList<>();
        this.answered = false;
        this.raisedBy = userId;
        
    }

    public String toString() {
        return (this.id + " " + this.description + " " + this.topics.toString() + " " + this.answered + this.answers.toString());
    }

    public Set<Topic> getTopics() {
        return this.topics;
    }

    public boolean isAnswered() {
        return this.answered;
    }

    public List<Answer> getAnswers() {
        return  this.answers;
    }

    public String getUserId() {
        return this.raisedBy;
    }

    public void setAnswered(boolean b) {
        this.answered = b;
    }

    // public String showQuestion() {
    //     return (this.id + " " + this.description + " " + this.topics.toString() + " " + this.answered + this.answers.toString());
        
    // }
}
