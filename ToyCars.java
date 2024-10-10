public class ToyCars{
  //Instance Variables
 
    private String name;
    private boolean hasSpareTires;
    private double price;
 
  //no-argument
 
    public ToyCars() {
      name = "null";
      hasSpareTires = false;
      price = 1.99;
    }

  //parameterize
 
    public ToyCars(double price, String name, boolean hasSpareTires) {
      this.price = price;
      this.name = name;
      this.hasSpareTires = hasSpareTires;
    }
 
    public String getName() {
      return name;
    }
 
    public void getName(String name) {
      this.name = name;
    }

    public boolean getHasSpareTires() {
      return hasSpareTires;
    }

    public double getPrice() {
      return price;
    }
  //toString part
    public String toString() {
      return "Thank you for shopping in my store!" ;
   }
}