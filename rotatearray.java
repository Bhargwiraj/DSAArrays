import java.util.*;
public class rotatearray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=sc.nextInt();
    int [] array=new int[n];
   System.out.println("Enter the rotation element");
   int r=sc.nextInt();
   r=r%n;
    System.out.println("enter the numbers");
    for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
    }
    int first=0;
    int last=r-1;
    int sf=r;
    int sl=n-1;
    int swap;
    //reverse 1st part
    while(first<last){
swap=array[first];
array[first]=array[last];
array[last]=swap;
first++;
last--;
    }
    //reverse second part
    while(sf<sl){
swap=array[sf];
array[sf]=array[sl];
array[sl]=swap;
sf++;
sl--;
    }
    //complete swap
    int i=0;
    int j=n-1;
    while(i<j){
        swap=array[i];
        array[i]=array[j];
        array[j]=swap;
        i++;
        j--;
    }
    System.out.println("Rotated array");
    for(int ele:array)
    System.out.print(ele);
    }
}
