import java.util.Scanner;

// Palindrome Number:
// - A number which looks same in both directions 
//   (forward and backward) is called a Palindrome.

// - Example: 
//            131 → forward = 121, backward = 121 → Palindrome
//            123 → forward = 123, backward = 321 → Not Palindrome
class Palindrome
{
    public static void main(String args[])
    {
        int n,s=0,c,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a NUmber That you have to Check");
        n = sc.nextInt();
         c=n;
        while (n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(c==s)
        {
            System.out.println("The Number is Palindrome");
        }
        else{
            System.out.println("The Number is Not Palindrome");
        }
    }
}