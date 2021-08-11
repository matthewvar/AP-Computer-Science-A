public class Sale extends Transaction
{

   private double discountPercentage;
   private double totalDiscount;
   
   
   public Sale(String description, int quantity, double cost, double percentage){
     super(description,quantity,cost);
     discountPercentage=percentage;
     totalDiscount=calculateDiscount(cost,quantity);
      
  } 
  
   public double calculateDiscount(double cost, int quantity){
     return ((cost*quantity)*(discountPercentage));
   }
   
 
   public double getTotal(double cost, int quantity){
     return super.getTotal()-totalDiscount;
   
   }
   
 
   public String toString(){
      return (super.toString() + "\nDiscount Savings   : " + totalDiscount); 
   }
   }
   
  