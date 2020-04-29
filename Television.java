
package lab5;


/** 
 *Book Question 56.
 * @author Nirdesh
 */
public class Television {
  
  private String brand;
  private double price;
  
  public Television() {}
  
  public Television(String brand) {
    this.brand = brand;
  }
  public Television(String brand, double price) {
	  this.brand = brand;
	  this.price = price;
  }  
  public String getBrandName() {
	  return brand;
  }
  public void setBrandName(String brandName) {
	  this.brand = brandName;
  }
 
  public void setPrice(double Price) {
	  this.price = Price;
  }
  
  public double getPrice() {
    return price;
  }
  
  public void printPrice() {
		System.out.println("the television's price is: " + getPrice() );
  }
  public String toString(){
        return("Your television is " + this.brand);
   }
    
  public boolean equals(Television other){
        return brand.equals(other.brand);
   }
}
  