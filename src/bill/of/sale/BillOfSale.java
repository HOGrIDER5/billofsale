/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bill.of.sale;

/**
 *
 * @author amsta5248
 */
public class BillOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        double tshirt= 12.49;
        int bill  = 20;
        double tax=0.13;
        
        //algorthim for final total
        
        double total= (tshirt*tax)+ tshirt;
        
        // algorthim for change
        
       double change= bill- total;
       
       // algorthi for total tax
       double totaltax= tshirt* tax;
       
      
     
       System.out.println("I can helpyou right here\n Is that everything?");
       
       System.out.println(" ok, your total is going to be"+ total+"$");
       System.out.println("your totaltax is"+ totaltax+"$");
       System.out.println("your change is "+ change+"$"+"\n thanks for shopping at Walmart");
       
       
   
       
       
       
        
                
       
         
        
        
        
        
        
        
                
      
    }
    
}
