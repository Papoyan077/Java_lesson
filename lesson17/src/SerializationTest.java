import java.io.*;

/**
 *My User class
 *
 *
 */
public class SerializationTest {
    public static void main(String[] args) {
        User u1 = new User("log", "pass", "mail");
        serializeUser(u1);
        User u = deserialize();
        System.out.println(u);
    }

    private static User deserialize() {
        try {
            FileInputStream fis = new FileInputStream("user.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o =ois.readObject();
            return (User) o;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null ;
    }

    private static void serializeUser(User user) {
        try {
            FileOutputStream fos = new FileOutputStream("user.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(user);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
