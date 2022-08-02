public class MemoryTest {
    public static void main(String[] args) {
        //primitiv tiper@ pahvum en Stack um
        int a =5;
        //Objecner@ pahvum en Heapum isk popoxakanner@ Stack um
        //Garbage colleqtor@ katarum e axbi maqrum aysinqn jnjum e en objectner@ voronc vra cucich chka
        //ev katarum defragmentacia aysinqn kargavorum

        Student s1 =new Student("Gven",20);
        Student s2 =new Student("Gven",20);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
    private static void f(){
        int a =1;
    }

}
