import java.lang.reflect.Array;
import java.util.Arrays;

public class fourth {
public static int count(int b[],int k){

    Arrays.sort(b);
    int l=0,r=b.length-1;
int c=0;
while(l<r){
    int sum=b[l]+b[r];
    if(sum == k){
        System.out.println(Arrays.asList(b[l],b[r]));
        c++;
        l++;
        r--;

    } else if (sum < k) {
        l++;

    }
    else {
        r--;
    }
}
return c;
}
    public static void main(String[] args) {

        int a[]={1,3,4,5,2,-2,7,0};
        int k=5;
        System.out.println(count(a,k));
}
}
