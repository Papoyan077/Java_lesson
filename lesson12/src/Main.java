import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        int x = 3, y = 0;
        //System.out.println(x/y);
        String a = null;
        try {
            System.out.println(a.length());
        } catch (NullPointerException e) {
            System.out.println("null");
        }
        try {
            System.out.println("Start");
            FileReader f = new FileReader("ip.txt");
            System.out.println("process");

        } catch (FileNotFoundException e) {
            System.out.println("Brnec");
        }
        System.out.println("end");
        Human h = new Human();
        h.setName("Agsdh");
        System.out.println(h.getName());

        try {
            h.setYear(-45);
        } catch (YearException e) {
            e.printStackTrace();
        }

        Scanner s = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("Enter Name");

        while (true) {
            String name = s.next();
            try {
                h.setName(name);
                System.out.println("thanks " + h.getName());
                break;
            } catch (NameExeption e) {
                System.out.println("Invalid name");
            }
        }
        String n = "789";
        System.out.println(isNumber(n));

    }

    private static boolean isNumber(String n) {
        try {
            Double.parseDouble(n);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}