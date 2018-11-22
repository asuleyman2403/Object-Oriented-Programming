package SecondTask;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
import java.io.*;

public class Execution {
    private static void addTextBook(String[] newTextBook){
        try{
            ArrayList<TextBook> textBooks = new ArrayList<>();
            FileOutputStream fos = new FileOutputStream("TextBooks.txt",true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            String isbn = newTextBook[0];
            String title = newTextBook[1];
            String author = newTextBook[2];
            TextBook textB = new TextBook(isbn,title,author);
            textBooks.add(textB);
            oos.writeObject(textBooks);
            oos.flush();
            oos.close();
            fos.close();
        }catch(FileNotFoundException ex){
            System.out.println("Could not find file to add new TextBook");
            System.exit(1000);
        }catch(IOException ex){
            System.out.println("Impossible to write");
            System.exit(1000);
        }
    }
    private static void addInstructor(String[] instructor){
        try{
            ArrayList<Instructor> instructors = new ArrayList<>();
            FileOutputStream fos = new FileOutputStream("Instructors.txt",true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            String firstName = instructor[0];
            String lastName = instructor[1];
            String department = instructor[2];
            String email = instructor[3];
            Instructor newInstructor = new Instructor(firstName,lastName,department,email);
            instructors.add(newInstructor);
            oos.writeObject(instructors);
            oos.flush();
            oos.close();
            fos.close();
        }catch(FileNotFoundException ex){
            System.out.println("Could not find file to add new TextBook");
            System.exit(1000);
        }catch(IOException ex){
            System.out.println("Impossible to write");
            System.exit(1000);
        }
    }
    private static void addCourse(String[] courseInfo){
        try{
            ArrayList<Course> courses = new ArrayList<>();
            FileOutputStream fos = new FileOutputStream("courses.txt",true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            String courseTitle = courseInfo[0];
            String isbn = courseInfo[1];
            String title = courseInfo[2];
            String author = courseInfo[3];
            String firstName = courseInfo[4];
            String lastName = courseInfo[5];
            String department = courseInfo[6];
            String email = courseInfo[7];
            Course course = new Course( courseTitle, isbn, title, author, firstName, lastName, department, email);
            courses.add(course);
            oos.writeObject(courses);
            oos.flush();
            oos.close();
            fos.close();
        }catch(FileNotFoundException ex){
            System.out.println("Could not find file to add new TextBook");
            System.exit(1000);
        }catch(IOException ex){
            System.out.println("Impossible to write");
            System.exit(1000);
        }
    }

    public static void doIt(){
      try{
          Scanner scan = new Scanner(System.in);
          FileReader infile = new FileReader("admin.txt");
          FileWriter outfile = new FileWriter("admin.txt",true);
          BufferedReader br = new BufferedReader(infile);
          BufferedWriter bw = new BufferedWriter(outfile);
          String[][] adminInfo = new String[2][2];
          for(int i = 0;i<2;i++){
              String line  = br.readLine();
              String[] lines = line.split(" ");
              adminInfo[i][0] = lines[0];
              adminInfo[i][1] = lines[1];
          }
          System.out.print("Would like to log in as an admin? [yes/no]");
          String would = scan.next();
          System.out.print("\n");
          if(would.equals("yes")){
                System.out.print("Enter your login: ");
                String login = scan.next();
                System.out.print("\n");
              if(login.equals(adminInfo[0][1])){
                    System.out.println("Enter your password: ");
                    String password = scan.next();
                    int hashedPass = Objects.hash(password);
                    String hash = hashedPass + "";
                    if(hash.equals(adminInfo[1][1])){
                        Date date = new Date();
                        bw.append("\n" + date.toString() + " admin logged in to a system" + "\n");
                        String action = "";
                        boolean exit = false;
                        while(!exit){
                            action = scan.next();
                            switch (action){
                                case "exit":

                                    exit = true;
                                    break;
                                case "add_textbook":
                                    System.out.println("Write all required information in required order: isbn,title,author");
                                    String[] tbs = new String[3];
                                    for(int i = 0;i<3;i++){
                                        tbs[i] = scan.next();
                                    }
                                    System.out.print("\n");
                                    addTextBook(tbs);
                                    date = new Date();
                                    bw.append(date.toString() + "  admin added new textbook " + tbs[1] + "\n");
                                    break;
                                case "add_instructor":
                                    System.out.println("Write all required information in required order: name, surname, department, email");
                                    String[] inss = new String[4];
                                    for(int  i = 0;i<4;i++){
                                        inss[i] = scan.next();
                                    }
                                    System.out.print("\n");
                                    addInstructor(inss);
                                    date = new Date();
                                    bw.append(date.toString() + " admin added new instructor " + inss[0] + " " + inss[1] + "\n");
                                    break;
                                case "add_course":
                                    System.out.println("Write all required information in required order: course_title, isbn, book_title, author, name, surname, department, email");
                                    String[] courses = new String[8];
                                    for(int i =0;i<8;i++){
                                        courses[i] = scan.next();
                                    }
                                    System.out.print("\n");
                                    addCourse(courses);
                                    date = new Date();
                                    bw.append(date.toString() + " admin added new course " + courses[0] + "\n");
                                    break;
                            }
                        }
                    }else{
                        System.out.println("Incorrect password! Reload application");
                    }
                }else{
                    System.out.println("Incorrect login! Reload application");
                }
          }else{
                try { //shows only one course instead of list
                    FileInputStream fis = new FileInputStream("courses.txt");
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    ArrayList<Course> courses = (ArrayList<Course>) ois.readObject();
                    for(Course course: courses) {
                        System.out.println(course.toString());
                    }
                    ois.close();
                    fis.close();
                }catch(FileNotFoundException fex) {
                    System.out.println("There are some problems!");
                    System.exit(200);
                }catch(IOException ioex) {
                    System.out.println("There are some problems!");
                    System.exit(400);
                }catch(ClassNotFoundException ex){
                    System.out.println("There are some problems!");
                    System.exit(1000);
                }
          }
          /*br.close();
          bw.flush();
          bw.close();
          infile.close();
          outfile.flush();
          outfile.close();*/
      }catch(FileNotFoundException ex){
          System.out.println("File not found! Try again");
          System.exit(1000);
      }catch(IOException ex){
          System.out.println("Could not write! Try again!");
          System.exit(1000);
      }
    }
}
