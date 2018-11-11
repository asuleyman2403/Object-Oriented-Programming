package FirstTask.FirstTask2;
import java.io.*;
import java.util.*;

public class Execution {
    public static void doIt(){
        try{
            FileReader infile = new FileReader("scores.txt");
            FileWriter outfile = new FileWriter("grades.txt",true);
            BufferedReader br = new BufferedReader(infile);
            BufferedWriter bw = new BufferedWriter(outfile);
            ArrayList<Integer> set = new ArrayList<>();
            String line = br.readLine();
            while(line!=null){
                String[] str = line.split(" ");
                Integer score = Integer.parseInt(str[2]);
                set.add(score);
                line = br.readLine();
            }
            br.close();
            set.sort(Integer::compareTo);
            int sum = 0;
            for(Integer score: set){
                sum+=score;
            }
            String fileData="";
            fileData+= ("Average-" + sum/set.size() + "\n");
            fileData+= ("Maximum-" + set.get(set.size() - 1) + "\n");
            fileData+= ("Minimum-" + set.get(0) + "\n");
            bw.append(fileData);
            bw.flush();
            bw.close();
        }catch(FileNotFoundException ex1){
            System.out.println("File not found, it cant be done!");
            System.exit(1000);
        }catch(IOException ex2){
            System.out.println("There are some problem with IO operations, it  cant be done!");
            System.exit(1000);
        }
    }


}
