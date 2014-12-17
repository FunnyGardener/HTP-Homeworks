package net.k6;

import net.k6.model.Parcel;
import net.k6.model.Post;
import net.k6.model.Size;

public class Main {

    public static void main(String[] args) {
        Parcel p1 = new Parcel(Size.SMALL,0.1,true);
        Parcel p2 = new Parcel(Size.MEDIUM,1.1,false);
        Parcel p3 = new Parcel(Size.LARGE,10.021,false);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        Post post = new Post();
        post.addParcel(p1);
        post.addParcel(p2);
        post.addParcel(p3);
        post.transferParcel(0);
        post.transferParcel(1);
        post.transferParcel(2);
        System.out.println(post.toString());

    }
}
