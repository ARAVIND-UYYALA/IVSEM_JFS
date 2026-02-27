import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Write_nR_name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            FileWriter obj1=new FileWriter("cse.txt");
            FileWriter obj2=new FileWriter("aiml.txt");
            FileWriter obj3=new FileWriter("it.txt");
            FileWriter obj4=new FileWriter("ds.txt");
            FileWriter obj5=new FileWriter("ece");
            System.out.println("Enter n value: ");
            int n=sc.nextInt();
            int j=0;
            while(j<n){
                System.out.println("Enter the rollnumber: ");
                String rollnumber=sc.next();
                String br_code=rollnumber.substring(6,8);
                if(br_code.equals("05")) obj1.write(rollnumber);
                if(br_code.equals("66")) obj2.write(rollnumber);
                if(br_code.equals("12")) obj3.write(rollnumber);
                if(br_code.equals("67")) obj4.write(rollnumber);
                if(br_code.equals("04")) obj5.write(rollnumber);
                j++;
            }
            obj1.close();
            obj2.close();
            obj3.close();
            obj4.close();
            obj5.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
