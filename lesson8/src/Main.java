public class Main {
    public static void main(String[] args) {
        Human h = new Human();
        Human h2 = new Human();
        System.out.println(Human.count);
        Student student=new Student("David");
        Student.sum(9,7);
//        Student student1=new Student("Anna");
        Student.sum(8,7);
// Integer@ static function e
        String s="7";
        int a =Integer.parseInt(s);
        System.out.println(a);
    }
}