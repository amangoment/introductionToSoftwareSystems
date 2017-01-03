import java.util.Comparator;

public class Ascending implements Comparator<Student> {
  public int compare(Student a, Student b) {
    if (a.age < b.age) return -1; 
    else if (a.age > b.age) return 1;
    else return a.name.compareTo(b.name); 
  }
}