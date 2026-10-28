package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {

        String[] guests = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax",
                "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei",
                "Martina Maccherone", "Rachel Zeilic" };

        Scanner sc = new Scanner(System.in);

        System.out.println("Per entrare nel party dei Ferragnez, per favore dire il proprio nome");

        String guest = sc.nextLine().trim().replaceAll("\\s+", " ");

        boolean isGuestInList = false;

        for (int i = 0; i < guests.length; i++) {

            if (guest.equalsIgnoreCase(guests[i])) {
                isGuestInList = true;
                break;
            }
        }

        if (isGuestInList) {
            System.out.println("Puoi entrare!");
        } else {
            System.out.println("Non sei nella lista invitati, non puoi entrare!");
        }

        sc.close();
    }
}
