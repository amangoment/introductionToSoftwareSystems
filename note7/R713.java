public class R713 {
  public static void main(String[] args) {
    int[] a = {5, 3, 4, 2, 7, 4, 6, 4, 2 };
    int index = locateIn(a, 4); // 2
    System.out.println(index); 
  }
  public static int locateIn(int[] values, int target) {
//    for (int i = 0; i < values.length; i++) {
//      if (values[i] == target) {
//        return i;  
//      }
//    }
    int i = 0; 
    for (int a : values) {
      if (a == target)
        return i; 
      i = i + 1;
    }
    return -1; 
  }
}