package fr.the_gacha_company.projet_r304_gacha.heroes.roles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Role {

    public static final Map<Role, Map<Role, Double>> efficency = new HashMap<>();

    static {
        Map<Role, Double> map = createEfficencyEmptyMap();

        //ARCHER
        map.put(PhysicalRole.ARCHER, 1d);
        efficency.put(PhysicalRole.ARCHER, map);

        map = createEfficencyEmptyMap();
        map.put(PhysicalRole.BARBARIAN, 1.5);
        efficency.put(PhysicalRole.ARCHER, map);

        map = createEfficencyEmptyMap();
        map.put(PhysicalRole.PALADIN, 0.7);
        efficency.put(PhysicalRole.ARCHER, map);

        map = createEfficencyEmptyMap();
        map.put(PhysicalRole.WARRIOR, 1.2);
        efficency.put(PhysicalRole.ARCHER, map);

        map = createEfficencyEmptyMap();
        map.put(MagicalRole.MAGICIAN, 2d);
        efficency.put(PhysicalRole.ARCHER, map);

        //BARBARIAN
        map = createEfficencyEmptyMap();
        map.put(PhysicalRole.ARCHER, 2d);
        efficency.put(PhysicalRole.BARBARIAN, map);

        map = createEfficencyEmptyMap();
        map.put(PhysicalRole.BARBARIAN, 0.8);
        efficency.put(PhysicalRole.BARBARIAN, map);

        map = createEfficencyEmptyMap();
        map.put(PhysicalRole.PALADIN, 0.7);
        efficency.put(PhysicalRole.BARBARIAN, map);

        map = createEfficencyEmptyMap();
        map.put(PhysicalRole.WARRIOR, 1d);
        efficency.put(PhysicalRole.BARBARIAN, map);

        map = createEfficencyEmptyMap();
        map.put(MagicalRole.MAGICIAN, 2d);
        efficency.put(PhysicalRole.BARBARIAN, map);

        //Paladin
        map = createEfficencyEmptyMap();
        map.put(PhysicalRole.ARCHER, 1.5);
        efficency.put(PhysicalRole.PALADIN, map);

        map = createEfficencyEmptyMap();
        map.put(PhysicalRole.BARBARIAN, 1.4);
        efficency.put(PhysicalRole.PALADIN, map);

        map = createEfficencyEmptyMap();
        map.put(PhysicalRole.PALADIN, 0.7);
        efficency.put(PhysicalRole.PALADIN, map);

        map = createEfficencyEmptyMap();
        map.put(PhysicalRole.WARRIOR, 1d);
        efficency.put(PhysicalRole.PALADIN, map);

        map = createEfficencyEmptyMap();
        map.put(MagicalRole.MAGICIAN, 2d);
        efficency.put(PhysicalRole.PALADIN, map);

        //Warrior
        map = createEfficencyEmptyMap();
        map.put(PhysicalRole.ARCHER, 1.5);
        efficency.put(PhysicalRole.WARRIOR, map);

        map = createEfficencyEmptyMap();
        map.put(PhysicalRole.BARBARIAN, 1.6);
        efficency.put(PhysicalRole.WARRIOR, map);

        map = createEfficencyEmptyMap();
        map.put(PhysicalRole.PALADIN, 0.7);
        efficency.put(PhysicalRole.WARRIOR, map);

        map = createEfficencyEmptyMap();
        map.put(PhysicalRole.WARRIOR, 1d);
        efficency.put(PhysicalRole.WARRIOR, map);

        map = createEfficencyEmptyMap();
        map.put(MagicalRole.MAGICIAN, 2d);
        efficency.put(PhysicalRole.WARRIOR, map);

        //Magician
        map = createEfficencyEmptyMap();
        map.put(PhysicalRole.ARCHER, 2d);
        efficency.put(MagicalRole.MAGICIAN, map);

        map = createEfficencyEmptyMap();
        map.put(PhysicalRole.BARBARIAN, 2d);
        efficency.put(MagicalRole.MAGICIAN, map);

        map = createEfficencyEmptyMap();
        map.put(PhysicalRole.PALADIN, 2d);
        efficency.put(MagicalRole.MAGICIAN, map);

        map = createEfficencyEmptyMap();
        map.put(PhysicalRole.WARRIOR, 2d);
        efficency.put(MagicalRole.MAGICIAN, map);

        map = createEfficencyEmptyMap();
        map.put(MagicalRole.MAGICIAN, 0.5);
        efficency.put(MagicalRole.MAGICIAN, map);
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
