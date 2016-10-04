class Dog {
  int age;
  String name;

public Dog(String dogsName,int dogsAge) {
  age = dogsAge;
  name = dogsName;
}
public void Bark() {
  System.out.println("Woof Woof Woof!");
}

public void Run(int feet){
  System.out.println(this.name + " ran " + feet + " feet");
}

public static void main(String[] args) {

  Dog spike = new Dog("spike", 5);
  Dog george = new Dog("george", 5);

  spike.Bark();
  george.Bark();

  spike.Run(4);
  george.Run(7);

  System.out.println("Spike is " + spike.age + "years old.");
  System.out.println("His brother " + george.name + "is" + george.age + "years old");
 }
}
