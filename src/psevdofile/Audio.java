package psevdofile;
import java.io.File;
public class Audio {
    public String getFileName(File file){
        String name=file.getName();
        return name;
    }
    public long getFileWeight(File file){
        long weight=file.length();
        return weight;
    }
}
