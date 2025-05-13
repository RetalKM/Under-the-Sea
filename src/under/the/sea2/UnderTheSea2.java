/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package under.the.sea2;
import java.util.Scanner;
/**
 *
 * @author retalmalki
 */
public class UnderTheSea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner kb=new Scanner (System.in);
        massage obj1=new massage();
        obj1.massagem();
        System.out.println(obj1.tostringm());
         obj1.setname(kb.next());
        
        if(obj1.getname().equalsIgnoreCase("bsho")){
           Manager b=new Manager();
           b.manager();
          try{
           switch (b.getch()){
               case 1:
                   b.orderlestandsurvey();
                   break;
               case 2:
                   b.invouice();
                   break;
               case 3:
                   b.employees();
                   break;
               case 4:
                   b.orderlestandsurvey();
                   
                   b.invouice();
                   b.employees();
                   break;
               default :
                  throw new Exception ("sorry the number is wrong");
                   
           }
          }
         catch(Exception e){
                 System.out.println(e.getMessage());
                  System.out.println("please try agin");
                 }
          
        }else if(obj1.getname().equalsIgnoreCase("Hind")){
        }
        else{
            menu m=new menu();
            m.menua();
           
        }
        obj1.massagem2();
        
    }
       }

