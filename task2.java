import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("The number of subjects: ");
        int numSub = scanner.nextInt();
        
        int[] marks = new int[numSub];
        int total = 0;
        
        
        for(int i = 0; i < numSub; i++) {
            System.out.print("Marks obtained in subject " + (i+1) + " (out of 100): ");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }
        
        
        double avgPer = (double) total / numSub;
        
        
        String grade = Grade(avgPer);
        
        
        System.out.println("\n<<< Results >>>");
        System.out.println("Total Marks: " + total);
        System.out.printf("Average Percentage: %.2f%%\n", avgPer);
        System.out.println("Grade: " + grade);
    }
    
    private static String Grade(double percentage) {
        if(percentage >= 90) {
            return "A+";
        } else if(percentage >= 80) {
            return "A";
        } else if(percentage >= 70) {
            return "B";
        } else if(percentage >= 60) {
            return "C";
        } else if(percentage >= 50) {
            return "D";
        } else if(percentage >= 40) {
            return "E";
        } else {
            return "F";
        }
    }
}
