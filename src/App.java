public class App {
    public static void main (String[] args) {
        Car car1 = new Car("toyota");
        String brand = car1.getbrand();
        System.out.println(brand);
        car1.setbrand("bmw"); 
        System.out.println(car1.getbrand());

        
    }
}




