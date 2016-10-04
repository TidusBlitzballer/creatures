class Creature{
  int age;
  String combo;
  int hp;
  int ap;
  int atk;
  int def;
  int spd;


public Creature(String creatureCombo,int creatureAge,int creatureHP,int creatureAP,int creatureAtk,int creatureDef,int creatureSpd) {
  age = creatureAge;
  combo = creatureCombo;
  hp = creatureHP;
  ap = creatureAP;
  atk = creatureAtk;
  def = creatureDef;
  spd = creatureSpd;
}
public void Noise(String Sound) {
  System.out.println(this.combo + Sound);
}
public void Info(String Bio) {
  System.out.println(this.combo + Bio);
}
public void HP(int Health) {
  System.out.println(this.combo + Health);
}
public void AP(int AtkP) {
  System.out.println(this.combo + AtkP);
}

public static void main(String[] args) {

Creature dealion = new Creature("Deer, Lion, Hawk =", 2000, 8, 7, 7);

Creature frocato = new Creature("Bear, Fish, Kangaroo =", 3270, 12, 11, 13);

Creature tripleking = new Creature("Gorilla, Megalodon, Eagle Owl =", 5000, 17, 15, 15);

Creature frozenfire = new Creature(" Ice + Orange tabby =", 500, 4, 8, 5);

Creature pyroshound = new Creature(" Fire + Husky =", 500, 6, 4, 9);

Creature treestylona = new Creature(" Dryad, Goat, Tiger =", 5000, 10, 9, 9);

Creature pyroscombuster = new Creature(" Pyroshound + Phoenix =", 279, 150, 170, 165);

Creature frozenflood = new Creature(" Frozenfire + Undine =", 254, 115, 190, 135);

Creature majesto = new Creature(" Electricity + Crane", 500, 13, 11, 10);

Creature chikyū_no_ikari = new Creature(" Earth + Treestylona ", 2000, 120, 200, 130);

Creature kaze_no_fuan = new Creature(" Wind + Dealion ", 1000, 189000, , , );

Creature kami_no_petto = new Creature(" Light + Jackalope ", 90000, , , );

Creature akuma_no_petto = new Creature(" Dark + Mujina", 90000, , , );

Creature akuma_no_gaurd = new Creature("Akuma no petto + Hydra ", , , , );

Creature kami_no_gaurd = new Creature(" Kami no petto + Gryphon ", , , , );

Creature doragon no buresu =  new Creature(" Azure Dragon + Pheonix");

Creature doragonburazā = new Creature(" kami_no_gaurd");

dealion.Noise(" Roar.");
frocato.Noise(" Grumble, Grumble.");
tripleking.Noise(" kaaaa, kaaaa.");
frozenfire.Noise(" Meow, Meow.");
pyroshound.Noise(" Bark, Bark.");
treestylona.Noise(" Baaaaa.");
pyroscombuster.Noise(" Bark, Bark.");
frozenflood.Noise(" Meow, Meow");
majesto.Noise(" kaaaa");
chikyū_no_ikari.Noise("baaaa");
kaze_no_fuan.Noise("Roar");
kami_no_petto.Noise("sqeak, sqeak");
kami_no_gaurd.Noise("Kaww");
akuma_no_petto.Noise("grrrr");
akuma_no_gaurd.Noise("Roar");

dealion.Info(" This creature can fly at the speed of sound. It is said that this beast is the gaurdian if the village Tenshi no guresu.");
frocato.Info(" This creature can jump high swim fast and breathe both on land and water. IT is also said this is a offspring of a God.");
tripleking.Info(" This massive creature is half the size of a skyscraper. It is also said that the people forshiped this creature long ago so it is considered a God.");
frozenfire.Info(" These felines spent their lives in the cold and when they felt like collapsing they turned into a crystal cat known as a Frozen Fire.");
pyroshound.Info(" These Kanines spent their lives in a active volcano and when they where too hot they engulfed in fire and became what is now called a Pyroshound.");
treestylona.Info(" This creature is said to be a tree God because it looks like a tree but in a animal state.");
pyroscombuster.Info(" This pyroshound got too close to a phoenix and got absorbed and in this state it has the body of a dog and the wings of a pheonix. it is also said that it can never die. ");
Frozenflood.Info(" This Frozenfire wondered the Ice lands until it found a water nynmph named undine were they fused and became Frozenflood. The newly created creature has a tail of a fish but the body of a cat.")
majesto.Info("This crane was flying over it's nest when a thunderbolt hit it but it didn't get hurt instead it was absorbed into the crane and then became a Majesto.");
chikyū_no_ikari.Info(" This Treestylona wanted to understand more about the planet and nature when their was a earthquake it went underground then absorbed the earthquake becoming a Chikyū no Ikari.");
kaze_no_fuan.Info("This Dealion was searching for more power more than it could ever imagine when it saw a tornado it jumped in it and absorbed it becoming Kaze no Fuan.");
kami_no_petto.Info("This holy animal is said to be a pet of God.");
kami_no_gaurd.Info("This holy animal is said to be a gaurdian for God.");
akuma_no_petto.Info("This demonic animal is said to be a pet of Satan.");
akuma_no_gaurd.Info("This demonic animal is said to be a gaurdian for Satan.");

dealion.HP(250);
frocato.HP(1000);
tripleking.HP(1500);
frozenfire.HP(150);
pyroshound.HP(200);
treestylona.HP(450);
pyroscombuster.HP(200000);
frozenflood.HP(175000);
majesto.HP(750);
chikyū_no_ikari.HP(195000);
kaze_no_fuan.HP(189000);
kami_no_petto.HP(1200);
kami_no_gaurd.HP(210000);
akuma_no_petto.HP(1500);
akuma_no_gaurd.HP(240000);

dealion.AP(100);
frocato.AP(200);
tripleking.AP(250);
frozenfire.AP(70);
pyroshound.AP(40);
treestylona.AP(150);
pyroscombuster.AP(999);
frozenflood.AP(999);
majesto.AP(135);
chikyū_no_ikari.AP(999);
kaze_no_fuan.AP(999);
kami_no_petto.AP(500);
kami_no_gaurd.AP(999);
akuma_no_petto.AP(400);
akuma_no_gaurd.AP(999);

System.out.println(" The Mix of " + dealion.combo + " is called a Dealion.");
System.out.println(" The Mix of " + frocato.combo + " is called a Frocato.");
System.out.println(" The Mix of " + tripleking.combo + " is called a Triple King.");
System.out.println(" The Mix of " + frozenfire.combo + " is called a Frozen Fire.");
System.out.println(" The Mix of " + pyroshound.combo + " is called a Pyroshound.");
System.out.println(" The Mix of " + treestylona.combo + " is called a Treestylona.");
System.out.println(" The Mix of " + pyroscombuster.combo + " is called a Pyroscombuster.");
System.out.println(" The Mix of " + frozenflood.combo + " is called Frozen Flood.")
System.out.println(" The Mix of " + majesto.combo + " is called Majesto.");
System.out.println(" The Mix of " + chikyū_no_ikari.combo + " is called Chikyū no Ikari.");
System.out.println(" The Mix of " + kaze_no_fuan.combo + " is called Kaze no Fuan.");
System.out.println(" The Mix of " + kami_no_petto.combo + " is called Kami no Petto.");
System.out.println(" The Mix of " + kami_no_gaurd.combo + " is called Kami no Gaurd.");
System.out.println(" The Mix of " + akuma_no_petto.combo + " is called Akuma no Petto.");
System.out.println(" The Mix of " + akuma_no_gaurd.combo + " is called Akuma no Gaurd.");
}

}
// I didn't know what you wanted so this is it.
