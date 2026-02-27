import java.util.*;
public class topKFrequent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,1,1,2,2,3};
        int k=2;
        ArrayList<Integer>l=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        for(int i:map.keySet()){
            if(i>=2){
                l.add(l.get(i));
            }
        }
        for(int i:l){
            System.out.println(i);
        }
    }
}
