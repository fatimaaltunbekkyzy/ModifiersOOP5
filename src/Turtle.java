public class Turtle extends Animal{
    private int hawYearsLive;//канча жылга чейин жашайт

    public Turtle(String name, int age, int hawYearsLive) {
        super(name, age);
        this.hawYearsLive = hawYearsLive;

    }

    public int getHawYearsLive() {
        return hawYearsLive;
    }

    public void setHawYearsLive(int hawYearsLive) {
        this.hawYearsLive = hawYearsLive;
    }
public  void swimMethod(){
    System.out.println("The turtle is swimming");
}
    @Override
    public String toString() {
        return "Turtle{" +
                "Name: " + super.getName() + "\n" +
                "Age: " + super.getAge() + "\n" +
                "hawYearsLive: " + hawYearsLive +
                '}';
    }
}
