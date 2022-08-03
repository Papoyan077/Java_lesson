import java.util.ArrayList;

public class Student {
    private String name;
    private double mark;

    {
         name="David";
        System.out.println("Value of name David");
    }

    {
        mark=45.5;
    }

    public Student() {
        System.out.println("constructor");
       name = "name";
       mark = 47.2;
    }

    public static void main(String[] args) {
        Student student=new Student();
        System.out.println(student.mark);
        ArrayList list=new ArrayList(){{
            add(12);
            add(23);
            add(32);
            add(45);
        }};
        System.out.println(list);
    }
}
