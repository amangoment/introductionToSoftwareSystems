---
[hasahmed@silo ~]$ pwd
/u/hasahmed
[hasahmed@silo ~]$ ls
bin  README
[hasahmed@silo ~]$ mkdir c212-workspace
[hasahmed@silo ~]$ cd c212-workspace/
[hasahmed@silo c212-workspace]$ man pwd
[hasahmed@silo c212-workspace]$ man man
[hasahmed@silo c212-workspace]$ man cd
[hasahmed@silo c212-workspace]$ man mkdir
[hasahmed@silo c212-workspace]$ pwd
/u/hasahmed/c212-workspace
[hasahmed@silo c212-workspace]$ ls
[hasahmed@silo c212-workspace]$ mkdir 08242016
[hasahmed@silo c212-workspace]$ cd 08242016/
[hasahmed@silo 08242016]$ clear
[hasahmed@silo 08242016]$ ls -l
total 0
[hasahmed@silo 08242016]$ nano -w One.java
[hasahmed@silo 08242016]$ ls -l
total 4
-rw------- 1 hasahmed students 110 Aug 24 15:27 One.java
[hasahmed@silo 08242016]$ javac One.java
Picked up _JAVA_OPTIONS: -Xms512m -Xmx512m
[hasahmed@silo 08242016]$ ls -l
total 8
-rw------- 1 hasahmed students 414 Aug 24 15:27 One.class
-rw------- 1 hasahmed students 110 Aug 24 15:27 One.java
[hasahmed@silo 08242016]$ man file
[hasahmed@silo 08242016]$ file One.java
One.java: C source, ASCII text
[hasahmed@silo 08242016]$ file One.class
One.class: compiled Java class data, version 52.0
[hasahmed@silo 08242016]$ java One
Picked up _JAVA_OPTIONS: -Xms512m -Xmx512m
Hello, people!
[hasahmed@silo 08242016]$ nano -w One.java
[hasahmed@silo 08242016]$ finger hasahmed
Login: hasahmed                         Name: Hasan Yusuf Ahmed
Directory: /u/hasahmed                  Shell: /bin/bash
On since Wed Aug 24 15:05 (EDT) on pts/45 from ip-64-134-175-27.public.wayport.net
   1 second idle
No mail.
No Plan.
[hasahmed@silo 08242016]$ nano -w One.java
[hasahmed@silo 08242016]$ javac One.java
Picked up _JAVA_OPTIONS: -Xms512m -Xmx512m
[hasahmed@silo 08242016]$ java One
Picked up _JAVA_OPTIONS: -Xms512m -Xmx512m
Hello, people!
2
4
2
-4
-5



[hasahmed@silo 08242016]$ nano -w One.java
[hasahmed@silo 08242016]$ javac One.java
Picked up _JAVA_OPTIONS: -Xms512m -Xmx512m
[hasahmed@silo 08242016]$ java One
Picked up _JAVA_OPTIONS: -Xms512m -Xmx512m
Hello, people!
2
4
2
-4
-5
0
2
true
[hasahmed@silo 08242016]$ cat One.java
public class One {
  public static void main(String[] args) {
    System.out.println("Hello, people!");
    System.out.println( 2 ); // 2
    System.out.println( 1 + 3 ); // 4
    System.out.println( 1 - 2 + 3 ); // 2
    System.out.println( 1 - (2 + 3) ); // -4
    System.out.println( 1 - 2 * 3 ); // -5
    System.out.println( 2 / 3 ); // 0
    System.out.println( 12 % 5 ); // 2
    System.out.println( 1 < 2 ); // true

  }
}
[hasahmed@silo 08242016]$

--






// suppose I want to calculate the amount of tax on an item
// I will ask for the price of that item, then add the tax
// assume that tax is 10% of the price, here's the program
public class Jordan {
  public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner(System.in); // get a Scanner, call it in
    System.out.print("Price of item: "); // ask the user to enter data
    // I now expect a number with decimals, that's a realistic price (in dollars)
    double price; // set up a variable with a meaningful name and the right type
    price = Double.parseDouble( in.nextLine() ); // read a String, parse it and store the number
    // price = in.nextDouble(); // that's another way to read a floating point number
    System.out.println("The tax to that is: " + (price * 0.10)); 
    System.out.println("Total cost: " + (price * 1.10));     
  }
}