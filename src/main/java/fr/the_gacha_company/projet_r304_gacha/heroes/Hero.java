package fr.the_gacha_company.projet_r304_gacha.heroes;

import fr.the_gacha_company.projet_r304_gacha.Character;
import fr.the_gacha_company.projet_r304_gacha.Global;
import fr.the_gacha_company.projet_r304_gacha.Stat;
import fr.the_gacha_company.projet_r304_gacha.heroes.races.MagicalRace;
import fr.the_gacha_company.projet_r304_gacha.heroes.races.PhysicalRace;
import fr.the_gacha_company.projet_r304_gacha.heroes.races.Race;
import fr.the_gacha_company.projet_r304_gacha.heroes.roles.MagicalRole;
import fr.the_gacha_company.projet_r304_gacha.heroes.roles.PhysicalRole;
import fr.the_gacha_company.projet_r304_gacha.heroes.roles.Role;
import fr.the_gacha_company.projet_r304_gacha.threads.RegenJob;
import fr.the_gacha_company.projet_r304_gacha.threads.notifications.HeroEndedRegenNotification;
import fr.the_gacha_company.projet_r304_gacha.threads.notifications.NotificationManager;

import java.util.HashSet;
import java.util.Set;

/**
 * The abstract class that represent the Hero and extends Character
 */
public abstract class Hero extends Character {

    public static final int MAX_XP = 100;
    /**
     * The static methode that create a set of Hero and add all of them to it
     */
    public static Set<Hero> heroes = new HashSet<>(){{
        // COMMON
            // WARROIR
        add(new PhysicalHero("Godric", PhysicalRace.HUMAN, PhysicalRole.WARRIOR, Gender.MALE, Rarity.COMMON,
                "Godric, dit le puissant-chevalier, est un chevalier fanatique de l'Ordre", new Stat(45, 4, 0.25, 15)));
        add(new PhysicalHero("Borld", PhysicalRace.ORC, PhysicalRole.WARRIOR, Gender.MALE, Rarity.COMMON,
                "Borld est le Hacheur dès légion de l'Ouest", new Stat(35, 6, 0.2, 20)));
        add(new PhysicalHero("Fanir", PhysicalRace.HUMAN, PhysicalRole.BARBARIAN, Gender.FEMALE, Rarity.COMMON,
                "Fanir est  une barbare", new Stat(50, 3, 0.45, 17)));
        add(new PhysicalHero("Liseth", PhysicalRace.HUMAN, PhysicalRole.WARRIOR, Gender.FEMALE, Rarity.COMMON,
                "Liseth est une guerrière", new Stat(30, 7, 0.15, 25)));
        add(new PhysicalHero("Glarg", PhysicalRace.ORC, PhysicalRole.PALADIN, Gender.FEMALE, Rarity.COMMON,
                "Glarg est une paladine", new Stat(45, 4, 0.35, 20)));
            // ARCHER
        add(new PhysicalHero("Willam", PhysicalRace.HUMAN, PhysicalRole.ARCHER, Gender.MALE, Rarity.COMMON,
                "Willam est un archer du spectacle", new Stat(20, 6, 0.05, 25)));
        add(new PhysicalHero("Zorg", PhysicalRace.ORC, PhysicalRole.ARCHER, Gender.FEMALE, Rarity.COMMON,
                "paysan qui a trouvé un arc au sol ", new Stat(25, 10, 0.15, 15)));
        add(new PhysicalHero("Alimia", PhysicalRace.ORC, PhysicalRole.ARCHER, Gender.FEMALE, Rarity.COMMON,
                "elle est juste joli / elle n'a pas d’autre trait de caractère", new Stat(15, 9, 0.25, 25)));
        add(new PhysicalHero("Ynir", PhysicalRace.ORC, PhysicalRole.ARCHER, Gender.FEMALE, Rarity.COMMON,
                "ado d’une école d’archer", new Stat(22, 7, 0.045, 23)));
        add(new PhysicalHero("O'lod", PhysicalRace.ORC, PhysicalRole.ARCHER, Gender.FEMALE, Rarity.COMMON,
                "juste beau / il n'a pas d’autre trait de caractère", new Stat(17, 8, 0.035, 24)));
            // MAGE
        add(new MagicalHero("Snanar", MagicalRace.ELF, MagicalRole.MAGICIAN, Gender.FEMALE, Rarity.COMMON,
                "fille de bandit", new Stat(15, 7, 0.24, 15)));
        add(new MagicalHero("Liahana", MagicalRace.ELF, MagicalRole.MAGICIAN, Gender.FEMALE, Rarity.COMMON,
                "une fillette qui maîtrise la magie", new Stat(16, 6, 0.23, 17)));
        add(new MagicalHero("Grumborz", MagicalRace.ELF, MagicalRole.MAGICIAN, Gender.MALE, Rarity.COMMON,
                "fils de bandit", new Stat(17, 12, 0.22, 20)));
        add(new MagicalHero("Josiane", MagicalRace.ELF, MagicalRole.MAGICIAN, Gender.FEMALE, Rarity.COMMON,
                "Vieille dame à qui il ne faut surtout pas voler le sac à main", new Stat(18, 8, 0.25, 15)));
        add(new MagicalHero("Robert", MagicalRace.ELF, MagicalRole.MAGICIAN, Gender.MALE, Rarity.COMMON,
                "Un habitué des bars qui possède aucune défaite dans toute les mélées générales ", new Stat(20, 7, 0.25, 22)));

        // UNCOMMON
            // WARRIOR
        add(new PhysicalHero("Lyra", PhysicalRace.HUMAN, PhysicalRole.PALADIN, Gender.FEMALE, Rarity.UNCOMMON,
                "Lyra est une paladine", new Stat(40, 7, 0.55, 25)));
        add(new PhysicalHero("Abel", PhysicalRace.HUMAN, PhysicalRole.WARRIOR, Gender.MALE, Rarity.UNCOMMON,
                "Abel est un guerrier de l’armée royale", new Stat(45, 8, 0.50, 30)));
        add(new PhysicalHero("Burlo", PhysicalRace.ORC, PhysicalRole.WARRIOR, Gender.MALE, Rarity.UNCOMMON,
                "Burlo est un guerrier du roi qui a été recruter également en tant que bouffon du roi ", new Stat(50, 7, 0.45, 45)));
        add(new PhysicalHero("Kimberly", PhysicalRace.HUMAN, PhysicalRole.PALADIN, Gender.FEMALE, Rarity.UNCOMMON,
                "Kimberly se bat avec son style de combats particulié elle alterne les attaques à distance ( ses cries strident ) et les attaques de corp à corp ( ses ongles de 15 kilomètres ) ", new Stat(10, 20, 0.25, 30)));
            // ARCHER
        add(new PhysicalHero("Thal", PhysicalRace.ORC, PhysicalRole.ARCHER, Gender.MALE, Rarity.UNCOMMON,
                "Beau gosse du village ", new Stat(20, 12, 0.25, 40)));
        add(new PhysicalHero("Peutypié", PhysicalRace.HUMAN, PhysicalRole.ARCHER, Gender.MALE, Rarity.UNCOMMON,
                "C'est un ranger de la forêt de woodkney", new Stat(20, 13, 0.20, 50)));
        add(new PhysicalHero("Zodia", PhysicalRace.ORC, PhysicalRole.ARCHER, Gender.FEMALE, Rarity.UNCOMMON,
                "Archer des armées du chef de la tribu des ORC", new Stat(25, 14, 0.20, 35)));
        add(new PhysicalHero("Brigitte", PhysicalRace.HUMAN, PhysicalRole.ARCHER, Gender.FEMALE, Rarity.UNCOMMON,
                "Archer de l’armée royal ", new Stat(20, 12, 0.27, 45)));
            //MAGE
        add(new MagicalHero("Elalar", MagicalRace.ELF, MagicalRole.MAGICIAN, Gender.MALE, Rarity.UNCOMMON,
                "apprentie magicien", new Stat(20, 15, 0.24, 40)));
        add(new MagicalHero("Bilee", MagicalRace.ELF, MagicalRole.MAGICIAN, Gender.FEMALE, Rarity.UNCOMMON,
                "apprentie magiciene", new Stat(21, 17, 0.23, 45)));
        add(new MagicalHero("Ilbaga", MagicalRace.ELF, MagicalRole.MAGICIAN, Gender.MALE, Rarity.UNCOMMON,
                "Bandit maîtrisant la magie ", new Stat(22, 12, 0.22, 30)));
        add(new MagicalHero("Samantha", MagicalRace.ELF, MagicalRole.MAGICIAN, Gender.FEMALE, Rarity.UNCOMMON,
                "couturière utilisant la magie pour coudre ou se défendre ", new Stat(23, 13, 0.25, 35)));

        //RARE
            //WARRIOR
        add(new PhysicalHero("Vander", PhysicalRace.HUMAN, PhysicalRole.BARBARIAN, Gender.MALE, Rarity.RARE,
                "Humain qui tire sa puissance de sa transformation la nuit en loup garou ", new Stat(50, 20, 0.40, 40)));
        add(new PhysicalHero("Mukor", PhysicalRace.ORC, PhysicalRole.BARBARIAN, Gender.MALE, Rarity.RARE,
                "Mukor  tolère la bagarre … aime la bagarre …Adore la bagarre …ne vie que pour la bagarre", new Stat(45, 25, 0.30, 45)));
        add(new PhysicalHero("Miafiel", PhysicalRace.HUMAN, PhysicalRole.WARRIOR, Gender.FEMALE, Rarity.RARE,
                "Elle se bat et elle fait mal", new Stat(35, 30, 0.50, 50)));
            //ARCHER
        add(new PhysicalHero("Craven", PhysicalRace.HUMAN, PhysicalRole.ARCHER, Gender.MALE, Rarity.RARE,
                "Archer de la forêt de woodkney", new Stat(30, 20, 0.25, 45)));
        add(new PhysicalHero("Marguerite", PhysicalRace.HUMAN, PhysicalRole.ARCHER, Gender.FEMALE, Rarity.RARE,
                "Archer de la garde royale ", new Stat(35, 25, 0.30, 50)));
        add(new PhysicalHero("Ilol", PhysicalRace.ORC, PhysicalRole.ARCHER, Gender.FEMALE, Rarity.RARE,
                "chasseur de prime", new Stat(35, 21, 0.25, 55)));
            //MAGE
        add(new MagicalHero("Sylgolor", MagicalRace.ELF, MagicalRole.MAGICIAN, Gender.MALE, Rarity.RARE,
                "Prêtre de la forêt de WoodKney", new Stat(30, 30, 0.30, 25)));
        add(new MagicalHero("Inaxina", MagicalRace.ELF, MagicalRole.MAGICIAN, Gender.FEMALE, Rarity.RARE,
                "Voyante de la forêt de WoodKney", new Stat(35, 35, 0.25, 30)));
        add(new MagicalHero("Mash", MagicalRace.ELF, MagicalRole.MAGICIAN, Gender.MALE, Rarity.RARE,
                "Il pratique la magie des quadriceps ", new Stat(33, 40, 0.35, 50)));

        //EPIC
            //WARRIOR
        add(new PhysicalHero("Marius", PhysicalRace.HUMAN, PhysicalRole.WARRIOR, Gender.MALE, Rarity.EPIC,
                "Chef des armées du roi", new Stat(70, 50, 0.60, 60)));
        add(new PhysicalHero("Liarona", PhysicalRace.ORC, PhysicalRole.WARRIOR, Gender.FEMALE, Rarity.EPIC,
                "Héroïne de la forêt de WoodKney", new Stat(65, 55, 0.50, 65)));
            //ARCHER
        add(new PhysicalHero("Glundur", PhysicalRace.ORC, PhysicalRole.ARCHER, Gender.MALE, Rarity.EPIC,
                "Fanboy du grand Nomin", new Stat(55, 60, 0.30, 75)));
        add(new PhysicalHero("Ivern", PhysicalRace.HUMAN, PhysicalRole.ARCHER, Gender.MALE, Rarity.EPIC,
                "Humain maudit transformé en arbre qui se bat avec un arc qui tir des brindilles, c'est également le meilleur ami de Marguerite", new Stat(90, 15, 0.80, 80)));
            //MAGE
        add(new MagicalHero("Orga", MagicalRace.ELF, MagicalRole.MAGICIAN, Gender.FEMALE, Rarity.EPIC,
                "Fille du chef des ELF", new Stat(55, 60, 0.30, 75)));
        add(new MagicalHero("Merlin", MagicalRace.ELF, MagicalRole.MAGICIAN, Gender.MALE, Rarity.EPIC ,
                "Il a une barbe blanche soyeuse", new Stat(50, 60, 0.45, 25)));

        //LEGENDARY
            //WARRIOR
        add(new PhysicalHero("Charles", PhysicalRace.HUMAN, PhysicalRole.WARRIOR, Gender.MALE, Rarity.LEGENDARY,
                "Charles est le protecteur de Hauterre", new Stat(100, 55, 0.75, 65)));
            //ARCHER
        add(new PhysicalHero("Nomin", PhysicalRace.ORC, PhysicalRole.ARCHER, Gender.MALE, Rarity.LEGENDARY,
                "Nomin est un aventurier trop stylé se battant avec un arc de lumière magique qui one shot les boss de fin avec une imitation naze de HANZO dans Overwatch", new Stat(120, 80, 0.30, 80)));
            //MAGE
        add(new MagicalHero("Karen", MagicalRace.ELF, MagicalRole.MAGICIAN, Gender.FEMALE, Rarity.LEGENDARY ,
                "Karen une une mage qui tire sa puissance de ses cries surpuissant et strident capable de faire trembler des montagnes", new Stat(80, 70, 0.45, 60)));

    }};
    private static final double total;


    static {
        double temp = 0;
        for (Hero h: heroes) temp += h.rarity.lootChance;
        total = temp;
    }

    /**
     * Get a random Hero in order to give a hero to the player
     */
    public static Hero getRandomHero() {
        double x = Global.rand.nextDouble(total);
        double y = 0;
        for (Hero h: heroes) {
            y += h.rarity.lootChance;
            if (x<y) return h;
        }
        throw new RuntimeException("It's dangerous to go alone, take this.");
    }

    private final String name;
    private final Race race;
    private final Gender gender;
    private final Rarity rarity;
    private final String lore;

    private int level = 1;
    private int xp = 0;

    /**
     * The Constructor of Hero
     * @param name The name of the hero
     * @param race The race of the hero as a Race
     * @param role The role of the hero as a Role
     * @param gender The gender of the hero as a Gender
     * @param rarity The rarity of the hero as a Rarity
     * @param lore The lore of the hero
     * @param stat the stat of the hero as a Stat
     */
    public Hero(String name, Race race, Role role, Gender gender, Rarity rarity, String lore, Stat stat) {
        super(role, stat);
        this.getStat().boost(race.getBoost());
        this.name = name;
        this.race = race;
        this.gender = gender;
        this.rarity = rarity;
        this.lore = lore;
    }

    /**
     * Get the name of the Hero
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the Race of the Hero
     * @return the race
     */
    public Race getRace() {
        return race;
    }

    /**
     * Get the Gender of the Hero
     * @return the gender
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Get the Rarity of the Hero
     * @return the rarity
     */
    public Rarity getRarity() {
        return rarity;
    }

    /**
     * Get the lore of the hero
     * @return the lore
     */
    public String getLore() {
        return lore;
    }

    /**
     * Get the level of the hero
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Get the XP of the hero
     * @return the XP
     */
    public int getXp() {
        return xp;
    }

    /**
     * The methode that increase the level of the hero
     */
    public void levelUp() {
        ++level;
        getStat().increment();
    }

    /**
     * The methode that increase the xp of the hero
     * @param xp the xp that the methode will add to the XP of the hero
     */
    public void gainXp(int xp) {
        this.xp += xp;
        if (this.xp >= MAX_XP) {
            levelUp();
            this.xp = Math.floorMod(this.xp, MAX_XP);
        }
    }

    /**
     * The methode that start the thread that manage the regen of the hero
     * @param notificationManager the notificationManager
     */
    public void startRegenThread(NotificationManager notificationManager) {
        new Thread(new RegenJob(this, new HeroEndedRegenNotification(notificationManager, this))).start();
    }

    /**
     * The methode that create the minimal show that the player can see in the terminal
     * @return the minimalShow string
     */
    @Override
    public String minimalShow() {
        return name + " | " + race.getName() + " | " + getRole().getName() + " | " + gender.name + " | " + rarity.name +
                " | " + level + " | " + xp + " | " + getStat().getRoundedHp() + '/' + getStat().getHpMax() + " | " +
                getStat().getAttack() + " | " + (int) (getStat().getDefense()*100) + "% | " + getStat().getSpeed();
    }

    /**
     * The methode that create the show that the player can see in the terminal
     * @return the show string
     */
    @Override
    public String show() {
        String hp = getStat().getRoundedHp() + "/" + getStat().getHpMax();
        return String.format("""
                =========================
                |%s|
                | Race %16s |
                | Classe %14s |
                | Genre %15s |
                | Rareté %14s |
                | Lore %16s |
                | Level %15d |
                | PV %18s |
                | Attaque %13d |
                | Défense %12d%% |
                | Vitesse %13d |
                =========================""",
                Global.center(name,23), race.getName(), getRole().getName(), gender.name, rarity.name, lore, level,
                hp, getStat().getAttack(), (int) (getStat().getDefense()*100), getStat().getSpeed());
    }

    /**
     * the toString
     * @return a string
     */
    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", rarity=" + rarity +
                ", gender=" + gender +
                ", lore='" + lore + '\'' +
                '}';
    }
}
