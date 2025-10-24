/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author paulh
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator ");
        System.out.println("1) add ");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        int operateur;
        int operateur1;
        int operateur2;
        int result = 0;
        Scanner sc = new Scanner(System.in);  
        operateur=sc.nextInt(); 
        System.out.println("PLease enter the first number");  
        operateur1=sc.nextInt();  
        System.out.println("Please enter the second number");  
        operateur2=sc.nextInt(); 
        if (operateur==1){
            result=operateur1+operateur2;
        }
        if (operateur==2){
            result=operateur1-operateur2;
        }
        if (operateur==3){
            result=operateur1*operateur2;
        }
        if (operateur==4){
            result=operateur1/operateur2;
        }
        if (operateur==5){
            result=operateur1%operateur2;
        }
        if (operateur!=1||operateur!=2||operateur!=3||operateur!=4||operateur!=5){
        System.out.println ("erreur");
        }
        
    }
    
}
