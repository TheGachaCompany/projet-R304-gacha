package fr.the_gacha_company.projet_r304_gacha.hero.roles;

import java.util.HashMap;
import java.util.Map;

public class PhysicalRole extends Role {

    public static final PhysicalRole SWORDSMAN = new PhysicalRole("Epéiste");
    public static final PhysicalRole ARCHER = new PhysicalRole("Archer");
    public static final PhysicalRole WARRIOR = new PhysicalRole("Combattant");

    private PhysicalRole(String name) {
        super(name);
    }

}
