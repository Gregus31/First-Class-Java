public class Player {

 private final String name;
 public int hp;

 public Player(String name) {
 this.name = name;
 this.hp = 100;
 }

 public void greet() {
 System.out.println("Bonjour, je suis "
+ name + " !");
 }

 public void takedamage(int dm){
    this.hp=this.hp-dm;
 }

  public void HP() {
 System.out.println("J'ai "
+ hp + " points de vie !");
 }
 public boolean isAlive() {
    return ((this.hp>0));
 }
 public static void main(String[] args) {
 Player p = new Player("Greg");
 p.greet();
 p.HP();
 p.takedamage(15);
 p.HP();
 System.out.println(p.isAlive());
 p.takedamage(85);
 System.out.println(p.isAlive());
 }
}
