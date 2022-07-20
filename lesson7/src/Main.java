import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner method
        Scanner s = new Scanner(System.in);

        int n=s.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        s.nextLine();
        String st= s.nextLine();
        System.out.println(st);
    }
}