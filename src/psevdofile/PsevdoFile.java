package psevdofile;
import java.util.Scanner;
import java.io.File;
public class PsevdoFile {
    public static void main(String[] args)throws Exception {
        System.out.println("Лабораторная работа №3");
        System.out.println("Введите путь к файлу : ");
    Scanner scan=new Scanner(System.in);
    String path=scan.next();
    File myFile= new File(path);
        if(path.contains(".txt")) {
             Text read = new Text();
            System.out.println("Инициализация файла...");
            System.out.println("Имя файла: "+read.getFileName(myFile));
            System.out.println("Размер файла:"+read.getFileWeight(myFile)+" байт");
            read.reader(myFile);
        }
        if(path.contains(".mp3")) {
            Audio read = new Audio();
            System.out.println("Инициализация файла...");
            System.out.println("Имя файла: "+read.getFileName(myFile));
            System.out.println("Размер файла: "+read.getFileWeight(myFile)+" байт");
        }
        if(path.contains(".mp4")) {
            Movi read = new Movi();
            System.out.println("Инициализация файла...");
            System.out.println("Имя файла: "+read.getFileName(myFile));
            System.out.println("Размер файла: "+read.getFileWeight(myFile)+" байт");
        }
        else{
            System.out.println("Попробуй ещё раз");
        }
 }}
