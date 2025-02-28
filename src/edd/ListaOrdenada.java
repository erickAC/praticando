package edd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaOrdenada {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 5, 2, 6, 4, 9, 3));

        Collections.sort(list);

//        list.forEach(System.out::println);

        Integer[] newList = {1, 5, 2, 6, 4, 9, 3};

        for (int i = 0; i < newList.length; i++) {
//            System.out.println(newList[i]);
            System.out.println("proximo valor " + newList[i + 1]);
            if (newList[i] < newList[i + 1]) {
                if (newList[i - 1] != null) {
                    System.out.println(newList[i]);

                }
            } else {
                return;
            }

        }


    }

}
