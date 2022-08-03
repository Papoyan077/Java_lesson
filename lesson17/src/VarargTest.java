public class VarargTest {
    public static void main(String[] args) {
        sum(4, 5);
        sum(4, 5);
        sum(new int[]{4, -9, 1});
        f(4);
        f(4, 5, 6, 7);
        f(54, 87);
        f(new int[]{4, 5, 6, 7});
        System.out.println("-------------");
        Integer[] i = {1, 3,7,9,10,2};
        Double[] d = {1.54, 3.12};
        print(i, d);
        print(d, i);
        Student student=new Student();
        System.out.println(max(i));
    }

    static <T extends  Comparable<T>>  T max(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max.compareTo(array[i])<0) {
                max = array[i];
            }
        }
        return max;
    }

    //Varargs method mi qani functioni poxaren
    static void f(int... a) {
        int s = 0;
        for (int x : a) {
            s += x;
        }
        System.out.println(s);
    }

    //Generic method shabloni der e tanum vercnum e cankacac object
    static <EsimInch> void print(EsimInch[] a, EsimInch[] b) {
        for (EsimInch e : a) {
            System.out.println(e + " ");
        }
    }

    static void sum(int x, int y) {

    }

    static void sum(int[] x) {

    }
}
