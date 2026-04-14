package main;
import model.Student;
import util.InputUtil;
import services.StudentManager;


public class Main {
    static void main() {
       StudentManager obj= new StudentManager(100);

        while(true){
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            int choice = InputUtil.getInt("Enter choice: ");
             switch(choice){
                 case 1 :
                     int id = InputUtil.getInt("Enter ID: ");
                     String name = InputUtil.getString("Enter Name: ");
                     int age = InputUtil.getInt("Enter Age: ");
                     obj.addStudent(new Student(id, name, age));
                     break;
                 case 2:
                     obj.viewStudents();
                     break;
                 case 3:
                     id = InputUtil.getInt("Enter Id: ");
                     Student s= obj.searchStudent(id);

                     if(s !=null){
                         s.display();

                     }
                     else {
                         System.out.println("Student Not Exist With This ID");
                     }
                     break;
                 case 4:
                      id = InputUtil.getInt("Enter ID: ");
                      name = InputUtil.getString("Enter Name: ");
                     age = InputUtil.getInt("Enter Age: ");
                     obj.updateStudent(id, name , age);
                     break;
                 case 5 :
                     id = InputUtil.getInt("Enter ID: ");
                     obj.deleteStudent(id);
                     break;
                 case 6:
                     System.out.println("Exiting...");
                     System.exit(0);
                     break;
                 default:
                     System.out.println("Wrong Choice You Enter ");

             }



        }
    }
}
