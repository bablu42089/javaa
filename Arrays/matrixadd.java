package Arrays;
import java.util.*;
public class matrixadd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,r1,c1,r2,c2;
        System.out.print("enter no. rows of matrix 1:");
        r1=sc.nextInt();
        System.out.print("enter no. cols of matrix 1:");
        c1=sc.nextInt();

        System.out.print("enter no. rows of matrix 2:");
        r2=sc.nextInt();
        System.out.print("enter no. cols of matrix 2:");
        c2=sc.nextInt();

        int arr1[][]=new int[r1][c1];
        System.out.println("enter elements of matrix1:");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        //
        int arr2[][]=new int[r2][c2];
        System.out.println("enter elements of matrix2:");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }

        int result[][]=new int[r1][c2];
        for ( i = 0; i < r1; i++) {
            for(j=0;j<c2;j++)
            {
                result[i][j]=arr1[i][j]+arr2[i][j];
            }
        }

        System.out.println("sum of 2 matrices =");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.print(result[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
