import java.util.Vector;

public class three {
    public static void merge(int a[],int b[]){
        Vector<Integer> c=new Vector<>();
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c.addElement(a[i]);
                i++;
            }
            else if(a[i]>b[j]){
                c.addElement(b[j]);
                j++;
            }
            else {
                c.addElement(a[i]);
                i++;
                c.addElement(b[j]);
                j++;
            }
        }
        while(i<a.length)
        {
            c.addElement(a[i]);
            i++;
        }
        while(j<b.length)
        {
            c.addElement(b[j]);
            j++;
        }
        for(int k=0;k<c.size();k++){
            System.out.print("  "+c.get(k));
        }
    }
    public static void main(String[] args) {

        int a[]={1,2,3,4,5,8};
        int b[]={4,7,10,12};
        merge(a,b);
    }
}
