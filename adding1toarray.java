import java.util.*;
public class adding1toarray {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();
      // array.add( 9);
       array.add( 9);
        array.add( 9);
       int carray=1;
        for(int i=array.size()-1;i>=0;i--){
if(array.get(i)+carray==10){
    array.set(i,0);
    carray=1;
}
else{
    //whaa hm set kar rhe h array k index pe carray k sth kaa sum
  array.set(i,array.get(i)+carray) ;
  carray=0;
  break;
}
        }
        if(carray==1) array.add(0,1);
        //Collections.reverse(array);
        System.out.println("Result");
        for(int ele:array){
            System.out.print(ele);
        }
    }
}
