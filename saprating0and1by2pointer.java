public class saprating0and1by2pointer {
public static void main(String[] args) {
    int array[]={1,1,1,0,1,0,0,1,0,1,0,0,0,0,1};
    int i=0;
    int n=array.length;
    int j=n-1;
    System.out.println("shorted array:");
    while(i<j){
if(array[i]==0) i++;
else if(array[j]==1)j--;
else if(array[i]==1 && array[j]==0){
    array[i]=0;
    array[j]=1;
    i++;
    j--;
}
    }
for(int ele:array){
    System.out.print(ele+" ");
}
    }
}

