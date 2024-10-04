import java.util.Scanner;
public class noOfSetBits2 {
    //int count=0;
    public void Setbit(int n)
    {
        int count=0;
        while(n>0)
        {
            if((n&1)==1)
            {
                count++;
            }
            n=n >> 1;
        }
      //  return count;
        System.out.println("no of set bits="+count);

    }

    public static void main(String[] args) {
        int a=0;
        System.out.print("enter a number:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        noOfSetBits2 b=new noOfSetBits2();
        b.Setbit(a);


    }

}
