import java.util.Scanner;

public class OddPrime {

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // number is not a prime
            }
        }
        return number > 1; // number is prime
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        if(n % 2 == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
            if(isPrime(n)) {
                System.out.println(n + " is Prime");
            }
        }
    }

}

