import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Write_n_name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n=sc.nextInt();
        try{
            FileWriter obj=new FileWriter("student.txt");
            for(int i=1;i<=n;i++){
                System.out.println("Enter your "+i+" name: ");
                String name=sc.next();
                name+='\n';
                obj.write(name);
            }
            obj.close();
            sc.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
