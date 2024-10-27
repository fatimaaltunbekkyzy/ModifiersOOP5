//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Shark shark = new Shark("Blue shark", 25, "chordates");
       Turtle turtle = new Turtle("Pelodiscus maackii", 20, 20);
         Eagle eagle = new Eagle("Berkyt", 12, 66);
        Animal[] animals = {shark,turtle,eagle};
        for (Animal number : animals){
            System.out.println(number);

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // Ар бир жаныбар үчүн өзүнчө массив тузуп, методдорун чакырабыз
      for (Animal animal : animals) {
          // Жаныбарды текшерип, тиешелүү методду чакырабыз
          if (animal instanceof Shark) {
              System.out.println("attack");
              shark.attackMethod();

            } else if (animal instanceof Turtle) {
              System.out.println("swim");
              turtle.swimMethod();

             //   ((Turtle) animal).swim();
            } else if (animal instanceof Eagle) {
             //   ((Eagle) animal).fly();
eagle.flyMethod();
            }
            // Өзүнчө массив тузуу
            Animal[] singleAnimalArray = new Animal[1];
            singleAnimalArray[0] = animal;

            // Массивди текшерүү
           System.out.println("Single Animal Array contains: " + singleAnimalArray[0].getClass().getSimpleName());

//    Animal деген класс тузунуз жана бир метод кошунуз.
//    Анын 3 наследнигин тузунуз.
//    Shark деген класска attack(), Turtle деген класска swim() жана Eagle деген класска fly() методторун тузосуз.
//    Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин кошунуз.
//    instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун
//    чыгарыныз.
//    Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды болуп оз озунун массивине салыныз.

    }
}}}