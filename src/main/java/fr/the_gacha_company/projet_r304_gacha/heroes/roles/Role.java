package fr.the_gacha_company.projet_r304_gacha.heroes.roles;

import fr.the_gacha_company.projet_r304_gacha.Global;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Role {

    // TODO : put a map as non-static attribute to store data
    public static final Map<Role, Map<Role, Double>> efficency = new HashMap<>();

    public static Role getRandom() {
        List<Role> roles = new ArrayList<>();
        roles.addAll(PhysicalRole.getRoles());
        roles.addAll(MagicalRole.getRoles());
        return roles.get(Global.rand.nextInt(roles.size()));
    }

    static {

    }

    private static Map<Role, Double> createEfficencyEmptyMap() {
        Map<Role, Double> map = new HashMap<>();
        List<Role> roles = new ArrayList<>();
        roles.addAll(PhysicalRole.getRoles());
        roles.addAll(MagicalRole.getRoles());
        for (Role r: roles)
            map.put(r, 1.0);
        return map;
    }

    private final String name;

    public Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
