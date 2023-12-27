ke
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int counter = 0;

        while(true){
            System.out.println("Give a number: ");
            int input = Integer.parseInt(scanner.nextLine());

            if(input == 0){
                break;
            }

            total += input;
            counter++;
        }

        System.out.println("Average of the numbers: " + (1.0 * total/counter));
    }
}
