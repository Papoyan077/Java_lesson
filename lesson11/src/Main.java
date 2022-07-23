public class Main {
    public static void main(String[] args) {
        //final popoxakani arjeq@ hnaravor che poxel
        final int a=47;

        Triangle t =new Triangle(1,1,1,5,4,1);
        t.printPerimeter();

        Musician m =new Guitarist();
        m.playMusic();
        //Anonimus inner class
        Musician p=new Musician() {
            @Override
            public void playMusic() {
                System.out.println("playing piano");
            }
        };
        p.playMusic();
    }
}