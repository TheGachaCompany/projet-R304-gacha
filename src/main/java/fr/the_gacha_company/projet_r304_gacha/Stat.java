package fr.the_gacha_company.projet_r304_gacha;

public class Stat {

    private int hpMax;
    private double hp;
    private int attack;
    private float defense;
    private int speed;

    public Stat(int hpMax, int attack, float defense, int speed) {
        this.hpMax = hpMax;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        regen();
    }

    public int getHp_max() {
        return hpMax;
    }

    public double getHp() {
        return hp;
    }

    public void takeDamage(double damage) {
        hp -= damage;
    }
    
    public void regen() {
        hp = hpMax;
    }

    public int getAttack() {
        return attack;
    }

    public float getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }
    
    public boolean isDead() {
        return hp <= 0;
    }

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
