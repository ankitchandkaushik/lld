package patterns.builder.user;

public class App {

    public static void main(String[] args) {
        User user = new User.Builder()
        .setName("ankit")
        .setId("1")
        .setAge(1)
        .setEmail("gmail.com")
        .build();

        System.out.println(user.toString());
    }

 
}
