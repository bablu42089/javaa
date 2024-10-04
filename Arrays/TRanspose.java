package Arrays;
import java.util.Scanner;
public class TRanspose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre no. rows");
        int r= sc.nextInt();
        System.out.println("enter no. of cols:");
        int c= sc.nextInt();
        int i,j;
        int arr[][]=new int[r][c];
        System.out.println("enter the elements of array");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("original matrix is:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //
        System.out.println("transpose matrix is:");
        for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
