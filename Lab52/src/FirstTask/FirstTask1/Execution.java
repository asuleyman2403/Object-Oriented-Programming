package FirstTask.FirstTask1;

import java.io.*;
import java.util.*;

public class Execution {
    public static void doIt(){
        try{
            FileReader infile = new FileReader("scores.txt");
            FileWriter outfile = new FileWriter("grades.txt");
            BufferedReader br = new BufferedReader(infile);
            BufferedWriter bw = new BufferedWriter(outfile);
            ArrayList<Student> set = new ArrayList<>();
            String line = br.readLine();
            while(line!=null){
                String[] str = line.split(" ");
                String lastName = str[0];
                String name = str[1];
                Integer score = Integer.parseInt(str[2]);
                Student student = new Student(lastName,name,score);
                set.add(student);
                line = br.readLine();
            }
            br.close();
            //set.sort(Student::compareTo);
            String fileData = "";
            int cnt = 1;
            String grade = "A";
            for(Student student: set){
                if(0<cnt && cnt<11) grade = "A";
                if(10<cnt && cnt<21) grade = "B";
                if(20<cnt && cnt<31) grade = "C";
                if(30<cnt && cnt<41) grade = "D";
                if(cnt>40) grade = "F";
                fileData+=(cnt + ") " + student.getLastName() + " " + student.getName() + " - " + (char)34 + grade + (char)34 + "\n");
                cnt++;
            }
            bw.write(fileData);
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
