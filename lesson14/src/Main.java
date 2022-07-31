import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(4, 5, 6, 8, 7, 6, 5, 4, 1, 2, 3, 7, 5, 6, 3, 7, 8, 9, 3));
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));
        }
        System.out.println();
        System.out.println("----------");
        for (Integer integer : a) {
            System.out.print(integer);
        }
        System.out.println();
        System.out.println("----------");
        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext()) {
            Integer x = iterator.next();
            System.out.print(x);

        }
        System.out.println();
        System.out.println("----------");
        System.out.println("Remove even elements");
        System.out.println(a);
        for (int i = a.size() - 1; i >= 0; i--) {
            if (a.get(i) % 2 == 0) {
                a.remove(i);
            }
        }
        System.out.println(a);
        System.out.println("----------");
        Iterator<Integer> it = a.iterator();
        while (it.hasNext()) {
            Integer x = it.next();
            if (x % 2 == 0) {
                it.remove();
            }
        }
        System.out.println(a);
        System.out.println("----------");
        Vector<Integer> v = new Vector<>();
        v.add(5);
        v.add(4);
        v.add(8);
        v.add(8);
        v.add(9);
        System.out.println(v.size());
        System.out.println(v.capacity());



        HashSet<Integer> h = new HashSet<>();
        h.add(4);
        h.add(1);
        h.add(4);
        h.add(3);
        h.add(null);
        h.add(17);
        h.add(null);
        System.out.println(h);


        //ArrayLIst@ ashxatum e indexavorvac ogtagorcum en get() ev set() eri  jamanak
        //LikedList@ ashxatum e hasceavorvac aysinqn uni hajordi ev naxordi hascener@ ogtagorcvum e indexov set() ev remove() eri jamanak
        //aysinqn ete jnjel ev avelacnel shat ka LinkedList mnacac depqerum ArrayList
        //Vector@ Ashxatum e ArrayListi pes baci capacity ic erb vercnum e 10 chapani ev krknapatkum add() i jamanak



        //Set@ chi toxnum nuyn elementic unenal 2 hat
        //HashSet @ aveli arag e ashxatum
        //TreeSet anum e nuyn ban@ ev dasavorum e achman kargov
        //LinkedHashSet @ chi xarnum dasavorutyun@

    }
}