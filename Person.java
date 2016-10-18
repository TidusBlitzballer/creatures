public class Person {

  String name;
  int age;
  String address;

/*  public Person(){

}*/
  public Person(String Name, int Age){
    name = Name;
    age = Age;

  }

  public static void main(String[] args) {
    Person bob = new Person();
    bob.name = "Bob";
    bob.age = 20;

    Person steve = new Person("Steve", 15);

    Teacher hadam = new Teacher("Hadam", 50, 20, "Science")

  }


}
class Teacher extends Person {
  String department;
  int yearsTeaching;

public Teacher(String Name, int Age);
  super(Name, Age);
}
public Teacher(String Name, int Age, int YearsTeaching)
super(Name, Age);
yearsTeaching

class Student extends Person {
float gpa;
int yearofGrad;

public Student(String Name, int Age, )

}
