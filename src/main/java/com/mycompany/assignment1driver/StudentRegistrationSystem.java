package com.mycompany.assignment1driver;

import org.joda.time.DateTime;
import com.mycompany.assignment1.Course;
import com.mycompany.assignment1.Student;
import com.mycompany.assignment1.Module;
import java.util.List;
/**
 *
 * @author paulkirwan
 */
public class StudentRegistrationSystem {

    public static void main(String[] args) {
        
        //Initialise students
        Student s1 = new Student("Bart Simpson", new DateTime(1998,8,12,0,0),"10002000");
        Student s2 = new Student("Donkey", new DateTime(2000,10,10,0,0),"12306785");
        Student s3 = new Student("Jar Jar Binks", new DateTime(1996,1,1,0,0),"55554444");
        Student s4 = new Student("Mario Mario", new DateTime(1997,3,5,0,0),"12341234");
        
        //Initialise modules
        Module softwareEng = new Module("Software Engineering", "CT417");
        Module systemOnChip = new Module("System on Chip", "EE451");
        Module dsp = new Module("Digital Signal Processing", "EE445");
        Module machineLearning = new Module("Machine Learning", "CT4101");
        
        
        //Initialise courses
        DateTime courseStart = new DateTime(2020,9,28,0,0);
        DateTime courseEnd = new DateTime(2021,5,10,0,0);
        Course engineering = new Course("Electronic & Computer Engineering", courseStart, courseEnd);
        Course computerScience = new Course("Computer Science & IT", courseStart, courseEnd);
        
        //Add students to modules
        softwareEng.addStudent(s1);
        softwareEng.addStudent(s2);
        softwareEng.addStudent(s3);
        softwareEng.addStudent(s4);
        
        systemOnChip.addStudent(s1);
        systemOnChip.addStudent(s2);
        
        dsp.addStudent(s1);
        dsp.addStudent(s2);
        
        machineLearning.addStudent(s3);
        machineLearning.addStudent(s4);

        //Add modules to courses
        engineering.addModule(softwareEng);
        engineering.addModule(systemOnChip);
        engineering.addModule(dsp);
        computerScience.addModule(softwareEng);
        computerScience.addModule(machineLearning);
        
        //Register students to courses
        engineering.addStudent(s1);
        engineering.addStudent(s2);
        computerScience.addStudent(s3);
        computerScience.addStudent(s4);
        
        //Print Courses and associated Modules
        System.out.println("Courses and their associated modules:");
        System.out.println(engineering.toString());
        System.out.println(engineering.getModules());
        System.out.println(computerScience);
        System.out.println(computerScience.getModules());
        
        //Print Students and their respective Modules and Courses
        System.out.println("\nStudents and their Modules and Courses:");
        System.out.println("Student 1:");
        System.out.println(s1);
        System.out.println(s1.getModules());
        System.out.println(s1.getCourse());
        
        System.out.println("\nStudent 2:");
        System.out.println(s2);
        System.out.println(s2.getModules());
        System.out.println(s2.getCourse());
        
        System.out.println("\nStudent 3:");
        System.out.println(s3);
        System.out.println(s3.getModules());
        System.out.println(s3.getCourse());
        
        System.out.println("\nStudent 4:");
        System.out.println(s4);
        System.out.println(s4.getModules());
        System.out.println(s4.getCourse());
    }
}
