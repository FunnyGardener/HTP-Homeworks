package net.k6;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[new Random().nextInt(151) + 50];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt();
        }

        Set<Integer> arraySet = new HashSet<Integer>();

        for (int i = 0; i < array.length; i++) {
            arraySet.add(array[i]);
        }

        List<Integer> arrayList = new ArrayList<Integer>();

        arrayList.addAll(arraySet);

        Collections.sort(arrayList);

        System.out.println(arrayList);

    }
}
