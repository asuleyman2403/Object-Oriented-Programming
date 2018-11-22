package SecondTask;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
import java.io.*;


public class Execution {

    private static void ser(String object,Object o){
               switch (object){
                   case "Course":
                       try{
                           FileInputStream fis = new FileInputStream(object + ".txt");
                           ObjectInputStream  ois = new ObjectInputStream(fis);
                           ArrayList<Course> courses = (ArrayList) ois.readObject();
                           Course course = (Course)o;
                           courses.add(course);
                           ois.close();
                           fis.close();
                           FileOutputStream fos = new FileOutputStream(object + ".txt");
                           ObjectOutputStream oos = new ObjectOutputStream(fos);
                           oos.writeObject(courses);
                           oos.close();
                           fos.close();
                       }catch (FileNotFoundException ex){
                           System.out.println("FileNotFound");
                       }catch (IOException ex){
                           ArrayList<Course> courses = new ArrayList<>();
                           Course course = (Course)o;
                           courses.add(course);
                           try{
                               FileOutputStream fos = new FileOutputStream(object + ".txt",true);
                               ObjectOutputStream oos = new ObjectOutputStream(fos);
                               oos.writeObject(courses);
                               oos.close();
                               fos.close();
                           }catch (IOException ex1){
                               System.out.println("IO");
                           }

                       }catch(ClassNotFoundException ex){
                           System.out.println("ClassNotFound");
                       }
                       break;
                   case "TextBook":
                       try{
                           FileInputStream fis = new FileInputStream(object + ".txt");
                           ObjectInputStream  ois = new ObjectInputStream(fis);
                           ArrayList<TextBook> books = (ArrayList) ois.readObject();
                           TextBook book = (TextBook)o;
                           books.add(book);
                           ois.close();
                           fis.close();
                           FileOutputStream fos = new FileOutputStream(object + ".txt");
                           ObjectOutputStream oos = new ObjectOutputStream(fos);
                           oos.writeObject(books);
                           oos.close();
                           fos.close();
                       }catch (FileNotFoundException ex){
                           System.out.println("FileNotFound");
                       }catch (IOException ex){
                           ArrayList<TextBook> books = new ArrayList<>();
                           TextBook book = (TextBook)o;
                           books.add(book);
                           try{
                               FileOutputStream fos = new FileOutputStream(object + ".txt",true);
                               ObjectOutputStream oos = new ObjectOutputStream(fos);
                               oos.writeObject(books);
                               oos.close();
                               fos.close();
                           }catch (IOException ex1){
                               System.out.println("IO");
                           }

                       }catch(ClassNotFoundException ex){
                           System.out.println("ClassNotFound");
                       }
                       break;
                   case "Instructor":
                       try{
                           FileInputStream fis = new FileInputStream(object + ".txt");
                           ObjectInputStream  ois = new ObjectInputStream(fis);
                           ArrayList<Instructor> instructors = (ArrayList) ois.readObject();
                           Instructor instructor = (Instructor)o;
                           instructors.add(instructor);
                           ois.close();
                           fis.close();
                           FileOutputStream fos = new FileOutputStream(object + ".txt");
                           ObjectOutputStream oos = new ObjectOutputStream(fos);
                           oos.writeObject(instructors);
                           oos.close();
                           fos.close();
                       }catch (FileNotFoundException ex){
                           System.out.println("FileNotFound");
                       }catch (IOException ex){
                           ArrayList<Instructor> instructor = new ArrayList<>();
                           Instructor book = (Instructor)o;
                           instructor.add(book);
                           try{
                               FileOutputStream fos = new FileOutputStream(object + ".txt",true);
                               ObjectOutputStream oos = new ObjectOutputStream(fos);
                               oos.writeObject(instructor);
                               oos.close();
                               fos.close();
                           }catch (IOException ex1){
                               System.out.println("IO");
                           }

                       }catch(ClassNotFoundException ex){
                           System.out.println("ClassNotFound");
                       }
                       break;
                   default:
                       break;
               }

    }

    public static void doIt(){
        try{
            Scanner scan = new Scanner(System.in);
            FileReader fr = new FileReader("admin.txt");
            FileWriter fw = new FileWriter("admin.txt",true);
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);
            String user;
            boolean exit = false;
            System.out.println("Would you like to log in as admin ? [yes/no]");
            user = scan.nextLine();
            switch(user){
                case "yes":
                    System.out.println("Enter your login:");
                    String[] username = br.readLine().split(" ");
                    String[] password = br.readLine().split(" ");
                    if(scan.next().equals(username[1])){
                        System.out.println("Enter your password: ");
                        if((Objects.hash(scan.next()) + "").equals(password[1])){
                            bw.write("\n admin has logged to the system at " + (new Date()).toString() + " \n");
                            System.out.println("Hello, " + username[1] + ", you are allowed to enter some commands that listed under:");
                            System.out.println("add_course");
                            System.out.println("add_textBook");
                            System.out.println("add_instructor");
                            System.out.println("exit");
                            String action;
                            while(!exit){
                                action = scan.next();
                                switch (action){
                                    case "add_course":
                                        System.out.println("Write all required information:  courseTitle, isbn, title, author, firstName, lastName, department, email");
                                        String[] courseinfo = new String[8];
                                        for(int i =0;i<8;i++){
                                            courseinfo[i] = scan.next();
                                        }
                                        String courseTitle = courseinfo[0];
                                        String isbn = courseinfo[1];
                                        String title = courseinfo[2];
                                        String author = courseinfo[3];
                                        String firstName = courseinfo[4];
                                        String lastName = courseinfo[5];
                                        String department = courseinfo[6];
                                        String email = courseinfo[7];
                                        Course course = new Course( courseTitle, isbn, title, author, firstName, lastName, department, email);
                                        ser("Course",course);
                                        bw.write("\n admin added new course " + course.toString() + " at " + (new Date()).toString() + "\n");
                                        break;
                                    case "add_textBook":
                                        System.out.println("Write all required information: isbn, title, author");
                                        String[] newTextBook = new String[3];
                                        for(int i = 0;i<3;i++){
                                            newTextBook[i] = scan.next();
                                        }
                                        String isbn1 = newTextBook[0];
                                        String title1 = newTextBook[1];
                                        String author1 = newTextBook[2];
                                        TextBook book = new TextBook(isbn1,title1,author1);
                                        ser("TextBook",book);
                                        bw.write("\n admin added new textBook " + book.toString() + " at " + (new Date()).toString() +" \n");
                                        break;
                                    case "add_instructor":
                                        String[] instructor = new String[4];
                                        System.out.println("\n Write all required information: firstname, lastname, department,email");
                                        for(int  i = 0;i<4;i++){
                                            instructor[i] = scan.next();
                                        }
                                        String firstname = instructor[0];
                                        String lastname = instructor[1];
                                        String departmen = instructor[2];
                                        String emai = instructor[3];
                                        Instructor newInstructor = new Instructor(firstname,lastname,departmen,emai);
                                        ser("Instructor",newInstructor);
                                        bw.write("\n admin added new instructor " + newInstructor.toString() +" at " + (new Date()).toString() + "\n");
                                        break;
                                    case "exit":
                                        exit = true;
                                        break;
                                    default:
                                        System.out.println("Incorrect command, try again");
                                        break;
                                }
                            }
                        }else{
                            System.out.println("Incorrect password");
                        }
                    }else{
                        System.out.println("Incorrect login");
                    }

                    break;
                case "no":
                    System.out.println("==========COURSES==========");
                    try{
                        FileInputStream fis = new FileInputStream("Course.txt");
                        ObjectInputStream oos = new ObjectInputStream(fis);
                        ArrayList<Course> courses = (ArrayList<Course>)oos.readObject();
                        //Course course = (Course)oos.readObject();
                        for(Course course: courses){
                            System.out.println(course.toString());
                        }

                        oos.close();
                        fis.close();
                        System.exit(0);
                    }catch(FileNotFoundException ex){
                        System.out.println("File not found!");
                        System.exit(404);
                    }catch(ClassNotFoundException ex){
                        System.out.println("You have no courses");
                    }catch(IOException ex){
                        System.out.println("You have no courses");
                    }

                default:
                    System.out.println("Procedure is failed, reload program and make a right choice");
                    break;
            }
            br.close();
            bw.close();
            fr.close();
            fw.close();
        }catch(FileNotFoundException ex){
            System.out.println("File not found!");
            System.exit(404);
        }catch(IOException ex){
            System.out.println("Unable to write!");
            System.exit(24);
        }
    }
}
