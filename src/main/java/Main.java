import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("input a number please");
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());

        for (int i = 1; i < n; i++) {
            n += i;
        }
        int answer = n;


    }
    int sumOfNumbers(int n) {

        return 0;
    }
    
    // for Extra Credit
    int gaussianSumOfNumbers(int n) {
        return 0;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    
}
