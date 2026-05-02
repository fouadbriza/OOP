public class Fonctionnaire implements AugmentationSalaire {

    public String name;
    public String  firstName;
    public double  salary;

    public void Fonctionnaire(String name, String firstname,int salary) {
        this.name = name;
        this.firstName = firstname;
        this.salary = salary;
    }

    public boolean equals(Object f) {
        if(this.name.equals(((Fonctionnaire) f).name) && this.firstName.equals(((Fonctionnaire) f).firstName)) {
            return(true);
        }
        return false;
        
    }
    
}
