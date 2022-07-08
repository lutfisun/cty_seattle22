package com.mycompany.objectpractice;

public class RollDice {

    public static void main(String[] args) {

        Die d1 = new Die(6, "black");
        int rolls = 0;
        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fours = 0;
        int fives = 0;
        int sixes = 0;

        while (rolls < 1000) {
            System.out.println("d1 face value " + d1.getFaceValue());
            d1.roll();
            System.out.println("d1 face value " + d1.getFaceValue());
            rolls++;
            int faceValue = d1.getFaceValue();
            if (faceValue == 1) {
                ones++;
            } else if (faceValue == 2) {
                twos++;
            } else if (faceValue == 3) {
                threes++;
            } else if (faceValue == 4) {
                fours++;
            } else if (faceValue == 5) {
                fives++;
            } else {
                sixes++;
            }
        }

        System.out.println("There were " + ones + " ones");
        System.out.println("There were " + twos + " twos");
        System.out.println("There were " + threes + " threes");
        System.out.println("There were " + fours + " fours");
        System.out.println("There were " + fives + " fives");
        System.out.println("There were " + sixes + " sixes");
    }

}
