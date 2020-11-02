import java.util.Scanner;
import java.lang.Math;
public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int basic=s.nextInt();
        String str=s.next();
        char grade=str.charAt(0);
        double hra=(0.2*basic);
        double da=(0.5*basic);
        double allow=0;
        double pf=((11.0/100)*basic);
        if(grade == 'A')
        {
            allow=1700;
        }
        else if(grade=='B')
        {
            allow=1500;
        }
        else
        {
            allow=1300;
        }
        double total=(basic+hra+da+allow)-pf;
        int x=(int)(total);
        if((total-x)>0.5)
        {
            x=x+1;
        }
        System.out.println(x);
	}
}
