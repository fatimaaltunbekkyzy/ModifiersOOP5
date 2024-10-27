public class Eagle extends Animal{
    private int wingLength;//длина орла

    public Eagle( String name,int age,int wingLength){
super(name , age);
this.wingLength = wingLength;
    }

    public int getWingLength() {
        return wingLength;
    }

    public void setWingLength(int wingLength) {
        this.wingLength = wingLength;
    }
    public void flyMethod(){
        System.out.println("The eagle flies");
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "Name: " + super.getName() + "\n" +
                "Age: " + super.getAge() + "\n" +
                "WingLength: " + wingLength +
                '}';
    }
}
