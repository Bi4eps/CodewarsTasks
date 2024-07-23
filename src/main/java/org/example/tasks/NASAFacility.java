package org.example.tasks;

import java.util.ArrayList;

public class NASAFacility {
    public static int collision(char[][] room) {
        int maxSize = Math.max(room.length, room[0].length);
        ArrayList<Change> changes = new ArrayList<>();
        for (int steps = 1; steps < maxSize; steps++) {
            for (int i = 0; i < room.length; i++) {
                for (int j = 0; j < room[0].length; j++) {
                    switch (room[i][j]) {
                        case 'u' -> {
                            room[i][j] = '-';
                            if (i > 0) {
                                if (room[i - 1][j] == '-') {
                                    room[i - 1][j] = 'u';
                                } else {
                                    return steps;
                                }
                            }
                        }
                        case 'd' -> {
                            room[i][j] = '-';
                            if (i < room.length - 1) {
                                if (room[i + 1][j] == '-') {
                                    changes.add(new Change(i + 1, j, 'd'));
                                } else {
                                    return steps;
                                }
                            }
                        }
                        case 'r' -> {
                            room[i][j] = '-';
                            if (i < room[0].length - 1) {
                                if (room[i][j + 1] == '-') {
                                    changes.add(new Change(i, j + 1, 'r'));
                                } else {
                                    return steps;
                                }
                            }
                        }
                        case 'l' -> {
                            room[i][j] = '-';
                            if (j > 0) {
                                if (room[i][j - 1] == '-') {
                                    room[i][j - 1] = 'l';
                                } else {
                                    return steps;
                                }
                            }
                        }
                    }

                    for (Change temp : changes) {
                        if (temp.getX() == i && temp.getY() == j) {
                            if (room[i][j] == '-') {
                                room[i][j] = temp.getChar();
                            } else {
                                return steps;
                            }
                        }
                    }
                }
            }
        }

        return -1;
    }

    private static class Change {
        private final int x;
        private final int y;
        private char aChar;

        private Change(int x, int y, char newChar) {
            this.x = x;
            this.y = y;
            this.aChar = newChar;
        }

        public void setChar(char newChar) {
            this.aChar = newChar;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public char getChar() {
            return aChar;
        }
    }
}