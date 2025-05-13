package patterns.builder.user;


public class User {
    private final String id;
    private final String name;
    private final int age;
    private final String email;

    private User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + "]";
    }



    public static class Builder {
        private String id;
        private String name;
        private int age;
        private String email;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
        
    }

}