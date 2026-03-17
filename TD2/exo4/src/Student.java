public class Student extends Person implements Comparable<Student> {
private int studentId;
private double grades[] = new double[3];

    public Student(String name,String surname,int age,int studentId,double[] grades) {
        super(name,surname,age);
        this.studentId=studentId;
        for (int i = 0; i < 3 && i < grades.length; i++) {
        this.grades[i] = grades[i];
    }
    }

    public void display() {
        super.display();
        System.out.println("studentId: "+ this.studentId+ "| grades:");
        for (double grade: grades){
            System.out.println(" | "+ grade);
        }
    }

    public double calculateAverage()   {
        return((grades[0]+grades[1]+grades[2])/3);
    }  

    public void displayType() {
        System.out.println("I am a student.");
    }


    public int compareTo(Student s) {
        return (-1*Double.compare(this.calculateAverage(), s.calculateAverage()));
    }
}