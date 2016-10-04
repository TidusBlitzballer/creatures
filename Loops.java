import java.util.ArrayList;
class Loops {
/*
*/

public static void main(String[] args) {




for(int waterLevel = 1; waterLevel < 7; waterLevel++){
  System.out.println(" The Pool's water level is at" + waterLevel + "feet ");
}

ArrayList<Integer> weeklyTemps = new ArrayList<Integer>();
weeklyTemps.add(78);
weeklyTemps.add(67);
weeklyTemps.add(89);
weeklyTemps.add(94);

for(int j = 0; j < weeklyTemps.size(); j++){
  System.out.println(weeklyTemps.get(j));
}
for(Integer temp : weeklyTemps){
  System.out.println(temp);
}

}
}
