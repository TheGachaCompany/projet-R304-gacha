package fr.the_gacha_company.projet_r304_gacha.heroes.roles;

import java.util.List;

public class PhysicalRole extends Role {

    public static final PhysicalRole BARBARIAN = new PhysicalRole("Barbare");

    public static final PhysicalRole PALADIN = new PhysicalRole("Paladin");
    public static final PhysicalRole ARCHER = new PhysicalRole("Archer");
    public static final PhysicalRole WARRIOR = new PhysicalRole("Combattant");

    public static List<Role> getRoles() {
        return List.of(BARBARIAN, PALADIN, ARCHER, WARRIOR);
    }

    private PhysicalRole(String name) {
        super(name);
    }

}
