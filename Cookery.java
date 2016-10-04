import java.util.HashMap;

class Cook {

public static void main(String[] args) {

HashMap<String, Integer> menu = new HashMap<String, Integer>();

menu.put("ToFurkey Burger", 12);
menu.put("Meatball pizza", 20);
menu.put("Chicken patty", 10);

System.out.println(menu.get("Meatball pizza"));
System.out.println(menu.size());

for(String item : menu.keySet())
{
  System.out.println("A " + item + " costs " +menu.get(item) + " dollars.");
}

}

}
