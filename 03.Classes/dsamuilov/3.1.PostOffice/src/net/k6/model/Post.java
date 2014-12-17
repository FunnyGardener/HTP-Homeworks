package net.k6.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Post {
    private List<Parcel> parcels = new ArrayList<Parcel>();

    public void addParcel(Parcel parcel) {
        this.parcels.add(parcel);
        if (equals(this.parcels, parcel)) {
            this.parcels.remove(parcel);
            System.out.println("Parsel is not accepted");
        }
    }

    public void transferParcel(int id) {
        if (!parcels.isEmpty()) parcels.get(id).setTransferStatus(true);
    }

    public static boolean equals(List<Parcel> parsels, Parcel parcel) {
        Iterator<Parcel> iterator = parsels.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(parcel)) return false;
        }
        return true;

    }

    @Override
    public String toString() {
        return this.parcels.toString();
    }

}
