/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app;
 import java.util.*;
class MenuItem{
    String Item;
    int Price;
    public MenuItem(String Item,int Price)
    {
        this.Item=Item;
        this.Price=Price;
    }
}
public class Menu{
    
    //public ArrayList<MenuItem> Dish=new ArrayList<MenuItem>();
    HashMap<Integer,MenuItem> Dish= new HashMap<Integer,MenuItem>();
    
    
    public Menu()
    {
        displayMenu();
    }
    public void displayMenu()
    {   
        Dish.put(1,new MenuItem(" WARM SPINACH DIP AND CHIPS ",300));
        Dish.put(2,new MenuItem(" KEY WEST NACHOS ",200));
        Dish.put(3,new MenuItem(" SPICY ONION RINGS ",200));
        Dish.put(4,new MenuItem(" BEEF EMPANADAS ",300));
        Dish.put(5,new MenuItem(" TOSTONES WITH CHICKEN ",250));
        System.out.println(" ------------------------ MENU------------------------------- ");
        System.out.println();
        System.out.println(" ITEMNo--------------------ITEM-----------------------------PRICE");
        System.out.println();
        for(Map.Entry<Integer,MenuItem> entry:Dish.entrySet())
        {
            int key=entry.getKey();
            MenuItem Displayer=entry.getValue();
            System.out.print(key+"           ");
            System.out.print(Displayer.Item+"                ");
            System.out.println(Displayer.Price);
            
        }   
    }
    public String getItemName(int itemno)
    {
        return (Dish.get(itemno).Item);
    }
    public int getItemPrice(int itemno)
    {
        return (Dish.get(itemno).Price);
    }
    
}