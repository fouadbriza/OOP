public class Teacher extends Person implements Comparable<Teacher> {
private long socialSecurityNumber;
private String modules[] = new String[3];

    public Teacher(String name,String surname,int age,long socialnum,String[] modules) {
        super(name,surname,age);
        this.socialSecurityNumber=socialnum;
        for (int i = 0; i < 3 && i < modules.length; i++) {
        this.modules[i] = modules[i];
    }
    }

    public void display() {
        super.display();
        System.out.println("socialsecNum: "+ this.socialSecurityNumber+ "| modules:");
        for (String module: this.modules) {
            System.out.println(" | "+ module);
        }
    }

    public void displayType() {
        System.out.println("I am a teacher.");
    }
    
    public int compareTo(Teacher t) {
        String A = this.name+this.surname;
        String B = t.name+t.surname;
        return A.compareTo(B);
    }
}
