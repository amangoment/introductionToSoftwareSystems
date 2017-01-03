import java.util.Comparator;

public class Descending implements Comparator<Student> {
  public int compare(Student a, Student b) {
    if (a.age < b.age) return 1; 
    else if (a.age > b.age) return -1;
    else return (-1) * a.name.compareTo(b.name); 
  }
}