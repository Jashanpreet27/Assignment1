import java.util.Arrays;

public class two {
    public static void max(int b[]){
int s=0,e=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<b.length;i++){
            int sum=0;
            for(int j=i;j<b.length;j++){
                sum+=b[j];
             //   maxsum=Math.max(maxsum,sum);
                if(maxsum<sum)
                {
                    s=i;
                    e=j;
                    maxsum=sum;
                }
            }
        }
        System.out.println("Maximum sum = "+maxsum);
for(int i=s;i<=e;i++)
{
    System.out.print("   "+b[i]);
}
    }
    public static void main(String[] args) {

        int a[]={1,3,4,5,2,-2,8,-4};
        max(a);
    }
}
