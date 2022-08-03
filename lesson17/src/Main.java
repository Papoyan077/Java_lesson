public class Main {
    public static void main(String[] args) {
        User u1=new User("log","pass","mail");
        try {
            User u2= (User) u1.clone();
            System.out.println(u2.login);
            System.out.println(u2.password);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}