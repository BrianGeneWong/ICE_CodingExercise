import java.io.*;
import java.nio.Buffer;

public class Problem2 {
    public static void main(String[] args){

        File file1= new File("testdata/test2a.txt");
        File file2= new File("testdata/test2b.txt");
        File output= new File("testdata/output.txt");

    }



    public void merge(File f1,File f2, File output) throws IOException{
        BufferedReader br1= new BufferedReader(new FileReader(f1));
        BufferedReader br2= new BufferedReader(new FileReader(f2));

        BufferedWriter writer = new BufferedWriter(new FileWriter(output));
        String line1;
        String line2;

        while((line1= br1.readLine())!=null && (line2=br2.readLine())!=null){
            if(line1.compareTo(line2)<0)
                writer.write(line1);
            else
                writer.write(line2);

        }

    }
}
