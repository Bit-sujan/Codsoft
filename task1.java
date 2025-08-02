import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretNum = (int)(Math.random() * 100) + 1;
        int guessNumber;
        int tries = 0;
        
        System.out.println("There is a number between 1 and 100. Can you guess that number ?");
        
        do {
            System.out.print("Your guess is : ");
            guessNumber = input.nextInt();
            tries++;
            
            if (guessNumber < secretNum) {
                System.out.println("Too low!");
            } else if (guessNumber > secretNum) {
                System.out.println("Too high!");
            }
        } while (guessNumber != secretNum);
        
        System.out.println(" Thats Correct! You got it in " + tries + " tries!");
        input.close();
    }
}
