import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);

//--------------------Person------------------------------------
/*      System.out.print("Enter your first name: ");
        String name = sc.nextLine();

        System.out.print("Enter your surname: ");
        String surname = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        Person p1 = new Person(name,surname,age);
        p1.display();
 */ 
//---------------------Teacher-------------------------------------
/*      System.out.print("Enter your Social Security Number: ");
        long socialNum = sc.nextInt();

        String[] modules = new String[30];

        for (int i = 0; i < 5; i++) {
            modules[i] = sc.next();
        }

        Teacher t1 = new Teacher(name,surname,age,socialNum,modules);

        t1.display();
  
*/  
//---------------------Student-------------------------------------
/*        System.out.print("Enter your StudentId: ");
        int studentId = sc.nextInt();

        double[] grades = new double[30];

        for (int i = 0; i < 3; i++) {
            grades[i] = sc.nextDouble();
        }

        Student s1 = new Student(name,surname,age,studentId,grades);

        s1.display();

        

*/ 
 //Part B : g,h 
        Teacher t1 = new Teacher("John", "Doe", 40, 123456789, new String[]{"Math", "Physics", "Chemistry"});

        Teacher t2 = new Teacher("Jane", "Smith", 35, 987654321, new String[]{"Biology", "History", "Literature"});

        Student s1 = new Student("Alice", "Johnson", 20, 1001, new double[]{19, 20, 18});

        Student s2 = new Student("Bob", "Williams", 22, 1002, new double[]{17,18, 19});

        Student s3 = new Student("Charlie", "Brown", 19, 1003, new double[]{18, 20, 20});

        Person[] personArr = {t1, t2, s1, s2, s3};
       for (Person person : personArr) {
            person.display();
            System.out.println();
        }

/*  //Part C q: 3
        for (Person person : personArr) {
            person.displayType();
            System.out.println();
        }
*/

//Part C q:5
        Teacher[] teacherArr = {t1, t2};
        Student[] studentArr = {s1, s2, s3};

        Arrays.sort(teacherArr);
        Arrays.sort(studentArr);
        System.out.println("Sorted Teachers:");
        for (Teacher teacher : teacherArr) {
            teacher.display();
            System.out.println();
        }
        System.out.println("Sorted Students:");
        for (Student student : studentArr) {
            student.display();
            System.out.println();
        }   
        




        sc.close();
    }
}
