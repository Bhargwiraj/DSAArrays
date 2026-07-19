import java.util.*;
public class basics{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter size of arrays");
        int n=sc.nextInt();
        int [] a1= new int[n];
        System.out.println("Enter number in arrays");
        for(int i=0;i<n;i++){
               a1[i]=sc.nextInt();
        }
        System.out.println("Print the numbers");
        for(int i =0;i<n;i++){
            System.out.println((a1[i]*2)+" ");
        }
    }
}