/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idtech;
import java.util.Scanner;

/**
 *
 * @author mia
 */
public class IDTech {
    static boolean flag = true;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float x, y;
        float answer = 0;
        char input;
        Scanner scan = new Scanner(System.in);
       
        while(flag){
            System.out.println("Please choose an option:");
            System.out.println("a) addition (x + y)");
            System.out.println("b) subtration (x - y)");
            System.out.println("c) multiplication (x * y)");
            System.out.println("d) division (x / y)");
            System.out.println("e) quit");

            input = scan.next().charAt(0);

           
            switch(input){
                case 'a':
                    System.out.println("Please insert a number for x: ");
                    x = scan.nextFloat();
                    System.out.println("Please insert a number for y: ");
                    y = scan.nextFloat();
                    
                    answer = addition(x, y);
                    break;

                case 'b':
                    System.out.println("Please insert a number for x: ");
                    x = scan.nextFloat();
                    System.out.println("Please insert a number for y: ");
                    y = scan.nextFloat();
                    
                    answer = subtraction(x, y);
                    break;

                case 'c':
                    System.out.println("Please insert a number for x: ");
                    x = scan.nextFloat();
                    System.out.println("Please insert a number for y: ");
                    y = scan.nextFloat();
                    
                    answer = multiplication(x, y);
                    break;

                case 'd':
                    System.out.println("Please insert a number for x: ");
                    x = scan.nextFloat();
                    System.out.println("Please insert a number for y: ");
                    y = scan.nextFloat();
                    
                    answer = division(x, y);
                    break;
                    
                case 'e':
                flag = false;
                System.out.println("Quitting calculator...");
                break;

                default:
                    System.out.println("\nInvalid option. Please select again.\n");
                    answer = -1;
                    break;
            }

            if(flag == false){
                break;
            }
            
            if(answer == -1){
                continue;
            }
            
            System.out.println("Answer: " + answer);
        }
        
    }
    
    public static float addition(float x, float y){
        float answer = x + y;
        
        return answer;
    }
    
    public static float subtraction(float x, float y){
        float answer = x - y;
        
        return answer;
    }
    
    public static float multiplication(float x, float y){
        float answer = x * y;
        
        return answer;
    }
    
    public static float division(float x, float y){
        float answer;
        
        if(y == 0){
            System.out.println("\nError; invalid y value.\n");
            return -1;
        }
        
        answer = x / y;
        return answer;
    }
}