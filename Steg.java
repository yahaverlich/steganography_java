import java.io.*;

public class Steg{

    FileInputStream ifs;
    FileOutputStream ofs;

    public void readFile(String filename){
        ifs = new FileInputStream("tmp.txt");

    }

    public static void main(String[] args){
        String filename = args[1];
        readFile(filename)
    }
}
