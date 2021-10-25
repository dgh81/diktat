package com.company;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Media media1 = new Media();
        LocalDate myDate = LocalDate.now();

        Media media2 = new Media("min titel", "min beskrivelse");
        //System.out.println(media2.getTitel());
        System.out.println(media2.toString());

        System.out.println(media1.toString());

        for (int i = 0; i < 50; i++) {
            Media media = new Media();
            System.out.println(media.toString());
        }
    }
}
