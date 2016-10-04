import java.util.*;

class combat{

  public static void main(String[] args) {

    ArrayList<String> combatEquip = new ArrayList<String>();

    combatEquip.add("Claw");
    combatEquip.add("Tomahawk");
    combatEquip.add("Rapier");
    combatEquip.add("Katana");
    combatEquip.add("Spear");
    combatEquip.add("Hammer");
    combatEquip.add("Scythe");
    combatEquip.add("Sword + shield");
    combatEquip.add("Pistol");
    combatEquip.add("Shotgun");
    combatEquip.add("Assault R");
    combatEquip.add("LMG");
    combatEquip.add("Sniper R");
    combatEquip.add("R Launcher");
    combatEquip.add("Crossbow");
    combatEquip.add("Hand-Bomb");

    System.out.println("There are " + combatEquip.size() + " Equipment");

  for(String equip : combatEquip){
    System.out.println(equip);

  }

  HashMap<String, Integer> shops = new HashMap<String, Integer>();

  shops.put("Dealion's Weapons and Armour", 1);
  shops.put("Treestylona's Spells and Herbs", 2);
  shops.put("The Sun's Ascent", 5);
  shops.put("The Moon's Decsent", 6);

  for(String shop : shops.keySet()){
    if(shops.get(shop) >= 5){
      System.out.println(shop + " Sold the legendary sword + shield. Gaurdian's Dream. " + shops.get(shop));
    }else{
      System.out.println(shop + " Will sell the Training sword + shield  " + shops.get(shop));
    }
  }
}
  }
