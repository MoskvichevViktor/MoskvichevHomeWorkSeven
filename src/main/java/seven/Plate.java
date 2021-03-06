package seven;

public class Plate {
    private int food;
    int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }

    //функция уменьшения еды в миске и проверка на отрицательное значение
    public void decreaseFood(int n) {
        int m = food - n;
        if((m) < 0){
            System.out.println("Необходимо пополнить миску, котам нечего есть");
        }else food -= n;
    }

    //метод для добавления порции еды в миску
    public void increaseFood(int plusfood) {
        food += plusfood;
        System.out.println("Пополнении миски на " + plusfood  + " единиц корма.");
    }

    /*public void info() {
        System.out.println("plate: " + food);
    }*/

    /*boolean checkFood(int n) {
        return (food - n) >= 0;
    }*/

}
