public class NameExeption extends RuntimeException{
    public NameExeption(){
        super("Invalid Name : [A-Z][a-z]");
    }
}
