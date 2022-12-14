package fr.the_gacha_company.projet_r304_gacha.heroes.roles;

public class PhysicalRole extends Role {

    public static final PhysicalRole BARBARIAN = new PhysicalRole("Barbare");
    public static final PhysicalRole ARCHER = new PhysicalRole("Archer");
    public static final PhysicalRole WARRIOR = new PhysicalRole("Combattant");

    private PhysicalRole(String name) {
        super(name);
    }

}
