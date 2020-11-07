import java.util.Scanner;
public class Solution {


	public static void main(String[] args) 
    {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0;
        int b=1;
        if(n==0)
        {
            System.out.println(a);
        }
        int c;
        for(int i=2;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(b);
        
	}

}