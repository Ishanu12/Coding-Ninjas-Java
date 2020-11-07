import java.util.Scanner;
import java.lang.Math;
public class Main {
	
	public static void main(String[] args) 
    {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int prev=s.nextInt();
        int cur;
        boolean isDec=true;
        for(int i=1;i<n;i++)
        {
            
            cur=s.nextInt();
            if(prev==cur)
            {
                System.out.println("false");
                return;
            }
            else if(cur<prev)
            {
                if(isDec==false)
                {
                    System.out.println("false");
                    return;
                }
                
            }
            else
            {
                if(isDec==true)
                {
                	isDec=false;
                }
            }
            prev=cur;
        }
        System.out.println("true");
	}
}
