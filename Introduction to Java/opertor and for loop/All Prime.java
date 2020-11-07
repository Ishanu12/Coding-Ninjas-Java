import java.util.Scanner;
public class Solution {

	public static void main(String[] args) 
    {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
        
        System.out.println("2");
        for(int i=3;i<=n;i++)
        {
            int count=0;
            //System.out.println("*");
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                	count++;
                }
            }
            if(count==0)
            {
                System.out.println(i);
            }
            //continue;
        }
	}
}