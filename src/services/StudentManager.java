package services;

import model.Student;

public class StudentManager {

    private Student[] students;
    private int count;

    public StudentManager(int size) {
        students = new Student[size];
        count = 0;
    }

    // Add Student
    public void addStudent(Student s) {
        if (count == students.length) {
            System.out.println("Cannot add More Student Now");
        } else {
            students[count] = s;
            count++;
            System.out.println("Student Added Succesfully");
        }

    }

    // View Students
    public void viewStudents() {
        if (count <= 0) {
            System.out.println("NO Student here !");
        } else {
            for (int i = 0; i < count; i++) {
                students[i].display();
            }
        }
    }

    // Search Student
    public Student searchStudent(int id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                return students[i];
            }
        }
        return null;
    }

    // Delete Student
    public void deleteStudent(int id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {

                // Shift from index i
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }

                students[count - 1] = null;
                count--;

                System.out.println("Student Deleted Successfully");
                return;
            }
        }

        System.out.println("Not Found");
    }
    public void updateStudent(int id, String name , int age){

           Student s = searchStudent(id);
           if(s != null) {
               s.setName(name);
               s.setAge(age);
               System.out.println("Student Upadted Successfully");
           }
           else{
               System.out.println("NO Student Found with this id");
           }

    }
}