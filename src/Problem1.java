import java.io.*;

public class Problem1 {

    public static void main(String[] args){
        File file =new File("testdata/test1.txt");
        String cusip=null;
        String price=null;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if(line.length()==8 && line.indexOf('.')==-1){
                    if(cusip!=null){
                        System.out.println(cusip + " price: " + price);
                    }
                    cusip=line;
                }
                else {
                    price = line;
                }
            }
            //print final one
            System.out.println(cusip + " price: " + price);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
