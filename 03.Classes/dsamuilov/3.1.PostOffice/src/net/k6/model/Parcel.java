package net.k6.model;

public class Parcel {

    private String size;
    private final static String adressFrom = "AZ";
    private final static String adressTo = "ZA";
    private String id;
    private static int nextId = 1;
    private double weight;
    private boolean express;
    private boolean tarnsferStatus;


    public Parcel(Size size, double weight, boolean express) {
        this.id = String.valueOf(nextId++);
        this.size = size.toString();
        this.weight = weight;
        this.express = express;

    }


    public void setTransferStatus(boolean tarnsferStatus) {
        this.tarnsferStatus = tarnsferStatus;
    }

    public String getSize() {
        return size;
    }

    public String getId() {
        switch (id.length()) {
            case 1:
                id = adressFrom + "000" + id + adressTo;
                break;
            case 2:
                id = adressFrom + "00" + id + adressTo;
                break;
            case 3:
                id = adressFrom + "0" + id + adressTo;
                break;
        }
        return id;
    }

    public double getWeight() {
        return this.weight;
    }

    public boolean isExpress() {
        return this.express;
    }

    public boolean isTarnsferStatus() {
        return this.tarnsferStatus;
    }

    public String getAdressFrom() {
        return adressFrom;
    }

    public String getAdressTo() {
        return adressTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Parcel parcel = (Parcel) o;
        return getId().equals(parcel.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }

    @Override
    public String toString() {
        return "Parcel(" + "From: " + adressFrom
                + " To: " + adressTo
                + " id: " + getId()
                + " Express: " + isExpress()
                + " Transfer status: " + isTarnsferStatus() + ')';
    }


}
