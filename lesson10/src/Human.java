public  class Human {
    public String name;
public void Human(Human h){
    System.out.println("HUMAN");
}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (isCorrectName(name))
            this.name=name;
        else
            System.out.println("invalid name");
    }
    private boolean isCorrectName(String name) {
        return name.matches("[A-Z][a-z]+");
    }
}
