package Arrays;
import java.util.*;
public class matrixmul {
    public static void main(String[] args) {
        int i,j,sum=0,m,n,p,q,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows and cols of first matrix:");
        m=sc.nextInt();
        n=sc.nextInt();

        int a[][]=new int[m][n];
        System.out.println("enter rows and cols of 2nd matrix:");
        p=sc.nextInt();
        q=sc.nextInt();
        int b[][]=new int[p][q];
        int c[][]=new int[m][q];
        System.out.println("enter values of matrix 1");
        for (i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }

        System.out.println("enter values of matrix 2");
        for (i=0;i<p;i++)
        {
            for(j=0;j<q;j++)
            {
                b[i][j]= sc.nextInt();
            }
        }

        System.out.println("first matrix elemnts:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println("second  matrix elemnts:");
        for(i=0;i<p;i++)
        {
            for(j=0;j<q;j++)
            {
                System.out.print(b[i][j]+"  ");
            }
            System.out.println();
        }


        if(n!=p)
        {
            System.out.println("you cant multiply both");
        }
        else
        {
            for(i=0;i<m;i++)
            {
                for(j=0;j<q;j++)
                {
                    for(k=0;k<n;k++)
                    {
                        sum = sum + a[i][k]*b[k][j];
                    }
                    c[i][j]=sum;
                }
            }
        }

        System.out.println("resultant matrix:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<q;j++)
            {
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }


    }
}
