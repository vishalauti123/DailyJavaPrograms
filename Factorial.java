import java.util.Scanner;
class Factorial{
    public static void  main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        long fact=1;
        for(int i=1;i<=n;i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial of "+ n +" = " + fact);
    }
}

/*
Factorial of a Number:
- Factorial means multiplying a number with all numbers below it.
- Formula: n! = n × (n-1) × (n-2) × ... × 1
- Example: 5! = 5 × 4 × 3 × 2 × 1 = 120
- Special case: 0! = 1
*/