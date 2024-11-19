import java.util.Scanner;

public class ForMultiples03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int multiple, sum = 0, counter = 0, average;
        System.out.print("Input the multiple: ");
        multiple = input.nextInt();
        for (int i = 1; i <= 50; i++) { //any of number that fulfil the criteria will follow the next line code in this  
            if (i % multiple == 0) { //if the following criteria was fulfil the previous state, it continue to this code (enter to the starting loop)
                sum = sum + i; //The sum was added with "i" that make a new sum
                counter++; // the counter will added by 1 every loop that happened
                
            }
        }
        System.out.printf("There are %d number that are multiple of %d in range 1 to 50. \n", counter, multiple);
        System.out.printf("The sum of all multiples of %d in range 1 to 50 is %d. \n", multiple, sum);
        average = sum / counter;
        System.out.print("The average is " +average);
        
        input.close();
    }
}
