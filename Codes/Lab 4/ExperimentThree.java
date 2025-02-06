/*Create a Calculator class that contains a method add() to perform addition. Overload the add() method to 
handle different types and numbers of parameters, such as adding two integers, two doubles, and three integers.
Create an object of the class and demonstrate all method variations. */

class Calculator{
  void add(int a, int b){
    System.out.println(a+b);
  }

  void add(int a, int b, int c){
    System.out.println( a+b+c);
  }
}


public class ExperimentThree {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(1,2);
        c.add(1,2,3);
        
    }
}
