package org.example;

import org.example.tasks.NASAFacility;

public class Main {
    public static void main(String[] args) {
        //System.out.println(NASAFacility.collision(new char[][]{{'-', '-'}, {'-', '-'}}));
        //System.out.println(NASAFacility.collision(new char[][]{{'r', '-'}, {'u', 'u'}}));
        System.out.println(NASAFacility.collision(new char[][]{
                "-r--l".toCharArray(),
                "-----".toCharArray(),
                "-u-d-".toCharArray(),
                "----l".toCharArray(),
                "-----".toCharArray(),
        }));
        System.out.println(NASAFacility.collision(new char[][]{
                "-----".toCharArray(),
                "--d-l".toCharArray(),
                "-----".toCharArray(),
                "rr--u".toCharArray(),
                "--l--".toCharArray(),
        }));

        /*System.out.println(NASAFacility.collision(new char[][]{
                "-u---".toCharArray(),
                "---uu".toCharArray(),
                "---r-".toCharArray(),
                "--r--".toCharArray(),
                "-d---".toCharArray(),
        }));*/

        /*char[][] room = new char[2][5];
        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[0].length; j++) {
                System.out.print(i + "." + j + " ");
            }
            System.out.println();
        }
        System.out.println(room.length);*/
    }
}