public class Main {
    public static void main(String[] args) {
        System.out.println("1. Print Numbers From 1-15");
        for (int i = 1; i < 16; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n 2. Print Even Numbers From -10-20");
        for (int i = -10; i < 21; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n\n3. Print * symbols using given number");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n\n4.  Print * symbols using given number reverse");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n\n5.  Create an array with numbers from 1-11");
        int[] array = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println("\n\n6.  Create an array with even numbers from -11-11");
        int[] even = new int[11];
        for (int i = -10, k = 0; i < even.length; i += 2, k++) {
            even[k] = i;
        }
        for (int j : even) {
            System.out.print(j + " ");
        }
        System.out.println("\n\n7. Print count of odd elements");
        int[] odd = {5, 8, 6, 4, 9, 7, 2, 1, 15, 98, 25, 2, 6, 8, 35, 6, 19, 55, 6, 8, 45};
        for (int a : odd) {
            if (a % 2 != 0)
                System.out.print(a + " ");
        }
        System.out.println("\n\n8. Print elements from given array  -10 - 50");
        for (int a : odd) {
            if (a >= 6 && a <= 50)
                System.out.print(a + " ");
        }
        System.out.println("\n\n9. Given an array. Print elements which can be divided 3 or 4");

        for (int a : odd) {
            if (a % 3 == 0 || a % 4 == 0) {
                System.out.print(a + " ");
            }
        }
        System.out.println("\n\n10. Given an array. Print count of even elements");
        int evenCount = 0;
        for (int a : odd) {
            if (a % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("count of even elements" + evenCount);
        System.out.println("\n\n11. Given an array. Print sum of elements");
        int sum = 0;
        for (int a : odd) {
            sum += a;
        }
        System.out.println("sum of elements =" + sum);
        System.out.println("\n\n12. Given an array. Print sum of positive elements");
        int[] arr = {55, 8, -6, -4, 9, 7, 2, 1, 15, -8, 25, -2, 6, 28, 35, 65, 19, -5, 6, 18, 45};
        sum = 0;
        for (int a : arr) {
            if (a > 0) {
                sum += a;
            }
        }
        System.out.println("sum of positive elements = " + sum);
        System.out.println("\n\n13. Given an array. Print multiplication of positive elements");
        int[] arr2 = {5, 8, 6};
        int m = 1;
        for (int a : arr2) {
            m *= a;
        }
        System.out.println("multiplication of elements = " + m);
        System.out.println("\n\n14. Find maximal element from array");
        int max = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println("maximal element from array = " + max);
        System.out.println("\n\n15. Find minimal element from array");
        int min = arr[0];
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
        }
        System.out.println("minimal element from array = " + min);
        System.out.println("\n\n16. Find element which is alone ");
        int[] alone = new int[]{4, 2, 1, 9, 2, 1, 4};
        int result = alone[0];
        for (int i = 1; i < alone.length; i++) {
            result = result ^ alone[i];
        }
        System.out.println(result);


        System.out.println("\n\n17. sorting min-max");
        int[] sort = new int[]{-9,-8, -5, -4, 1, 2, 3, 4,5, 6, 7, 8, 9, 65, 89};
        int x;
        int count = 0;
        boolean boob = true;
        while (boob) {
            boob=false;
            for (int i = 0; i < sort.length - 1 - count; i++) {
                if (sort[i] > sort[i + 1]) {
                    x = sort[i];
                    sort[i] = sort[i + 1];
                    sort[i + 1] = x;
                    boob=true;
                }
            }
            count++;
        }

        for (int a : sort) {
            System.out.print(a + " ");
        }
    }
}