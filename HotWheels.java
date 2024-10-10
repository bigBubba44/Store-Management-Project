public class HotWheels extends ToyCars{

  private String brand;
  private int group;

  public HotWheels(String name, boolean hasSpareTires, double price, String brand, int group) {
    super(price, name, hasSpareTires);
    this.brand = brand;
    this.group = group;
  }
 
  public HotWheels() {
    brand = "Porsche";
    group = 0;
  }
  
  public String getBrand(){
    return brand;
  }
  public void String(String brand){
    this.brand = brand;
  }
  public int getGroup(){
    return group;
  }
  public String toString(){
    return  brand +  " is such a great choice!";
  }
}
