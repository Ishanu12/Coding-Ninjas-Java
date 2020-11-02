import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=n;
        while(i>=1)
        {
            // int spaces=1;
            // while(spaces<=n-i)
            // {
            //     System.out.print(" ");
            //     spaces=spaces+1;
            // }
            int j=1;
            while(j<=i)
            {
                System.out.print(i);
                j=j+1;
            }
            System.out.println();
            i=i-1;
        }
	}

}
