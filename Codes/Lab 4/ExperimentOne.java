/*1. Create a Student class with attributes for name and age. Implement a default 
constructor to assign default values and a parameterized constructor to initialize the
attributes with userdefined values. Create objects using both constructors and display their details. */
class Student{
 String name;
 int age;

 Student(String name, int age){
    this.name = name;
    this.age = age;
 }

 Student(){
    this.name = "Arjun";
    this.age = 26;
 }

}

class ExperimentOne{
    public static void main(String[] args){
        Student std1 = new Student();
        Student std2 = new Student("Aryan", 25);

        System.out.println(std1.name);
        System.out.println(std1.age);
        System.out.println(std2.name);
        System.out.println(std2.age);

    }
}