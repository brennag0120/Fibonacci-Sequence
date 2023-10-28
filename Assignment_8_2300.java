package Assignment_8;
import java.util.Scanner;

public class Assignment_8_2300 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter an number between 0 and infinity");
        int input=scan.nextInt();
        int a=0;
        int answer=1;
        int c;
        int i;

        if(input ==0){
            answer=0;
        }

        for(i=2; i <= input; i++){
    
            c= a+answer;
            a=answer;
            answer=c;
        }
        
        System.out.println("The Fibonacci number for " + input+ " is " +answer);

    }
}
