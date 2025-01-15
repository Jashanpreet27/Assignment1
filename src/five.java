import java.util.Arrays;

import static java.lang.Math.abs;

public class five {
    public static int  diff(int b[], int k){
        Arrays.sort(b);
        int n=b.length;
int res=b[n-1]-b[0];
for(int i=1;i<n;i++) {
    int maxh1 = Math.max(b[i - 1] + k, b[n - 1] - k);
    int minh1 = Math.min(b[i] - k, b[0] + k);

    res=Math.min(res,(maxh1 - minh1));
}
return res;
    }
    public static void main(String[] args) {

        int a[]={12,6,4,15,17,10};
        int k=6;
        System.out.println(diff(a,k));
    }
}
