package fr.the_gacha_company.projet_r304_gacha.heroes.roles;

import java.util.List;

public class MagicalRole extends Role {

    public static final MagicalRole MAGICIAN = new MagicalRole("Magicien");

    public static List<Role> getRoles() {
        return List.of(MAGICIAN);
    }

    private MagicalRole(String name) {
        super(name);
    }

}
