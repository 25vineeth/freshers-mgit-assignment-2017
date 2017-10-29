package com.mycompany.app;
import java.util.*;
public class App extends Thread
{  
        Menu customer = new Menu(); 
public void run(){
        
        try{
        Thread.sleep(5000);
        Scanner in=new Scanner(System.in);
        System.out.print("Give your order (Enter The ItemNO) :");
       // new OrderDish(customer.order(in.nextInt()));   
        int Itemno = in.nextInt();
        new OrderDish(customer.getItemName(Itemno));
        
        new OrderDish(customer.getItemPrice(Itemno)); 
        }catch(Exception e)
        {
            System.out.println(e);
        }        
              
}      
//Public HashMap<Integer,MenuItem> Dish= new HashMap<Integer,MenuItem>();
    public static void main( String[] args )
    {
       
     App c1=new App();
     App c2=new App();
     c1.start();
     c2.start();     
    }
    
}