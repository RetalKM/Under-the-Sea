/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package under.the.sea2;

//import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author retalmalki
 */
public class invoice extends menu {
    private double[] pri=new double[3];
    private double[] pri2;
    
    
   public void ordar(){
            System.out.println("\nWhat you like to chose from Main dishes?");
        ord1.add(0,kb.next());
        CheckArray();
        System.out.println("And how much from it?");
       ord2.add(0,kb.nextInt());
        System.out.println("ok, and from Side dishes?");
        ord1.add(1,kb.next());
        CheckArray();
        System.out.println("And how much from it?");
        ord2.add(1,kb.nextInt());
        System.out.println(" All raight, and your favorite drink?");
        ord1.add(2,kb.next());
        CheckArray();
        System.out.println("And how much from it?");
        ord2.add(2,kb.nextInt());
            String choice;
        do{
               System.out.println("Do you want to add something?");
            choice=kb.next();
            String choice2=choice;
            for(int k=3;choice2.equalsIgnoreCase("yes");k++,choice2="no"){
                System.out.println("what it's ?");
            ord1.add(k,kb.next());
            System.out.println("How many ?");
            ord2.add(k,kb.nextInt());
            }
            }while(choice.equalsIgnoreCase("yes"));
           // }
            
       // }
       Check();
       
       
    }
   public void CheckArray(){
       
       for(int or=0;or<5;or++){
            for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            String d=getrealmenue(i).trim();
        if((ord1.get(or).equalsIgnoreCase(d))){
           return;
        }
        else 
            System.out.println(ord1.get(0)+", is not found in our menue!\n  Pleas try again:");
                ord1.set(0, kb.next());
        }
            }
       }
   }
            
   
   public void Check(){
       System.out.println("executing check function");
       for(int or=0;or<ord1.size();or++){
            for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        if(ord1.get(or).equalsIgnoreCase(getrealmenue(i))){
           System.out.println("printing orders");
            pri[or]= getprice(i)*(ord2.get(or));      
        }
        
        }
            //System.out.println(getrealmenue(i,j)+", is not in our menue!.\n p");
            } 
            }
        
       System.out.println("your order and the quantity of each order: ");
       System.out.println(ord1);
       System.out.println(ord2);
       fatora();
        
   }
   
   public void fatora( ){
    
     massage name=new massage();
    Random ra=new Random();
        int ranum=ra.nextInt(100)+50;
        System.out.println("So, that your bill:");
        System.out.println("\t_________________________________\n\t|\t --------------\t  |\n\t|\t | "+name.getname()+"'s Bills \t|\t|\n\t|\t --------------\t\t|\n\t|\tyour number is: "+ranum+"\t|");
        System.out.println("\t|\t\t\t\t|\n\t|\t------------------\t|\n\t|\t\t\t\t|");
        System.out.println("\t|   "+ord1.get(0)+"  "+ord2.get(0)+"  "+pri[0]+"|\n\t|   "+ord1.get(1)+ "  "+ord2.get(1)+"  "+pri[1]+"\t|\n\t|   "+ord1.get(2)+"  "+ ord2.get(2)+"  "+pri[2]+"\t|");
        System.out.println("\t|   Total\t  "+(ord1.get(0))+"\t|\n\t|\t\t\t\t|\n\t|\t------------------\t|");
        
        System.out.println("\t|\t     ENGOY(:     \t|\n\t|\t\t\t\t|\n\t_________________________________");
        evaluation eval=new evaluation();
        eval.evalm1();
       
    }
    
}
