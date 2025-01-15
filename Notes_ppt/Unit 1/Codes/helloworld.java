class Name { // Name starts with a capital letter
    static int newVal = 25;
    int oldVal = 23;
}

class helloworld extends Name{


    public static void main(String[] args) {
        Name nm = new Name();
        System.out.println("Hello World");
        int val = 23;
        System.out.println(val);
        System.out.println(newVal);
        System.out.println(nm.oldVal);

    }

}

// class Parent {
//     String name = "Parent Class";
//     // Parent class method
//     void display() {
//     System.out.println("This is a method from the Parent class.");
//     }
//     // Parent class constructor
//     Parent(String message) {
//     System.out.println("Parent Constructor: " + message);
//     }
// }
// class helloworld extends Parent {
//     String name = "Child Class";
//     // Child class constructor
//     helloworld(String message) {
//     super(message); // Calls the parent class constructor
//     System.out.println("Child Constructor: " + message);
//     }
//     void display() {
//     super.display(); // Calls the parent class method
//     System.out.println("This is a method from the Child class.");
//     }
//     void showNames() {
//     System.out.println("Name from Parent: " + super.name); // Access parent class variable
//     System.out.println("Name from Child: " + this.name); // Access child class variable
//     }


//     public static void main(String[] args) {
//         helloworld childObj = new helloworld("Hello!");
//     childObj.display();
//     childObj.showNames();
//     }
//     }