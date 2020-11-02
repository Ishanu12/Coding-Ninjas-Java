import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        int i=1;
        int power_x=1;
        while(i<=n)
        {
            power_x*=x;
            i=i+1;
        }
        System.out.println(power_x);
    }
}