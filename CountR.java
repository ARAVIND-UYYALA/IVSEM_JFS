import java.util.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
public class CountR {
    public static void main(String[] args) {
        try{
            int total=0,cse=0,aiml=0,it=0,ds=0,ece=0;
            File file=new File("Rolln.txt");
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine()){
                String roll=sc.nextLine();
                String check=roll.substring(6,8);
                if(check.equals("05")){
                    cse++;
                    total++;
                }
                if(check.equals("04")){
                    ece++;
                    total++;
                }
                if(check.equals("67")){
                    ds++;
                    total++;
                }
                if(check.equals("66")){
                    aiml++;
                    total++;
                }
                if(check.equals("12")){
                    it++;
                    total++;
                }
            }
            sc.close();
            System.out.println("Total no of students: "+total);
            System.out.println("cse: "+cse);
            System.out.println("aiml: "+aiml);
            System.out.println("it: "+it);
            System.out.println("ds: "+ds);
            System.out.println("ece: "+ece);
            System.out.println("File reading succesfully...");
        }catch(IOException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
}
