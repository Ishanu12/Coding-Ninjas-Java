import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n)
        {
            int spaces=1;
            while(spaces<=n-i)
            {
                System.out.print(" ");
                spaces=spaces+1;
            }
            int x=i;
            int j=1;
            while(j<=i)
            {
                System.out.print(x);
                x=x+1;
                j=j+1;
            }
            int k=x-2;
            while(k>=i)
            {
                System.out.print(k);
                k=k-1;
            }
            System.out.println();
        	i=i+1;
        }
    }
}
