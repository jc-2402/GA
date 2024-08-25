//indian coins
import  java.util.*;
public class GA5{
    public static void main(String[] args) {
        Integer coins[] ={1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countofcoins = 0;
        int amt = 590;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<coins.length; i++){
            if(coins[i] <= amt){
                while(coins[i] <= amt){
                    countofcoins++;
                    ans.add(coins[i]);
                    amt -= coins[i];
                }
            }
        }
        System.out.println("total no of in coins used = "+countofcoins);

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}