// //activity selection
// import java.util.*;
// public class GA1{
//     public static void main(String args[]){
//         int start[] = {1,3,0,5,8,5};
//         int end[] = {2,4,6,7,9,9};

//         //end time is sorted
//         int maxAct =0;
//         ArrayList <Integer> ans = new ArrayList<>();
//         //1st activity
//         maxAct = 1;
//         ans.add(0);
//         int lastend = end[0]; //end time of last chosen one
        
//         for(int i=0; i<end.length; i++){
//             if(start[i] >= lastend){
//                 maxAct++;
//                 ans.add(i);
//                 lastend = end[i];
//             }
//         }
//         System.out.println("max activities = "+maxAct);
//         for(int i=0; i<ans.size(); i++){
//             System.out.println("A"+ans.get(i)+" ");
//         }
//     }
// }


//if end time is not sorted then 
//1st sort it then continue
import java.util.*;
public class GA1{
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        //sorting end time
        int activities[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //lambda function
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        //end time is sorted
        int maxAct =0;
        ArrayList <Integer> ans = new ArrayList<>();
        //1st activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastend = activities[0][2]; //end time of last chosen one
        
        for(int i=0; i<end.length; i++){
            if(activities[i][1] >= lastend){
                maxAct++;
                ans.add(activities[i][0]);
                lastend = activities[i][2];
            }
        }
        System.out.println("max activities = "+maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.println("A"+ans.get(i)+" ");
        }
    }
}

