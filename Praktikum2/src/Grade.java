import java.util.Scanner;

public class Grade {
    
    public static String grade(int grade) {

        if (grade < 0 || grade > 100) {
            return "Grade must be between 0 and 100";
        }
        if (grade >= 80 && grade <= 100) { 
            return "A";
        } else if (grade >= 73 && grade < 80) { 
            return "B+";
        } else if (grade >= 65 && grade < 73) {
            return "B";
        } else if (grade >= 60 && grade < 65) {
            return "C+";
        } else if (grade >= 50 && grade < 60) {
            return "C";
        } else if (grade >= 39 && grade < 50) {
            return "D";
        } else if (grade >= 0 && grade < 39) {
            return "E";
        }
        
        return "";  
    }
        
    public static void main(String[] args) { 
     
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        int grade = scanner.nextInt();
        System.out.println("Grade: " + grade (grade));
    }
}
