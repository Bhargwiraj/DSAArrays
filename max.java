import java.util.*;
public class max {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=sc.nextInt();
    int [] array=new int[n];
   
    System.out.println("enter the numbers");
    for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
    }
      int max=array[0];
    System.out.println("print max no");
    for(int i=0;i<n;i++){
        if(array[i]>max){
            max=array[i];
        }
    }
    System.out.println(max);
}
}
