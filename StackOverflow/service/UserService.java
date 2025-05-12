package service;
import java.util.*;

import model.Answer;
import model.Question;
import model.Topic;
import model.User;
public class UserService {
    HashMap<String, User> userMap= new HashMap<>(); 
    HashMap<String, Question> questionsCatalog= new HashMap<>(); 

    String currUser = "*";

    public void signUp(String id, String name, String profession ) {
        if(userMap.containsKey(id)) {
            System.out.println("User id already exists");
        } else {
            User user = new User(id, name, profession);
            userMap.put(id, user);
            currUser = "id";
            System.out.println("Successfully logged in " + id);
        }
    }

    public void signOut() {
        currUser = "*";
        System.err.println("Logged out");
    }

    public void logIn(String id) {
        if(!currUser.equals("*")) {
            System.out.println("Logout current user before login");
            return ;
        }
        if(currUser.equals(id)) {
            System.out.println("User already logged in");
            return ;
        } else {
            if(!userMap.containsKey(id)) {
                System.out.println("Invalid id");
                return ;
            }
            currUser = "id";
            System.out.println("Successfully logged in " + id);
        }
    }


    public void showProfile(String id) {
        if(currUser.equals(id)) {
            System.out.println(userMap.get(id).toString());
        }
        
    }

    public void subscribe(Topic topic) {
        if(currUser.equals("*")) {
            System.out.println("Login before subscribing topic");
        } else {
            userMap.get(currUser).getTopics().add(topic);
            System.out.println("Successfully added topic " + topic + " for user " + currUser);
        }
    }

    public void askQuestion(String id, String description, List<Topic> topics) {
        if(questionsCatalog.containsKey(id)) {
            System.out.println("Use diff id");
        } else {
            if(topics == null  || topics.isEmpty()) {
                System.out.println("Add atleast one topic");
            } else {
                if(!currUser.equals("*")) {
                    Question question = new Question(id, description, topics, currUser );
                questionsCatalog.put(id, question);
                System.out.println("Successfully added question");
                }
                

            }
        }
    }

    public void showFeed(Topic topic ) {
        if(topic != null) {
            for(String id: questionsCatalog.keySet()) {
                if(questionsCatalog.get(id).getTopics().contains(topic)) {
                    System.out.println(questionsCatalog.get(id).toString());
                }
            }
        }
    }

    public void showFeed() {
        for(String id: questionsCatalog.keySet()) {
            
            System.out.println(questionsCatalog.get(id).toString());
            
        }
    }

    public void showFeed(Boolean answered) {
        for(String id: questionsCatalog.keySet()) {
            if(questionsCatalog.get(id).isAnswered()) {
                System.out.println(questionsCatalog.get(id).toString());
            }
        }
    }

    public void showQuestion(String id) {
        if(questionsCatalog.containsKey(id)) {
            System.out.println(questionsCatalog.get(id).toString());
        }
    }


    public void answerQuestion(String id, String ans) {
        if(questionsCatalog.containsKey(id)) {
            questionsCatalog.get(id).getAnswers().add(new Answer(ans));
        }
    }

    public void acceptAnswer(String id, String ans) {
        if(questionsCatalog.containsKey(id)) {
            if(currUser.equals(questionsCatalog.get(id).getUserId())) {
                questionsCatalog.get(id).setAnswered(true);
            }
        }
        
    }


    boolean isSubscribed(String id) {
        if(!currUser.equals("*")) {
            User user = userMap.get(currUser);
            if(questionsCatalog.containsKey(id)) {
                Question q = questionsCatalog.get(id);
                for(Topic t: user.getTopics()) {
                    for(Topic qt: q.getTopics()) {
                        if(t.equals(qt)) {
                            return true;
                        }
                    }
                } 
            }
            
        }
        return false;
    }


}
