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

public abstract class Hero extends Character {

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
                "Glarg est une paladin", new Stat(45, 4, 0.35, 20)));
            // ARCHER
        add(new PhysicalHero("Willam", PhysicalRace.HUMAN, PhysicalRole.ARCHER, Gender.MALE, Rarity.COMMON,
                "Willam est un archer du spectacle", new Stat(20, 6, 0.05, 25)));
        add(new PhysicalHero("ZORG", PhysicalRace.ORC, PhysicalRole.ARCHER, Gender.FEMALE, Rarity.COMMON,
                "paysan qui a trouver un arc au sol ", new Stat(25, 10, 0.15, 15)));
        add(new PhysicalHero("Alimia", PhysicalRace.ORC, PhysicalRole.ARCHER, Gender.FEMALE, Rarity.COMMON,
                "elle est juste joli / pas d’autre caractère", new Stat(15, 9, 0.25, 25)));
        add(new PhysicalHero("Ynir", PhysicalRace.ORC, PhysicalRole.ARCHER, Gender.FEMALE, Rarity.COMMON,
                "ado d’une école d’archer", new Stat(22, 7, 0.045, 23)));
        add(new PhysicalHero("O'lod", PhysicalRace.ORC, PhysicalRole.ARCHER, Gender.FEMALE, Rarity.COMMON,
                "juste beau / il a pas d’autre caractère", new Stat(17, 8, 0.035, 24)));
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
                "Un habitué des bars qui possède aucune défaite dans toute les mélée général ", new Stat(20, 7, 0.25, 22)));

        // UNCOMMON
            // WARRIOR
        add(new PhysicalHero("Lyra", PhysicalRace.HUMAN, PhysicalRole.PALADIN, Gender.FEMALE, Rarity.UNCOMMON,
                "Lyra est une paladine", new Stat(40, 7, 0.55, 25)));
        add(new PhysicalHero("Abel", PhysicalRace.HUMAN, PhysicalRole.WARRIOR, Gender.MALE, Rarity.UNCOMMON,
                "Abel est un guerrier de l’armée royal", new Stat(45, 8, 0.50, 30)));
        add(new PhysicalHero("Burlo", PhysicalRace.ORC, PhysicalRole.WARRIOR, Gender.MALE, Rarity.UNCOMMON,
                "Burlo est un guerrier du roi qui a été recruté également en tant que bouffon ", new Stat(50, 7, 0.45, 45)));
        add(new PhysicalHero("Kimberly", PhysicalRace.HUMAN, PhysicalRole.PALADIN, Gender.FEMALE, Rarity.UNCOMMON,
                "Kimberly se bat avec son style de combats particulier elle alterne les attaque à distance ( ses crie strident ) et les attaque de corp a corp ( ses ongles de 15 kilomètres ) ", new Stat(10, 20, 0.25, 30)));
            // ARCHER
        add(new PhysicalHero("Thal", PhysicalRace.ORC, PhysicalRole.ARCHER, Gender.MALE, Rarity.UNCOMMON,
                "Beaux gosse du village elf", new Stat(20, 12, 0.25, 40)));
        add(new PhysicalHero("Peutypié", PhysicalRace.HUMAN, PhysicalRole.ARCHER, Gender.MALE, Rarity.UNCOMMON,
                "C est un ranger de la forest de woodkney", new Stat(20, 13, 0.20, 50)));
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
                "Archer de la forest de woodkney", new Stat(30, 20, 0.25, 45)));
        add(new PhysicalHero("Marguerite", PhysicalRace.HUMAN, PhysicalRole.ARCHER, Gender.FEMALE, Rarity.RARE,
                "Archer de la garde royal ", new Stat(35, 25, 0.30, 50)));
        add(new PhysicalHero("Ilol", PhysicalRace.ORC, PhysicalRole.ARCHER, Gender.FEMALE, Rarity.RARE,
                "chasseur de prime", new Stat(35, 21, 0.25, 55)));
            //MAGE
        add(new MagicalHero("Sylgolor", MagicalRace.ELF, MagicalRole.MAGICIAN, Gender.MALE, Rarity.RARE,
                "Prêtre de la forest de WoodKney", new Stat(30, 30, 0.30, 25)));
        add(new MagicalHero("Inaxina", MagicalRace.ELF, MagicalRole.MAGICIAN, Gender.FEMALE, Rarity.RARE,
                "Voyante de la forest de WoodKney", new Stat(35, 35, 0.25, 30)));
        add(new MagicalHero("Mash", MagicalRace.ELF, MagicalRole.MAGICIAN, Gender.MALE, Rarity.RARE,
                "Il pratique la magie des quadriceps ", new Stat(33, 40, 0.35, 50)));

        //EPIC
            //WARRIOR
        add(new PhysicalHero("Marius", PhysicalRace.HUMAN, PhysicalRole.WARRIOR, Gender.MALE, Rarity.EPIC,
                "Chef des armées du roi", new Stat(70, 50, 0.60, 60)));
        add(new PhysicalHero("Liarona", PhysicalRace.ORC, PhysicalRole.WARRIOR, Gender.FEMALE, Rarity.EPIC,
                "Héroïne de la forest de WoodKney", new Stat(65, 55, 0.50, 65)));
            //ARCHER
        add(new PhysicalHero("Glundur", PhysicalRace.ORC, PhysicalRole.ARCHER, Gender.MALE, Rarity.EPIC,
                "Fanboy du grand Nomin", new Stat(55, 60, 0.30, 75)));
        add(new PhysicalHero("Ivern", PhysicalRace.HUMAN, PhysicalRole.ARCHER, Gender.MALE, Rarity.EPIC,
                "Humain maudit transformer en arbre qui se bats avec un arc qui tir des brindilles , c'est également le meilleur amie de Margerite", new Stat(90, 15, 0.80, 80)));
            //MAGE
        add(new MagicalHero("Orga", MagicalRace.ELF, MagicalRole.MAGICIAN, Gender.FEMALE, Rarity.EPIC,
                "Fille du chef des ELF", new Stat(55, 60, 0.30, 75)));
        add(new MagicalHero("Merlin", MagicalRace.ELF, MagicalRole.MAGICIAN, Gender.MALE, Rarity.EPIC ,
                "Il a une barbe blanche soyeuse", new Stat(50, 60, 0.45, 25)));

        //LEGENDAIRE



    }};
    private static final double total;

    static {
        double temp = 0;
        for (Hero h: heroes) temp += h.rarity.lootChance;
        total = temp;
    }

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
    private final Role role;
    private final Gender gender;
    private final Rarity rarity;
    private final String lore;

    private int level = 1;
    private int xp = 0;

    public Hero(String name, Race race, Role role, Gender gender, Rarity rarity, String lore, Stat stat) {
        super(stat);
        this.getStat().boost(race.getBoost());
        this.name = name;
        this.race = race;
        this.role = role;
        this.gender = gender;
        this.rarity = rarity;
        this.lore = lore;
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public Role getRole() {
        return role;
    }

    public Gender getGender() {
        return gender;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public String getLore() {
        return lore;
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }

    public void levelUp() {
        ++level;
        xp = 0;
    }

    public void startRegenThread(NotificationManager notificationManager) {
        new Thread(new RegenJob(this, new HeroEndedRegenNotification(notificationManager, this))).start();
    }

    @Override
    public String minimalShow() {
        return name + " | " + race.getName() + " | " + role.getName() + " | " + gender.name + " | " + rarity.name +
                " | " + level + " | " + getStat().getRoundedHp() + '/' + getStat().getHpMax() + " | " +
                getStat().getAttack() + " | " + (int) (getStat().getDefense()*100) + "% | " + getStat().getSpeed();
    }

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
                Global.center(name,23), race.getName(), role.getName(), gender.name, rarity.name, lore, level,
                hp, getStat().getAttack(), (int) (getStat().getDefense()*100), getStat().getSpeed());
    }

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
