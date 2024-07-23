package org.example.tasks;

public class NASAFacility {
    public static int collision(char[][] room) {
        int maxSize = Math.max(room.length, room[0].length);
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
                        case 'd' -> {  }
                        case 'r' -> {  }
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
                }
            }
        }

        return -1;
    }

    private class Change {
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