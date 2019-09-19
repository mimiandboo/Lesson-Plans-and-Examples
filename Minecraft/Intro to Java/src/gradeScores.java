import java.util.Scanner;

public class gradeScores {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int grade = 0;

        System.out.println("Please enter a number from 0-100");
        grade = scan.nextInt();

        System.out.println(grade);

        if(grade >= 90){
            System.out.println("A");
        }
        else if(grade >= 80){
            System.out.println("B");
        }
        else if(grade >= 70){
            System.out.println("C");
        }
        else if(grade >= 60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}
