//max lenght pair chain
//similar to activity selection .. find longest chain length
import java.util.*;
public class GA4{
    public static void main(String[] args) {
        int pairs[][] = {{5,24}, {39,60}, {5,28}, {27,40}, {50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainlength = 1;
        int chainEnd = pairs[0][1];// last selected ele ka end time // chain end

        for(int i=1; i<pairs.length; i++){
            if(pairs[i][0] >= chainEnd){
                chainlength++;
                chainEnd = pairs[i][1];
            }
        } 
        System.out.println("longest chain = "+chainlength);
    }
}