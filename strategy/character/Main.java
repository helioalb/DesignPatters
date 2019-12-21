public class Main {
    public static void main(String[] args) {
        Weapon knife = new Knife();
        Weapon sword = new Sword();

        Character king = new King();
        Character troll = new Troll();

        king.setWeapon(sword);
        king.fight();

        troll.setWeapon(knife);
        troll.fight();

        // Change weapons

        king.setWeapon(knife);
        king.fight();

        troll.setWeapon(sword);
        troll.fight();
    }
}
