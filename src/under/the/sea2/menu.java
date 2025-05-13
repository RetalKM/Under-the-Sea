/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package under.the.sea2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author retalmalki
 */
public class menu {
    private static final ArrayList<Double>price=new ArrayList(8);//{{45,25,3},{60,15,3},{30,7,3}};
    private static final ArrayList<String >realmenue=new ArrayList<String>(8);//{{"Shrimp        ","salad         ","pepsi"},{"fish          ","botatoes      ","7up"},{"rice          ","sauce         ","mirinda"}};
    public ArrayList<String> ord1=new ArrayList<String>(10);
    public ArrayList<Integer> ord2=new ArrayList<Integer>(10);
    
    Scanner kb=new Scanner (System.in);
public double getprice(int i){
    return price.get(i);
}
public String getrealmenue(int i){
    return realmenue.get(i);
}
public void menue2(){
    realmenue.add(0,"Shrimp"); realmenue.add(1,"Salad");realmenue.add(2,"Pepis");realmenue.add(3, "Fish");realmenue.add(4, "Botatoes");realmenue.add(5, "7up");realmenue.add(6, "Rice");realmenue.add(7,"Sauce " );realmenue.add(8, "Mirinda");
    price.add(0,45.0);price.add(1,25.0);price.add(2, 3.0);price.add(3, 60.0);price.add(4, 15.0);price.add(5, 3.0);price.add(6, 30.0);price.add(7, 7.0);price.add(8, 3.);
}
public void menua(){
          
        System.out.println("That's our menue:");    
        System.out.println("\t\t\t\tUnder The Sea: ");
       System.out.print("\tMain dishes\tprice\tSide dishes\tprice\tDrinks\tprice \n\t");
        for(int count=0;count<9;count++){
                System.out.print(realmenue.get(count)+"\t"+price.get(count)+"$\t");
            
        System.out.print("\n\t");
        
        }
        invoice order=new invoice();
        order.ordar();
    }
    
    
}
