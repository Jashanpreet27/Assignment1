import java.util.Arrays;

import static java.lang.Math.abs;

public class five {
    public static int  diff(int[] b, int k){
        Arrays.sort(b);
//as we know that the after and before the maximum and the minimum number of the array is still and the diiffernce between these two is also same so uh
        // not need to add nd then subtract
        // we just simply return the difference between first nd the last element after sort the array
    return abs(b[0]-b[b.length-1]);
    }
    public static void main(String[] args) {

        int a[]={1,3,4,5,6,7,9};
        int k=3;
        System.out.println(diff(a,k));
    }
}
