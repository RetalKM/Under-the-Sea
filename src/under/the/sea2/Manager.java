/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package under.the.sea2;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author retalmalki
 */
public class Manager {
    private static final String[] employees={"Arwaa ","Bshair","Ragad1","Ragad2","Retal ","Roaa  ","Gena  "};
    private static final int[][] g={{1,0},{0,1},{0,0},{0,1},{0,2},{1,0},{4,6}};
    private static final String[] month ={"    jan","  feb"," march"," apr","  may","  Jun"};
    Scanner kb=new Scanner(System.in);
    private int ch;
    public int getch(){
        return ch;
    }
    public void manager(){
        
        System.out.println("Choose:");
        System.out.println("\n\t\t ---\t\t ---\t\t ---\t\t ---\n\t\t| 1 |\t\t| 2 |\t\t| 3 |\t\t| 4 |\n\t\t ---\t\t ---\t\t ---\t\t ---");
        System.out.println("\torder lest & survey\tinvouice\temloyees\t all");
         ch=kb.nextInt();
         //System.out.println();
    }
    Random c=new Random();
    public void orderlestandsurvey(){
        evaluation eval=new evaluation();
        eval.evalma();
        
        System.out.println("\tNumper of people   |   The most things orderd");
        System.out.println("\t     "+c.nextInt(180+40)+"\t    |    -Shrimp\n\t\t\t\t|    -Salad\n\t\t\t\t|    -Rice\n\n");

    }
    public void invouice(){
        int daily;
        daily  =c.nextInt(14000+20000);
        System.out.println("\t\t\t|   Monthly Income  |\t\t\t\t |   Daily Income    |\n\t\t\t_____________________\t\t\t\t _____________________\n\n");
        //invoice h =new invoice();
       // Random r=new Random ();
        /*for(int i=0;i<3;i++){
            daily=h.getpri(i)+r.nextInt(8000+15000);
        }*/
        //System.out.print("\t\t\t\t\t\t\t|  "+daily+"  |");
       for(int y=1,t=75;y<=10&&t>0;y++,t-=10){
           switch(t){
               case 75:
               System.out.println("\t(Persent)\n\t  ^\t\t\t\t\t\t\t\t      |  "+daily+"  |");
               break;
               case 65:
               System.out.println("\t  |\n\t%"+t+"\t\t\t\t\t ");
               break;
               case 55:
               System.out.println("\t  |\t\t\t\t        \n\t%"+t+"\t\t\t\t  /    ");
               break;
               case 45:
               System.out.println("\t  |\t\t\t\t /  \n\t%"+t+"\t\t\t\t/");
               break;
               case 35:
               System.out.println("\t  |\t\t\t       /\n\t%"+t+"\t\t  /\\---------\\/");
               break;
               case 25:
               System.out.println("\t  |\t       /\\/\n\t%"+t+"\t      /");
               break;
               case 15:
               System.out.println("\t  |\t     /\n\t%"+t+"    /----/");
               break;
               case 5:
               System.out.println("\t  |   /\n\t %"+t+"  /");
               break;
           }
       }
           for(int g=-1;g<6;g++){
               if(g<0){
               System.out.println("\t _____ _____ _____ _____ _____ _____ ______( 2023 )");
               System.out.print("\t      '     '     '     '     '     '   \n\t");
               continue;
               }
               System.out.print(" "+month[g]);
    }
           System.out.println("\n\n");
      }
    public void employees(){
        System.out.println("\tName\tAbsences  -$\tlate  -$");
        for (int i =0,j=0;i<employees.length&&i<g.length;i++) {
            System.out.print("\t" + employees[i]+" |");
            System.out.printf("%4d",g[i][j]);
            System.out.print("    ");
            if(g[i][j]>0)
                System.out.print("-"+g[i][j]*100+"$");
            else
                System.out.print("     ");
            j++;
            System.out.printf("%6d",g[i][j]);
            if(g[i][j]>0)
                System.out.print("  -"+g[i][j]*50+"$");
            j--;
            System.out.println();
        }
        
    }
    
}
