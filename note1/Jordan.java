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