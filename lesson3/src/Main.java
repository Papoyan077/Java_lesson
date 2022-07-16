import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Arrays
        //a=[7.78.8.6.2] arjeqner
        //a=[0.1.2.3.4] indexner
        int[] a = new int[5];
        a[0] = 7;
        a[1] = 78;
        a[2] = 8;
        a[3] = 6;
        a[4] = 2;
        System.out.println(a[4]);//4rd index
        System.out.println(a.length);//erkarutyun
        System.out.println(a[0] + a[a.length - 1]);// arjeqqneri gumar

        System.out.println("-----------");

        int[] array = {7, 8, 6, 5, 2, 9, 3, 12, 54, 6, 87, 89, 789};// miangamic arjeq enq talis
        System.out.println(array[6]);

        System.out.println("-----------");

        int[] x;
        x = new int[]{5, 7, 9, 6};

        System.out.println("-----------");

        //If Else ete apa gorcoxutyun@

        int z = 4;
        if (z > 0) {
            System.out.println("barev");
        }

        System.out.println("-----------");

        if (z > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Non Positive");
        }
        System.out.println("-----------");

        int b;
        if (z > 0) {
            b = 1;
        } else {
            b = 0;
        }
        System.out.println(b);

        b = z > 0 ? 1 : 0;// nuyn verevi gorcoxutyun@ karchecvac ? = if : = else
        System.out.println(b);
        System.out.println("-----------");
        //Switch case ete gorcoxutyun@

        switch (z) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
        }


        //Ciklner
        // while
        // do while
        // for
        System.out.println("-----------");
        //While qani der
        int counter = 1;
        while (counter < 11) {
            System.out.print(counter++ + ",");
        }
        System.out.println();
        System.out.println("-----------");
        int c = 5;
        do {
            System.out.println("barev");
            c++;
        } while (c <= 4);
        System.out.println("-----------");
        //For hamar
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-----------");
        String[] names = {"David", "Karen", "Artur", "Ani", "Valod"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //For Each aveli karch dzev ashxatum e miayn zangvacneri het
        for (String s : names) {
            System.out.print(s + ' ');
        }
        System.out.println();
        System.out.println("-----------");
        // break gorcoxutyun
        int[] array2 = {1, 2, 3, -4, 5, 7, -8, 9};
        for (int num : array2) {
            if (num < 0) {
                System.out.println("ayo");
                break;
            }
        }

        System.out.println("-----------");
        // continue gorcoxutyun
        for (int i = 1; i <=10; i++) {
            if(i==5)
                continue;
                System.out.println(i);
        }

    }
}