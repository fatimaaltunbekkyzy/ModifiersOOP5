public class Shark extends Animal {
    private String tup;//тип акулы
    public Shark (String name, int age, String tup){
        super(name,age);
        this.tup = tup;
    }

    public String getTup() {
        return tup;
    }

    public void setTupMethod(String tup) {
        this.tup = tup;
    }
    public void attackMethod(){
        System.out.println("Shark predator");
    }

    @Override
    public String toString() {
        return "Shark{" +
                "Name: " + super.getName() + "\n" +
                "Age: " + super.getAge() + "\n" +
                "Tup: " + tup + "\n" +
                '}';
    }
}
