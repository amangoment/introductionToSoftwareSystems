//Write the simplest shortest program that sorts objects via the Comparator interface.

import java.util.ArrayList; 
import java.util.Collections; 

public class Student {
  String name;
  int age; // not private so I can simplify a little the comparisons

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String toString() {
    return "Student(" + this.name + ", " + this.age + ")";  
  }

  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<Student>();  
    students.add( new Student("Laura" , 12) ); 
    students.add( new Student("Larry" , 13) ); 
    students.add( new Student("Leslie", 11) ); 
    students.add( new Student("Les", 11) ); 
    System.out.println( students );
    Collections.sort( students, new Ascending() );    
    System.out.println( students );
    Collections.sort( students, new Descending() );    
    System.out.println( students );
  }
}