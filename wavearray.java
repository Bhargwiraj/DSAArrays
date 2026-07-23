import java .util.*;
public class wavearray {
    public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=sc.nextInt();
    int [] array=new int[n];
   
    System.out.println("enter the numbers");
    for(int i=0;i<n;i++){
    array[i]=sc.nextInt();
    }
    int temp=0;
    System.out.println("wave array");
    for(int i=0;i<n-1;i+=2){
temp=array[i];
array[i]=array[i+1];
array[i+1]=temp;
    }
    for(int ele:array){
        System.out.print(ele+" ");
    }
    }
}
