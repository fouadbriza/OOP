public class Animal implements Comparable<Animal> {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Animal a) {
        return(this.name.equals(a.name));
    }

    @Override
    public boolean equals(Object o) {
        Animal a = (Animal) o;
        return(this.name.equals(a.name));
    } 

    @Override
    public int hashCode() {
    return name.hashCode();
    }

    //added it after we switched to treeSet
    
    @Override
    public int compareTo(Animal a) {
        return(this.name.compareTo(a.name));
    }
 
}
