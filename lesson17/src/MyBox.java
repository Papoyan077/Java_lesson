public class MyBox<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        MyBox<String> stringBox=new MyBox<>();
        MyBox<Integer> intBox=new MyBox<>();
        stringBox.setT("g");
        intBox.setT(5);
    }
}
