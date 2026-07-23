public class marge_2_shorted_array {
public static void main(String[] args) {
    int a[]={1,2,3,4,6,7,9};
    int b[]={10,11,12,13,14,15,16,17};
    int c[]=new int[a.length+b.length];
    int i=0;//pointer of 1st array
    int j=0;//pointer on 2nd given array
    int k=0;//pointer on new array
    
    while(i<a.length && j<b.length){
        if(a[i]<b[j]){
            c[k]=a[i];
            i++;
            
        }
        else{
            c[k]=b[j];
            j++;
        }
        k++;
    }
        if(i==a.length){
            while(j<b.length){
                c[k]=b[j];
                j++;
                k++;
            }
        }
        else{
            while(i<a.length){
                c[k]=a[i];
                i++;
                k++;
            }
        }
        for(int ele:c){
            System.out.print(ele+" ");
        }
    }
}

