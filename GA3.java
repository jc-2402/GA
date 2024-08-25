//min absolute difference pairs
// given 2 arrays  a & b of equal length n . pair each elements of array a to an element
// in an array b s.t. sum s of absolute difference of all pairs is min
import java.util.*;
public class GA3{
    public static void main(String args[]){
        int a[] = {1,2,3};
        int b[] = {2,1,3};

        Arrays.sort(a);
        Arrays.sort(b);

        int mindiff =0;
        for(int i=0; i<a.length; i++){
            mindiff += Math.abs(a[i] - b[i]);
        }
        System.out.println("min difference = "+mindiff);
    }
}

