package psevdofile;
import java.io.File;
import java.util.Scanner;
public class Movi {    
    public String getFileName(File file){
        Scanner scan=new Scanner(System.in);
        String name=file.getName();
        return name;
    }
    public long getFileWeight(File file){
        long weight=file.length();
        return weight;
    }

}
