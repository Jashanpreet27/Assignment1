public class one {
    static int c0,c1;
public static void arrange(int[] b)
{
    c0=0;
    c1=0;
    for(int i=0;i<b.length;i++){
        if(b[i] == 0)
            c0++;
        else if (b[i] == 1)
            c1++;

    }
    for(int i=0;i<b.length;i++){
        if(c0>0){
            b[i]=0;
            c0--;
        } else if (c1>0) {
            b[i]=1;
            c1--;
        }
        else {
            b[i]=2;
        }
    }
    for(int i=0;i<b.length;i++){
        System.out.print("  "+b[i]);
    }
}
    public static void main(String[] args) {
        int a[]={2,0,2,1,1,1,1,2,2,0,0,0};
        arrange(a);
    }
}
