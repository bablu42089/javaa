package Arrays;
import java.util.*;
public class SumofArrayElements {
    public static void main(String[] args) {
        System.out.print("enter length of arr:");
      //  int arr[]=new int[length];
        Scanner sc=new Scanner(System.in);
        int length= sc.nextInt();
        int arr[]=new int[length];
        int count=0;
        while(sc.hasNextInt()&& count<length)
        {
            arr[count]=sc.nextInt();
            count++;
        }
//        //enhanced for loop
//        //int i=0;
//        int sum=0;
//        for(int  i:arr)
//        {
//            sum+=i; // here i is directly storing the vales of arr[i]
                     //and you can also mention arr[i] instead id i in sum+=i
//        }
//        System.out.println(sum);
        // by using nrml for loop
//        int sum=0;
//        for (int i = 0; i < arr.length; i++) {
//            sum+=arr[i];
//        }
//        System.out.println(sum);
//
        // by using stream class and sum in built method
        int sum= Arrays.stream(arr).sum();
        System.out.println(sum);
    }

}
