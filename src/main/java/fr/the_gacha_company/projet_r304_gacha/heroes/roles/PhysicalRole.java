package fr.the_gacha_company.projet_r304_gacha.heroes.roles;

import java.util.List;

public class PhysicalRole extends Role {

    public static final PhysicalRole BARBARIAN = new PhysicalRole(0, "Barbare", new double[]{0.8, 0.7, 2, 1, 2});
    public static final PhysicalRole PALADIN = new PhysicalRole(1, "Paladin", new double[]{1.4, 0.7, 1.5, 1, 2});
    public static final PhysicalRole ARCHER = new PhysicalRole(2, "Archer", new double[]{1.5, 0.7, 1, 1.2, 2});
    public static final PhysicalRole WARRIOR = new PhysicalRole(3, "Combattant", new double[]{1.6, 0.7, 1.5, 1, 2});

    public static List<Role> getRoles() {
        return List.of(BARBARIAN, PALADIN, ARCHER, WARRIOR);
    }

    private PhysicalRole(int id, String name, double[] efficiency) {
        super(id, name, efficiency);
    }

}
