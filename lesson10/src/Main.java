public class Main {
    public static void main(String[] args) {
        //Polimorfizm@ irenic nerkayacnum e nuyn gorcoxutyan katarum@ tarber dzeverov
        // uni 2 exanak
        // 1 static(overloading) nuyn funkcian tarber arjeqnerov
        // 2 dynamic(overriding) nuyn funkcian tarber clasnerum

        Human human = new Human();
        human.setName("David");
        System.out.println(human.getName());
        Pianist p = new Pianist();
        p.playMusic();
        BassGuitarist b = new BassGuitarist();
        b.playMusic();
        ClassicalGuitarist c = new ClassicalGuitarist();
        c.playMusic();
        Guitarist g = new BassGuitarist();
        f(new ClassicalGuitarist());
        f(new BassGuitarist());
        f(g);
        System.out.println("----------------------");
        play(new Guitarist[]{
                new BassGuitarist(),
                new BassGuitarist(),
                new ClassicalGuitarist(),
                new ClassicalGuitarist(),
        });

        h(new Human());

    }

    static void play(Guitarist[] c) {
        for (Guitarist g : c) {
            g.playMusic();
            if (g instanceof BassGuitarist bg){
                bg.bass();
            }
        }
    }

    static void f(Guitarist g) {
        g.playMusic();
    }

    static void h(Human h){

    }
}