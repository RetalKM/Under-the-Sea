/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package under.the.sea2;
import java.util.Scanner;
/**
 *
 * @author retalmalki
 */
public class evaluation{
    private  double average;
     private double eval1;
     private double eval2;
     Scanner kb=new Scanner (System.in);
    public double getaverage(){
        return average;
    }
    public void evalm1(){
        System.out.println("Rate how it was tread from 1 to 10");
        eval1=kb.nextDouble();
        System.out.println("Rate how good the food was from 1 to 10");
        eval2=kb.nextDouble();
    }
    public void evalma(){
        average=((eval1+eval2)/2)*10;
        System.out.println(average+"%");
       
    }
        
    
}
