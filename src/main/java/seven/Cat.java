package seven;

public class Cat {
    private String name;
    private int appetite;
    private boolean nothungry;

    String getName() {
        return name;
    }

    int getAppetite() {
        return appetite;
    }

    boolean getnothungry(){
        return true;
    }

    public Cat(String name, int appetite, boolean nothungry) {
        this.name = name;
        this.appetite = appetite;
        this.nothungry = nothungry;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}
