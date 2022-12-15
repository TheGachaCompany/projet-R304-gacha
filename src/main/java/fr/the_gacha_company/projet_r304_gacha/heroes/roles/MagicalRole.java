package fr.the_gacha_company.projet_r304_gacha.heroes.roles;

import java.util.List;

public class MagicalRole extends Role {

    public static final MagicalRole MAGICIAN = new MagicalRole(4, "Magicien", new double[]{2, 2, 2, 2, 0.5});

    public static List<Role> getRoles() {
        return List.of(MAGICIAN);
    }

    private MagicalRole(int id, String name, double[] efficiency) {
        super(id, name, efficiency);
    }

}
