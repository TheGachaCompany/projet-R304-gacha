package fr.the_gacha_company.projet_r304_gacha.heroes.roles;

import fr.the_gacha_company.projet_r304_gacha.Global;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract class that represent role that Heroes and Monster can have
 */
public abstract class Role {

    /**
     * Get a random role within the physical and magical roles
     * @return A random role
     */
    public static Role getRandom() {
        List<Role> roles = new ArrayList<>();
        roles.addAll(PhysicalRole.getRoles());
        roles.addAll(MagicalRole.getRoles());
        return roles.get(Global.rand.nextInt(roles.size()));
    }

    private final int id;
    private final String name;
    private final double[] efficiency;

    /**
     * Create a new role
     * @param id The role id
     * @param name The name of the role
     * @param efficiency The efficiency the attack of this role have on other role store in an array of double
     */
    public Role(int id, String name, double[]  efficiency) {
        this.id = id;
        this.name = name;
        this.efficiency = efficiency;
    }

    /**
     * Get the id of the role
     * @return The id
     */
    public int getId() {return id;}

    /**
     * Get the name of the role
     * @return The name
     */
    public String getName() {
        return name;
    }


    /**
     * Get the efficiency of the attack of this role
     * @param id
     * @return The efficiency
     */
    public double getEfficency(int id) {
        return efficiency[id];
    }

}
