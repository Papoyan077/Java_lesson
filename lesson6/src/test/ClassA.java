package test;

public class ClassA {
    public static void main(String[] args) {
        // Cast  mec tip@ inchpes pahel poqri mej
        byte x = 4;
        int a = 7;
        x = (byte) a;
        System.out.println(x);
        byte x1 = 4;
        int a1 = -129;//pttum e noric -128-127 shrjan@
        x1 = (byte) a1;
        System.out.println(x1);
        x1 = (byte) (x1 + 1);
        x1 += 1;//krchat tarberak
        System.out.println(x1);
        x = 1;
        System.out.println("hello " + x + 5 + " Java");
        System.out.println("hello " + (x + 5) + " Java");
        System.out.println("-------------------------");
        //Parse function
        String s="7";
        int i=Integer.parseInt(s);
        System.out.println(i);

    }
}

