import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int userInput;
        boolean flag = true;

        while(flag){
            System.out.println("Please give me a test score");
            userInput = scan.nextInt();

            if(userInput >= 90){
                System.out.println("You got an A!");
            }
            else if(userInput >= 80){
                System.out.println("You got an B!");
            }
            else if(userInput >= 70){
                System.out.println("You got an C!");
            }
            else if(userInput >= 60){
                System.out.println("You got an D!");
            }
            else{
                System.out.println("You got an F!");
            }

            System.out.println("Do you have more test scores?\n1 for yes, 0 for no");
            userInput = scan.nextInt();

            if(userInput == 0){
                flag = false;
            }
        }

        System.out.println("Thank you for your test scores!");
    }
}
