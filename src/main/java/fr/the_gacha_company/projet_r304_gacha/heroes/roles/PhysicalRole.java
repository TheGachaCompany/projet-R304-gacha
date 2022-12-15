package fr.the_gacha_company.projet_r304_gacha.heroes.roles;

import java.util.List;

/**
 * Class that extend Role and implement the roles that relate with physical thing
 */
public class PhysicalRole extends Role {

    /**
     * The static instance of the PhysicalRole BARBARIAN
     */
    public static final PhysicalRole BARBARIAN = new PhysicalRole(0, "Barbare", new double[]{0.8, 0.7, 2, 1, 2});

    /**
     * The static instance of the PhysicalRole PALADIN
     */
    public static final PhysicalRole PALADIN = new PhysicalRole(1, "Paladin", new double[]{1.4, 0.7, 1.5, 1, 2});

    /**
     * The static instance of the PhysicalRole ARCHER
     */
    public static final PhysicalRole ARCHER = new PhysicalRole(2, "Archer", new double[]{1.5, 0.7, 1, 1.2, 2});

    /**
     * The static instance of the PhysicalRole WARRIOR
     */
    public static final PhysicalRole WARRIOR = new PhysicalRole(3, "Combattant", new double[]{1.6, 0.7, 1.5, 1, 2});

    /**
     * Get the list of the physical role
     * @return a List of physical role
     */
    public static List<Role> getRoles() {
        return List.of(BARBARIAN, PALADIN, ARCHER, WARRIOR);
    }

    /**
     * Constructor of MagicalRole
     * @param id The id of the role
     * @param name The name of the role
     * @param efficiency The efficiency of the role
     */
    private PhysicalRole(int id, String name, double[] efficiency) {
        super(id, name, efficiency);
    }

}
