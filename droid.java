class Droid{
int batteryLevel;

public Droid(){
batteryLevel = 100;
}

public void Activate(){
  System.out.println("Hello you have activated me. I am here to serve you can ask me to do anything.");
  batteryLevel -= 5;
  System.out.println("My battery Level is Currently at " + batteryLevel + "%");

}

public void chargeBattery(int hours){
  System.out.println("I'm going to charge for about " + hours);
  batteryLevel += hours;
  if( batteryLevel > 100){
    batteryLevel = 100;
  }
  System.out.println("My battery Level is Currently at " + batteryLevel + "%");
}
public int checkBatteryLevel(){
    System.out.println(" I have this much battery " + batteryLevel + "%");
    return batteryLevel;
}
public void Hover(int feet){
    System.out.println("I will now try to hover " + feet + " feet");
  batteryLevel -= feet;
  if( feet > 13 ){
  System.out.println("I can't hover for more than 13 feet");
    batteryLevel += feet;
  }
  if( batteryLevel <= 20 && batteryLevel > 5 ){
    System.out.println("you should let me charge or I'm uh go esplode on yuh");
  }
  if( batteryLevel <= 5 ){
    System.out.println("wh ... at ... di ... d ... I ... s ... ay ... abo ... ut ... ch ... arg ... ing");
  }
    System.out.println("My battery Level is Currently at " + batteryLevel + "%");
}


public static void main(String[] args) {

Droid fred = new Droid();
fred.Activate();
fred.chargeBattery(13);
fred.checkBatteryLevel();

for(int height = 0; height <=13; height++){
  fred.Hover(height);
}

fred.Hover(25);
}
}
