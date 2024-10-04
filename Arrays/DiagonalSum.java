package Arrays;
import java.util.Scanner;
public class DiagonalSum {
    public static void main(String[] args) {
        int i,j,r,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a no. of rows:");
        r=sc.nextInt();
        System.out.print("enter no. of cols:");
        c=sc.nextInt();

        int arr[][]=new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }

        int sum=0;
       for(i=0;i<3;i++)
       {
           sum+=arr[i][i];
           sum+=arr[i][c-i-1];

       }
        if(c%2==1)
        {
            int mid=arr[c/2][c/2];
            sum-=mid;
        }
        System.out.println(sum);
    }
}
