import java.util.*;
//public class NoofSetBits3 {
//    public static void main(String[] args) {
//        int arr[]=new int [7];
//        int i=0;
//        for(i=0;i<=6;i++)
//        {
//            int offset=1;
//            int mul=offset*2;
//            if(mul==i)
//            {
//                offset=i;
//            }
//            else
//            {
//                arr[i]=1+arr[i-offset];
//            }
//        }
//        for (i=0;i<=6;i++)
//        {
//            System.out.println(arr[i]);
//        }
//    }
//}
public class NoofSetBits3 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        n=sc.nextInt();
        int arr[] = new int[n];
        int offset = 1;
        for (int i = 1; i < n; i++)
        {
            if (offset * 2 == i) {
                offset = i;
            }
            arr[i] = 1 + arr[i - offset];
        }
        for (int i = 0; i < n; i++)
        {
            System.out.println("for "+i+" no of set bits= "+arr[i]);
        }
    }
}
