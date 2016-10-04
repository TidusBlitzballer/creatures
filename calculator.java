class Calculator{


public int add(int a, int b){
  return a + b;
}
public int subtract(int c, int d){
  return c - d;
}
public int multiply(int e, int f){
  return e * f;
}
public int divide(int g, int h){
  if(h == 0){
    System.out.println("Error you broke a math rule.");
    return 0;
  }
  return g / h;
}
public int modulo(int g, int h){
  if(h == 0){
    System.out.println("Error you broke a math rule.");
    return 0;
  }
  return g % h;
}

public static void main(String[] args) {
  Calculator calc = new Calculator();
  System.out.println(calc.add(5,7));
  System.out.println(calc.subtract(24,6));
  System.out.println(calc.multiply(6,4));
  System.out.println(calc.divide(60,2));
  System.out.println(calc.modulo(24,12));
}
}
