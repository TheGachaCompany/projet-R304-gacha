package fr.the_gacha_company.projet_r304_gacha.heroes.roles;

import fr.the_gacha_company.projet_r304_gacha.Global;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Role {

    public static Role getRandom() {
        List<Role> roles = new ArrayList<>();
        roles.addAll(PhysicalRole.getRoles());
        roles.addAll(MagicalRole.getRoles());
        return roles.get(Global.rand.nextInt(roles.size()));
    }

    private final int id;
    private final String name;
    private final double[] efficiency;

    public Role(int id, String name, double[]  efficiency) {
        this.id = id;
        this.name = name;
        this.efficiency = efficiency;
    }

    public int getId() {return id;}

    public String getName() {
        return name;
    }

    public double getEfficency(int id) {
        return efficiency[id];
    }

}
