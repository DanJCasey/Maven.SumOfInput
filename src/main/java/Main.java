import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("input a number please");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int total = sumOfNumbers(num);

        System.out.println(total);




    }
    static int sumOfNumbers(int n) {
        int sum = 0;

        for (int x = 1; x <= n; x++){
            sum += x;
        }

        return sum;
    }
    
    // for Extra Credit
    int gaussianSumOfNumbers(int n) {
        return 0;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    
}
