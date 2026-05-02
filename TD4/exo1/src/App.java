import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        //Set<Animal> animals = new HashSet<>();
        Set<Animal> animals =  new TreeSet<>();
        Animal dog = new Animal("dog");
        Animal cat1 = new Animal("cat");
        Animal cat2 = new Animal("cat");
        Animal cat3 = new Animal("cat");
        Animal lion = new Animal("lion");

        animals.add(dog);
        animals.add(cat1);
        animals.add(cat2);
        animals.add(cat3);
        animals.add(lion);

        Iterator<Animal> it = animals.iterator();

        while(it.hasNext()) {
            System.out.println("animal:"+ it.next().getName());
        }
        

        System.out.println("--/:"+ dog.equals(cat1) );





    }
}
