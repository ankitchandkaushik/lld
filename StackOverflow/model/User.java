package model;
import java.util.*;

public class User {
    String id;
    String name;
    String profession;
    Set<Topic> subscribedTopic;

    public User(String id, String name, String profession) {
        this.id = id;
        this.name = name;
        this.profession = profession;
        this.subscribedTopic = new HashSet<>();
    }

    public Set<Topic> getTopics() {
        return subscribedTopic;
    }


}