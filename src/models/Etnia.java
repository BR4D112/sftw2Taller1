package models;

public enum Etnia {
    IND("Indigena"), AFRO("Afrodescendiente"), RAIZAL("Mestizo");
    public String name;

    private Etnia(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public Etnia getEtniabyName(String nameIn){
        for (Etnia etnia : Etnia.values()) {
            if (etnia.equals(nameIn)) {
                return etnia;
            }
        }
        return null;
    }
}
