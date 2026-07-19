import java.util.*;
public class negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int [] array= new int[n];
        System.out.println("enter the number in array");
        for(int i=0;i<n;i++){
         array[i]=sc.nextInt();
        }
        System.out.println("printing only negative number");
        for(int i=0;i<n;i++){
            if(array[i]<0){
                System.out.println("Negative no"+array[i]);
            }
        }
    }
}
