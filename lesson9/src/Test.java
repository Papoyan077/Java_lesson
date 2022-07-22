public class Test {

    public static int fact(int n) {
        int r = 1;
        for (int i = 1; i <= n; i++) {
            r *= i;
        }
        return r;
    }

    public static int factR(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factR(n - 1);

    }
    public static int fib(int n){
        if (n==1|| n==2)
            return 1;
        return fib(n-1)+fib(n-2);
    }
}
