import java.util.Scanner;

/*
Armstrong Number:
- A number is called Armstrong if the sum of its digits 
  raised to the power of number of digits is equal to the number itself.

- Example 1: 153
   1³ + 5³ + 3³ = 1 + 125 + 27 = 153 → Armstrong

- Example 2: 9474
   9⁴ + 4⁴ + 7⁴ + 4⁴ = 9474 → Armstrong

- Example 3: 123
   1³ + 2³ + 3³ = 36 ≠ 123 → Not Armstrong
*/
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n, sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        if (sum == original)
            System.out.println(original + " is an Armstrong Number");
        else
            System.out.println(original + " is Not an Armstrong Number");
    }
}
