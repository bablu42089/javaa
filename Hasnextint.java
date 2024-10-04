import java.util.*;
public class Hasnextint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while (sc.hasNextInt())
        {
            if (sc.hasNextInt())
            {
                int a=sc.nextInt();
              //  int sum=0;
                sum+=a;
            }
            else
            {
                sc.next();
            }
        }
        System.out.println(sum);
    }
}
