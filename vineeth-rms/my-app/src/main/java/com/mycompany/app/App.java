package com.mycompany.app;
import java.util.*;

public class App 
{  
//Public HashMap<Integer,MenuItem> Dish= new HashMap<Integer,MenuItem>();
    public static void main( String[] args )
    {
        Menu customer = new Menu();
        Scanner in=new Scanner(System.in);
        System.out.print("Give your order (Enter The ItemNO) :");
       // new OrderDish(customer.order(in.nextInt()));   
        int Itemno = in.nextInt();
        new OrderDish(customer.getItemName(Itemno));
        new OrderDish(customer.getItemPrice(Itemno));        
    }
    
}
