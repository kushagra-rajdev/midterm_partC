/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import javax.swing.*;
import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * date 30/20
 * @modifier Kushagra Rajdev
 */
public class Arithmetic 
{
     public double doCalc(double num1,double num2,KUSHAGRA_operationType op)
    {
        switch (op)
        {
            case 1:
                return num1+num2;
            case 2:
                return num1-num2;
            case 3:
                return num1*num2;
            case 4:
                return num1/num2;
            default:
                System.out.println("Error Wrong Arithmetic Operation");;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      double num1,num2;
      int ope;
              
        Scanner in= new Scanner(System.in);
        System.out.println("enter num1");
        num1 = in.nextDouble();
        System.out.println("enter num2");
        num2 = in.nextDouble();
        System.out.println("Enter\n 1 for Addition\n 2 for Subtraction\n 3 for Multiplication\n 4 for Division");
        ope = in.nextInt();
        Arithmetic calc = new Arithmetic();
           switch (ope){
               case 1:
                   JOptionPane.showMessageDialog(null,calc.doCalc(num1,num2,KUSHAGRA_operationType.PLUS));
                   break;
               case 2:
                   JOptionPane.showMessageDialog(null,calc.doCalc(num1,num2,KUSHAGRA_operationType.MINUS));
                   break;
               case 3:
                   JOptionPane.showMessageDialog(null,calc.doCalc(num1,num2,KUSHAGRA_operationType.TIMES));
                   break;
               case 4:
                   JOptionPane.showMessageDialog(null,calc.doCalc(num1,num2,KUSHAGRA_operationType.DIVIDE));
                   break;
   
           }
            
    }
    
    }