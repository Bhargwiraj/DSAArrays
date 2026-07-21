import java.util.*;
public class searchinarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        System.out.println("Enter the number that you want to search:");
        int num=sc.nextInt();
        int []array=new int [n];
        boolean flag=false;
        System.out.println("Enter the number in araays:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Operation result:");
        for(int i=0;i<n;i++){
            if(num==array[i]){
                System.out.println("Match at index:-"+i);
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("Not found");
        }
    }
}
