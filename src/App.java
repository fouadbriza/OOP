public class App {
    public static void main (String[] args) {
        /*Car car1 = new Car("toyota");
        String brand = car1.getbrand();
        System.out.println(brand);
        car1.setbrand("bmw"); 
        System.out.println(car1.getbrand()); */

        Point a = new Point(2,3);
        a.display();
        a.move(1,1);
        a.display();
        a.move(1);
        a.display();
        Point z = new Point(2,3);
        Point y = new Point(2,3);
        System.out.println("num of points created: "+ Point.numPoints);
        
        Circle c= new Circle(1,1,3);
        c.display();
        c.move(2);
        c.display();
        c.move(1,1);
        c.display();


        
    }
}




