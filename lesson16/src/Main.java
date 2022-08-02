import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //HashMap @ vercnum e Key ev Value voronc mej kareli e pahel cankacac tip
        //hishoxutyan mej pahvum e 16 akan hamakargov  xeshavorum ev bajanum 15 i
        HashMap<Integer, String> map = new HashMap<>();
        map.put(4, "David");
        map.put(12, "Gev");
        map.put(22, "Ani");
        map.put(19, "Meri");
        map.put(7, "David");
        System.out.println(map);
        System.out.println(map.get(5));
        System.out.println("-----------------");
        //TreeMap @ sortavorum e @st Key i
        TreeMap<Integer, String> map1 = new TreeMap<>();
        map1.put(4, "David");
        map1.put(12, "Gev");
        map1.put(19, "Ani");
        map1.put(22, "Meri");
        map1.put(7, "David");
        System.out.println(map1);

        HashMap<Integer, String> math = new HashMap<>();
        math.put(1, "one");
        math.put(2, "two");
        math.put(3, "three");
        math.put(4, "four");
        math.put(5, "five");

        int a = 1, b = 2;

        System.out.println(math.get(a) + " + " + math.get(b) + " = " + math.get(a + b));

        HashMap<Integer, MyLang> lang = new HashMap<>();
        lang.put(1, new MyLang("one", "մեկ"));
        lang.put(2, new MyLang("two", "երկու"));
        lang.put(3, new MyLang("three", "երեք"));
        lang.put(4, new MyLang("four", "չորս"));
        lang.put(5, new MyLang("five", "հինգ"));
        int a1 = 1, b1 = 2;

        System.out.println(lang.get(a).en + " + " + lang.get(b).en + " = " + lang.get(a + b).en);
        System.out.println(lang.get(a).hy + " + " + lang.get(b).hy + " = " + lang.get(a + b).hy);
        drive(Direction.WEST);
    }

    static void drive(Direction d) {
        if (d == Direction.EAST) {
            System.out.println(Direction.EAST.value);
        }
        if (d == Direction.NORTH) {
            System.out.println(Direction.NORTH.value);
        }
        if(d == Direction.SOUTH) {
            System.out.println(Direction.SOUTH.value);
        }
        if (d == Direction.WEST) {
            System.out.println(Direction.WEST.value);
        }
    }
}