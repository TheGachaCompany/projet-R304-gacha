package fr.the_gacha_company.projet_r304_gacha;

public class Enemy {

    public static Enemy createRandom() {
        return null;
    }

    private final Stat stat;

    private Enemy(Rarity rarity, Gender gender, int hp_max, int attack, int defense, int speed) {
        this.stat = new Stat(rarity, gender, hp_max, attack, defense, speed);
    }

}
