 import java.util.*;
public class twosum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the target sum:");
        int target=sc.nextInt();
        int [ ] array=  new int[n];
        System.out.println("Enter the number in array:");
        for(int i=0;i<n;i++){
array[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
if((array[i]+array[j])==target){
    System.out.println("found at index:-"+i+" "+"and"+" "+j);
}
            }
        }
    }
}
