/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author 18M01ACS037
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //display program
        System.out.println("NO\t  CATEGORY");
        System.out.println("1\t  GREATEST");
        System.out.println("2\t  LEAST");
        System.out.println("3\t  SUM");
        //propmt userv for three numbers
        //declare variables
        int x;
        int y;
        int z;
        int menuno;
        //import package
        System.out.print("please enter value A:");
        Scanner input=new Scanner(System.in);
                  x =input.nextInt();
        System.out.print("please enter value B:");
                  y=input.nextInt();
        System.out.print("please enter value C:");
                   z=input.nextInt();
                   //DECLARE VARIABLES
               int sum=x+y+z;
              
               
               
               //prompt user
           System.out.println("Choose NO to find the CATEGORY you want;");
               menuno=input.nextInt();
         switch(menuno){
             case 1:{
                  if(x>y&&x>z)
                      System.out.println("you choose GREATEST="+x);
                  else if(y>x&&y>z)
                      System.out.println("you choose  GREATEST="+y);
                  else if(z>x&&z>y) 
                     System.out.println("you choose  GREATEST="+z);
                  else
                      System.out.println("INVALID");
             }
                 break;
             case 2:{
                 if(x<y&&x<z)
                      System.out.println("you choose LEAST="+x);
                  else if(y<x&&y<z)
                      System.out.println("you choose LEAST="+y);
                  else if(z<x&&z<y) 
                     System.out.println("you choose LEAST;="+z);
                  else
                      System.out.println("INVALID ENTRY");
                  
             }
                  break;
             case 3:
                 System.out.println("You Choose SUM equal to . "+sum);
                  break;
             default:
                 System.out.println(" your choice must be 1 ,2 or 3");
                     
                 
                             
                             
                             
                    
                 
             }
             }
         }       


    
    

