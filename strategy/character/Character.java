public abstract class Character {
    protected Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    private String character() {
        return this.getClass().getName();
    }

    public void fight() {
        System.out.println(character() + " is fight with " + weapon.name());
    }
}
