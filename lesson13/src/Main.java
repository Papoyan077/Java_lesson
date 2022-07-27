import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a =new ArrayList<>();
        a.add(4);
        a.add(9);
        a.add(12);
        a.add(76);
        a.add(45);
        a.add(45);
        a.add(45);
        a.add(45);
        a.add(2);
        System.out.println(a);
        a.add(0,5);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        Integer i=45;
        a.remove(i);
        a.remove(Integer.valueOf(2));
        System.out.println(a);
        a.set(0,7);
        System.out.println(a);
        System.out.println(a.indexOf(45));
        System.out.println(a.get(0));
        System.out.println(a.size());
        for (int j = 0; j < a.size(); j++) {
            System.out.print(a.get(j)+" ");
        }
        System.out.println();
        System.out.println(a.contains(7));
        List<String> s= new ArrayList<>(Arrays.asList("asd", "sd","ds","ad","adsd"));
        System.out.println(s);
        List<Integer> s1= new ArrayList<>(Collections.nCopies(10,1));
        List<Integer> s2= new ArrayList<>(Collections.nCopies(5,2));
        s1.addAll(s2);
        System.out.println(s1);
        Collections.sort(a);
        System.out.println(a);
        Collections.sort(a,Collections.reverseOrder());
        System.out.println(a);

        List<String> names=new ArrayList<>();
        names.add("David");
        names.add("Anna");
        names.add("Ani");
        names.add("Gevor");
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);
        System.out.println("---------------");
        List<Human> humans=new ArrayList<>();
        humans.add(new Human("Aago",52));
        humans.add(new Human("Balod",45));
        humans.add(new Human("Cven",35));
        Collections.sort(humans,new AgeComparator().reversed());
        System.out.println(humans);
        Collections.sort(humans,new NameComparator());
        System.out.println(humans);
    }
}