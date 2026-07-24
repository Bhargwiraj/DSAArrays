import java.util.*;
public class marginginreverse {
public static void main(String[] args) {
    int a[]={2,3,4,5,6};
    int b[]={11,22,33,44,56,78};
    int c []= new int[a.length+b.length];
    int i=a.length-1;
    int j=b.length-1;
    int k=c.length-1;
while ( i>=0 && j>=0) {
    if(a[i]>b[j]){
        c[k]=a[i];

i--;
    }
    else{
        c[k]=b[j];
        j--;
    }
    k--;
}

if(i<0){
    while(j>=0){
        c[k]=b[j];
        j--;
        k--;
    }
}
else{
    while(i>=0){
        c[k]=a[i];
        i--;
        k--;
    }
}
for(int ele:c){
    System.out.print(ele +" ");
}
}
}
