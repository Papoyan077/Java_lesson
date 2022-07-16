public class Main {
    public static void main(String[] args) {
        //Nameing
        int a;
        int A;
        int $4;
        int _5;
        int a44;

        // Camel Case

        String firstName;
        String firstNameOfBestStudent;
        String first_name;

        // Arithmetic Operators
        System.out.println("-----------------");

        int x = 4;
        int y = 2;
        int z = 5;
        int c;
        System.out.println(x + z);
        c = x * y;
        System.out.println(c);
        c = x / y;
        System.out.println(c);

        // sovorakan bajanum

        c = z / x;
        System.out.println(c);

        // mnacordov bajanum

        c = z % 4;
        System.out.println(c);
        double t = 7.1, f = 5.1;
        System.out.println(t / f);

        // ++ -- operators
        System.out.println("-----------------");

        x++;
        ++x;
        System.out.println(x);
        x = 4;
        System.out.println(x++);// x=4
        System.out.println(x);// x=5
        System.out.println(++x);//x=6
        x = 4;
        System.out.println(x++ + x);// 4 + 5

        //Relational Operators
        //veradarcnum e boolean true kam false

        System.out.println("-----------------");

        boolean bb = x == 5;// havasr e
        System.out.println(bb);
        bb = x != 6;// havasr che
        System.out.println(bb);
        bb = x <= 8;// poqr havasar
        System.out.println(bb);
        bb = x >= 7;//mets havasar
        System.out.println(bb);
        System.out.println(x % 2 == 0);// mnacort ka te che

        //The Logical Operators
        //veradarcnum e boolean

        System.out.println("-----------------");
        System.out.println(x >= 1 && x <= 9); // ev gorcoxutyun petq e bavarari 2 masnel
        System.out.println(x > 0 || x > 100);// kam gorcoxutyun petq e bavarari gone 1@

        bb = false;
        System.out.println(!bb);// poxum e arjeq@  hakarak

        System.out.println(x > 3 && x % 2 == 0 || x < 8);

        //Bitwise Operators
        // 1 & 0
        // 10 akan ev 2 akan

        System.out.println("-----------------");

        System.out.println(5 & 8);
        System.out.println(5 ^ 8);
        System.out.println(5 | 7);
        System.out.println(17 & 24);

        //Assignment Operators

        System.out.println("-----------------");

        x = 7;
        x += 2;//krchat gumarum x=x+2
        System.out.println(x);
        x&=2;
        System.out.println(x);


    }
}