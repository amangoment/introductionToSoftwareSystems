//introduce silo and wc utility

class WordCount {
  public static void main(String[] args) throws Exception {
    Scanner a = new Scanner(new File(args[0]));
    System.out.println(a); // print the Scanner, it's possible, so: why not?
    int lines, // count the number of lines in the file
        words = 0, // count the number of words (tokens) in the file
        nonBlankChars = 0, // counts the number of non-blank characters
        allChars = 0; // counts all characters in file including space
    for (lines = 0; a.hasNextLine(); ) { // line by line
      String line = a.nextLine(); // get the line
      allChars += line.length(); // count the characters on the line
      lines = lines + 1; // count the line
      allChars += 1; // count the new lines
      System.out.println( lines + ". ***(" + line + ")***"); // some feedback
      Scanner b = new Scanner(line); // let's get the tokens out of this line, one by one
      while (b.hasNext()) { // while I see a token
        String word = b.next(); // get it
        words += 1; // cont it
        nonBlankChars += word.length(); // count its characters
      }
    }
    System.out.println("I see " + lines         + " lines in this file.");
    System.out.println("I see " + words         + " words (token) in this file.");
    System.out.println("I see " + nonBlankChars + " non-blank characters in this file.");
    System.out.println("I see " + allChars      + " all characters in this file.");
  }
}