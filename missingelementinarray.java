import java.util.*;
public class missingelementinarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        //if you are take n as size of array than use (n+1)*(n+2)/2;
        //if array size is n*(n+1)/2;
        int n=sc.nextInt();
        int [] array=new int[n];
        int nsum=(n+1)*(n+2)/2;
        int sum=0;
        int result=0;
        System.out.println("Enter the elements in array");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Missing number is:");
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
         result=nsum-sum;
        System.out.println(result);
         }
}
