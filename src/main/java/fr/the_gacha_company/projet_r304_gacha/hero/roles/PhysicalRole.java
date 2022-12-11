package fr.the_gacha_company.projet_r304_gacha.hero.roles;

import java.util.HashMap;
import java.util.Map;

public class PhysicalRole extends Role {

    public enum PhysicalRoleName {
        SWORDSMAN, ARCHER
    }

    private static final Map<PhysicalRoleName, PhysicalRole> roles = new HashMap<>(){{
        put(PhysicalRoleName.SWORDSMAN, new PhysicalRole(PhysicalRoleName.SWORDSMAN.toString()));
        put(PhysicalRoleName.ARCHER, new PhysicalRole(PhysicalRoleName.ARCHER.toString()));
    }};

    public static PhysicalRole get(PhysicalRoleName name) {
        return roles.get(name);
    }

    private PhysicalRole(String name) {
        super(name);
    }


}
