import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        //Set<Animal> animals = new HashSet<>();
        Set<Animal> animalSet =  new TreeSet<>();
        Animal dog = new Animal("dog");
        Animal cat1 = new Animal("Cat");
        Animal cat2 = new Animal("cat");
        Animal cat3 = new Animal("Camel");
        Animal lion = new Animal("lion");

        animalSet.add(dog);
        animalSet.add(cat1);
        animalSet.add(cat2);
        //animalSet.add(cat3);
        animalSet.add(lion);

        Iterator<Animal> it = animalSet.iterator();

        while(it.hasNext()) {
            System.out.println("animal:"+ it.next().getName());
        }
        

        System.out.println("--/:"+ dog.equals(cat1) );

        System.out.println("-----------PART2-----------");


        List<Animal> animalList = new ArrayList<>(animalSet);

        animalList.add(cat1);
        animalList.add(cat2);
        animalList.add(cat3);

        animalList.add(cat1);
        animalList.add(cat1);


        for (int i = 0; i < animalList.size(); i++) {
            System.out.println("--"+animalList.get(i).getName());
        }

        System.out.println("All animals with names starting with 'C':");

        Animal.allNamesC(animalList);
        System.out.println("\nSorted:");
        Collections.sort(animalList);
        
        for (int i = 0; i < animalList.size(); i++) {
            System.out.println(animalList.get(i).getName());
            
        }
        
    System.out.println("--------------------Part 3--------------------");

    Map<Tattoo,Animal> AnimalTatooMap = new HashMap<>();
    AnimalTatooMap.put(new Tattoo(dog.getName()),dog);
    AnimalTatooMap.put(new Tattoo(cat1.getName()),cat1);
    AnimalTatooMap.put(new Tattoo(cat2.getName()),cat2);
    AnimalTatooMap.put(new Tattoo(cat3.getName()),cat3);
    AnimalTatooMap.put(new Tattoo(lion.getName()),lion);

    Iterator<Map.Entry<Tattoo,Animal>> it2 = AnimalTatooMap.entrySet().iterator();

    while(it2.hasNext()) {
        Map.Entry<Tattoo,Animal> entry = it2.next();
        System.out.println(entry.getKey().getTattoo() +" : " +entry.getValue().getName());
        

    }



    }
}
