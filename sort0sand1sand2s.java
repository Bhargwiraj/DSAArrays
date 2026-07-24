import java.util.*;
public class sort0sand1sand2s {
    public static void main(String[] args) {
        int array[]={1,2,1,2,2,2,1,2,0,0,0,0,1,1,1,2,2,2,0,0,0};
        int count0=0,count1=0,count2=0;
    for(int i=0;i<array.length;i++){      
    if(array[i]==0){
        count0++;
    }else if(array[i]==1){
        count1++;
    }else
    {
        count2++;
    }
    }
    for(int i=0;i<array.length;i++){
        if(i<count0){
            array[i]=0;

        }else if(i<count1+count0){
            array[i]=1;
        }
        else{
            array[i]=2;
        }
    }
    for(int ele:array){
        System.out.print(ele +" ");
    }
    }
}
