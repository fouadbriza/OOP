public class App {
    public static void main(String[] args) {

        try {
            int n = Integer.parseInt(args[0]);

            if (n < 0) {
                throw new Exception("The integer is negative, factorial is undefined");
            }

            if (n > 30) {
                throw new Exception("The entered integer is too large");
            }

            long fact = 1;

            for (int i = 1; i <= n; i++) {
                fact *= i;
            }

            System.out.println("Factorial = " + fact);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide an integer as a command-line argument");

        } catch (NumberFormatException e) {
            System.out.println("The argument must be an integer");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}