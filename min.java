import java.util.*;
public class min {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int [] array=new int[n];
        System.out.println("Enter the elements in array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();

        }
        int min=array[0];
System.out.println("Printing the min number");
for(int i=0;i<n;i++){
    if(array[i]<min);
    min=array[i];
}
System.out.println(min);
    }
}
