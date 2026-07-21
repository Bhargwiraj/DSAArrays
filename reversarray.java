import java.util.*;
import java.util.Scanner;
public class reversarray {
    public static void main(String[] args) {
 Scanner sc =new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=sc.nextInt();
    int [] array=new int[n];
   
    System.out.println("enter the numbers");
    for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
    }
    int i=0;
    int j=n-1;
    int swap;
    System.out.println("reverse of array");
    while(i<j){
        //swap code
        swap=array[i];
        array[i]=array[j];
       array [j]= swap;
        i++;
    j--;
    }
     for(int ele:array){
        System.out.print(ele+" ");
     }
    }
}
