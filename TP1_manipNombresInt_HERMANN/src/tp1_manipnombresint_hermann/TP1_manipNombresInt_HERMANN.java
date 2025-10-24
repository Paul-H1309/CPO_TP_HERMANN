/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_hermann;

import java.util.Scanner;

/**
 *
 * @author paulh
 */
public class TP1_manipNombresInt_HERMANN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int variable1;
        int variable2;      
        System.out.print("entrer le premier entier :");         
        variable1=sc.nextInt();
        System.out.print("entrer le dexième entier :"); 
        variable2=sc.nextInt();
        System.out.println("Vous avez saisie :"+ variable1 + "et" + variable2);
        int ad;
        ad=variable1+variable2;
        System.out.println(ad);
        int so;
        so=variable1-variable2;
        System.out.println(so);
        int mu;
        mu=variable1*variable2;
        System.out.println(mu);
        float di;
        if(variable2!=0){
        di=variable1/variable2;
        int reste=variable1%variable2;
        System.out.println(di);
        System.out.println(reste);
        }else{
            System.out.println("Faux");
        }
        
        
        
        
        
        sc.close();
    }
    
}
