public class JavaProgrammer extends Human implements ChessPlayer, Programmer{
    @Override
    public void writeCode(String requirement) {
        System.out.println("Java writing code "+requirement);
    }

    @Override
    public String languages() {
        return "Java ,C++";
    }

    @Override
    public void readCode() {
        System.out.println("reading Java code");
    }

    @Override
    public void playChess() {

    }
}
