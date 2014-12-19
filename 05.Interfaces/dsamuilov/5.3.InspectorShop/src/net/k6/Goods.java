package net.k6;

public class Goods {

    private Date expirationDate;
    private static final int expirationDateCount = 5;
    private TypeGoods type;
    private Date releaseDate;
    private static int nextId = 1;
    private int id;
    private int cost;
    private boolean flagDelete = false;

    Goods(TypeGoods type, int cost, Date releaseDate) {
        this.id = nextId++;
        this.type = type;
        this.cost = cost;
        this.releaseDate = releaseDate;
        expirationDate = new Date(releaseDate.getDay(), releaseDate.getMonth(), releaseDate.getYear() + expirationDateCount);
    }

    public TypeGoods getType() {
        return type;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public boolean isFlagDelete() {
        return flagDelete;
    }

    public int getId() {
        return id;
    }

    public int getCost() {
        return cost;
    }

    public void setFlagDelete(boolean flagDelete) {
        this.flagDelete = flagDelete;
    }

    public String toString() {
        return "Goods(" + " Id: " + getId()
                + " Type of goods: " + type
                + " Cost: " + getCost()
                + " Release data: " + getReleaseDate()
                + " Expiration date: " + getExpirationDate()
                + "\n";
    }


}
