import java.util.Scanner;
import java.lang.Math;
public class Solution {

	public static void printFahrenheitTable(int start, int end, int step) 
    {
		int s=0;
        int i=start;
        while(i<=end)
        {
            s=(int)((5.0/9)*(i-32));
            System.out.println(i+" "+s);
            i=i+step;
        }
	}
}