package fr.the_gacha_company.projet_r304_gacha.heroes.roles;

public abstract class Role {

    private final String name;

    public Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
