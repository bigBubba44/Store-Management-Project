import java.util.Scanner;
public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object/Prints in console log
    Scanner input = new Scanner(System.in);
  ToyCars nice = new ToyCars();
 HotWheels car = new HotWheels("customer 1", true, 1.99, "Porsche", 1);
//prints to console log
    System.out.println ("Welcome to my Toy Store! I sell Hot Wheels and other collectibles!");
    System.out.println("---Hot Wheels---");
    System.out.println("Item designated for: " + car.getName());
    System.out.println("Car Brand of the HotWheel: " + car.getBrand());
    System.out.println("Amount of Hot Wheels purchased: " + car.getGroup());
    System.out.println("Price of Hot Wheels: " + car.getPrice());
    System.out.println(car);
    System.out.println(nice);

    // Closes the Scanner object
    input.close();
  }
}