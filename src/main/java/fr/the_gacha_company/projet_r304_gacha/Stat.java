package fr.the_gacha_company.projet_r304_gacha;

public class Stat {

    private int hpMax;
    private double hp;
    private int attack;
    private double defense;
    private int speed;

    public Stat(int hpMax, int attack, double defense, int speed) {
        this.hpMax = hpMax;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        fullRegen();
    }

    public int getHpMax() {
        return hpMax;
    }

    private void changeHpMax(int v) {
        this.hpMax += v;
        hp = Math.max(0, hp+v);
    }

    public double getHp() {
        return hp;
    }

    public int getRoundedHp() {
        return (int) Math.round(hp);
    }

    public void takeDamage(double damage) {
        hp -= damage;
    }

    public void regen1Hp() {
        hp = Math.min(hpMax, hp+1);
    }
    
    public void fullRegen() {
        hp = hpMax;
    }

    public int getAttack() {
        return attack;
    }

    public double getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFull() {
        return hp >= hpMax;
    }
    
    public boolean isDead() {
        return hp <= 0;
    }

    public void boost(Stat stat) {
        System.out.println(this);
        changeHpMax(stat.getHpMax());
        attack += stat.getAttack();
        defense += stat.getDefense();
        speed += stat.getSpeed();
        System.out.println(this);
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
