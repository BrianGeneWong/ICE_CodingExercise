import java.io.*;
import java.nio.Buffer;


public class Problem2 {
    final int BUFFER_SIZE=1024;
    public static void main(String[] args){

        File file1= new File("testdata/test2a.txt");
        File file2= new File("testdata/test2b.txt");
        File output= new File("testdata/output.txt");

        try {
            merge(file1,file2,output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void merge(File f1,File f2, File output) throws IOException{
        BufferedReader br1= new BufferedReader(new FileReader(f1));
        BufferedReader br2= new BufferedReader(new FileReader(f2));
        BufferedWriter writer = new BufferedWriter(new FileWriter(output));

        String line1=br1.readLine();
        String line2=br2.readLine();


        while(line1!=null && line2!=null){
            if(line1.compareTo(line2)<0) {
                writer.write(line1);
                writer.newLine();
                line1= br1.readLine();
            }
            else {
                writer.write(line2);
                writer.newLine();
                line2= br2.readLine();
            }

        }
        writer.close();

    }
}
