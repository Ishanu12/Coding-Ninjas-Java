import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int n1=(n+1)/2;
        int n2=(n-1)/2;
        while(i<=n1)
        {
            int spaces=1;
            while(spaces<=n1-i)
            {
                System.out.print(" ");
                spaces=spaces+1;
            }
            int j=1;
            while(j<=((2*i)-1))
            {
                System.out.print("*");
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
        int k=n2;
        while(k>=1)
        {
            int spaces=1;
            while(spaces<=n2-k+1)
            {
                System.out.print(" ");
                spaces=spaces+1;
            }
            int j=1;
            while(j<=((2*k)-1))
            {
                System.out.print("*");
                j=j+1;
            }
            System.out.println();
            k=k-1;
        }
    }
}