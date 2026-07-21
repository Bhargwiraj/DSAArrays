import java.util.*;
public class adding2atevenindex {
    public static void main(String[] args) {
 Scanner sc=new Scanner (System.in);
 System.out.println("Enter the size of the array");
 int n=sc.nextInt();
 int [] array=new int[n];
System.out.println("Enter elements in array");
for(int i=0;i<n;i++){
    array[i]=sc.nextInt();
}
System.out.println("Printing the even index by 2");
for(int i=0;i<n;i++){
    if(i%2==0){
        int sum = array[i]*2;
        System.out.println("Even index multiple by 2="+sum);
    }
    else{
        System.out.println(array[i]);
    }
}
    }
}
