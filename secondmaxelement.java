import java.util.*;
public class secondmaxelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int array []=new int[n];
        System.out.println("Enter the numeber in array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("2nd Higest no");
        int max=array[0];
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        for(int i=0;i<n;i++){
if(array[i]>smax && array[i]!=max){
    smax=array[i];
}            
            }
            System.out.println(smax);
    }
}
