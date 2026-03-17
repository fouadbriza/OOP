abstract public class Person {
    protected String name;
    protected String surname;
    protected int age;

    public Person(String name,String surname,int age) {
        this.name=name;
        this.surname=surname;
        this.age=age;
    }

    public void display() {
        System.out.println("name:"+this.name+" | surname:"+this.surname+" | age:"+this.age);
    }

    abstract public void displayType();
    
}
