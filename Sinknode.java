import java.util.*;
public class Sinknode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Adj_max[][]=new int[5][5];
        int n=Adj_max.length,m=Adj_max[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                Adj_max[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(Adj_max[i][j]!=0){
                    break;
                }
                if(j==n-1&&Adj_max[i][j]==0) count++;
            }
        }
        System.out.println(count);
    }
}
