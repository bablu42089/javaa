import java.io.*;
import java.util.*;
public class practice {




        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            int n=0;
            int sum=0;
            int arr[]=new int[10];
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();

            }
         //   arr=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                sum+=arr[i];
            }
            System.out.println(sum);
        }
    }

