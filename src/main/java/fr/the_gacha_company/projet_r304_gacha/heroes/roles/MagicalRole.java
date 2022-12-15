package fr.the_gacha_company.projet_r304_gacha.heroes.roles;

import java.util.List;

/**
 * Class that extend Role and implement the roles that relate with magic
 */
public class MagicalRole extends Role {

    public static final MagicalRole MAGICIAN = new MagicalRole(4, "Magicien", new double[]{2, 2, 2, 2, 0.5});

    /**
     * Get the list of all the magical roles
     * @return roles list
     */
    public static List<Role> getRoles() {
        return List.of(MAGICIAN);
    }

    /**
     * Constructor of MagicalRole
     * @param id The id of the role
     * @param name The name of the role
     * @param efficiency The efficiency of the role
     */
    private MagicalRole(int id, String name, double[] efficiency) {
        super(id, name, efficiency);
    }
}
