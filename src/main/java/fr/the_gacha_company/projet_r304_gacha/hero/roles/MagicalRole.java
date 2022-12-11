package fr.the_gacha_company.projet_r304_gacha.hero.roles;

import java.util.HashMap;
import java.util.Map;

public class MagicalRole extends Role {

    public enum MagicalRoleName {
        MAGICIAN
    }

    private static final Map<MagicalRoleName, MagicalRole> roles = new HashMap<>(){{
        put(MagicalRoleName.MAGICIAN, new MagicalRole(MagicalRoleName.MAGICIAN.toString()));
    }};

    public static MagicalRole get(MagicalRoleName name) {
        return roles.get(name);
    }

    private MagicalRole(String name) {
        super(name);
    }

}
