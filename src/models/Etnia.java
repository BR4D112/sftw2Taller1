package models;

public enum Etnia {
    IND("Indigena"), AFRO("Afroamericano"), RAIZAL("Raizal");
    public String name;

    private Etnia(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
