import java.util.Scanner;

class NegativeNumberException extends RuntimeException {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Custom_Exce2 {
    public static void checkNumber(int num) {
        if (num < 0) {
            throw new NegativeNumberException("Number cannot be negative!");
        }
        System.out.println("Valid number: " + num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            checkNumber(num);
        } catch (NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

