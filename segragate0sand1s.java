import java.util.*;
public class segragate0sand1s {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=sc.nextInt();
    int []array=new int[n];
    int zero=0;
    int onces=0;
System.out.println("Enter only 0s and 1s");
for(int i=0;i<n;i++){
    array[i]=sc.nextInt();
}
System.out.println("Segragate array:");
for(int i=0;i<n;i++){
    if(array[i]==0){
        zero++;
    }else{
        onces++;
    }
}
for(int i=0;i<n;i++){
     if(i<zero){
        array[i]=0;
    }
    else{
        array[i]=1;
    }
    System.out.print(array[i]+" ");
}
}
}
