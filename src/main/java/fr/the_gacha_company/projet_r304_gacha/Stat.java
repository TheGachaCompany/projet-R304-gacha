package fr.the_gacha_company.projet_r304_gacha;

/**
 * Class that represent the stat
 */
public class Stat {

    private int hpMax;
    private double hp;
    private int attack;
    private double defense;
    private int speed;

    /**
     * Constructor of stat
     * @param hpMax the hpMax of the stat
     * @param attack the attack of the stat
     * @param defense the defense of the stat
     * @param speed the speed of the stat
     */
    public Stat(int hpMax, int attack, double defense, int speed) {
        this.hpMax = hpMax;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        fullRegen();
    }

    /**
     * Get the max hp
     * @return max hp
     */
    public int getHpMax() {
        return hpMax;
    }

    /**
     * Change the max hp of a value of v
     * @param v the value to change the max hp
     */
    private void changeHpMax(int v) {
        this.hpMax += v;
        hp = Math.max(0, hp+v);
    }

    /**
     * Get the hp
     * @return the hp
     */
    public double getHp() {
        return hp;
    }

    /**
     * Get the rounded hp
     * @return the rounded hp
     */
    public int getRoundedHp() {
        return (int) Math.round(hp);
    }

    /**
     * Methode that handel the damage dealing
     * @param damage the damage to deal
     */
    public void takeDamage(double damage) {
        hp = Math.max(hp-damage, 0);
    }

    /**
     * Methode that regen 1 hp
     */
    public void regen1Hp() {
        hp = Math.min(hpMax, hp+1);
    }

    /**
     * Methode that regen all the hp
     */
    public void fullRegen() {
        hp = hpMax;
    }

    /**
     * Get the attack
     * @return the attack
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Get the defense
     * @return the defense
     */
    public double getDefense() {
        return defense;
    }

    /**
     * Get the speed
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * A predicate that return true if hp is more or even with hpMax
     * @return boolean
     */
    public boolean isFull() {
        return hp >= hpMax;
    }

    /**
     * A predicate that return true if hp is less of even with 0
      * @return boolean
     */
    public boolean isDead() {
        return hp <= 0;
    }

    /**
     * methode that handle the race boost
     * @param stat the boost that the race give
     */
    public void boost(Stat stat) {
        changeHpMax(stat.getHpMax());
        attack += stat.getAttack();
        defense += stat.getDefense();
        speed += stat.getSpeed();
    }

    /**
     * Methode that increment the stat
     */
    public void increment() {
        changeHpMax(1);
        attack += 1;
        defense += 0.01;
        speed += 1;
    }

    /**
     * ToString
     * @return toString
     */
    @Override
    public String toString() {
        return "Stat{" +
                "hpMax=" + hpMax +
                ", hp=" + hp +
                ", attack=" + attack +
                ", defense=" + defense +
                ", speed=" + speed +
                '}';
    }

}
