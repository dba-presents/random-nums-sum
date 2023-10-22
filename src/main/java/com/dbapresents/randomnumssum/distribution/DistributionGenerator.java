package com.dbapresents.randomnumssum.distribution;

import com.dbapresents.randomnumssum.dice.Dice;
import java.security.NoSuchAlgorithmException;

public class DistributionGenerator {

    public Distribution testDice(int sides, int rolls) throws NoSuchAlgorithmException {
        Dice dice = new Dice(sides);
        Distribution distribution = new Distribution(sides);

        for (int roll = 0; roll < rolls; roll++) {
            distribution.increment(dice.roll());
        }

        return distribution;
    }

    public Distribution computeSumDistribution(int sides, int games) throws NoSuchAlgorithmException {
        Dice dice = new Dice(sides);
        int maxSum = sides * 10;
        Distribution distribution = new Distribution(maxSum);

        for (int game = 0; game < games; game++) {
            play(maxSum, distribution, dice);
        }

        return distribution;
    }

    private void play(int maxSum, Distribution distribution, Dice dice) {
        int sum = 0;
        while (sum < maxSum) {
            int rollResult = dice.roll();
            sum += rollResult;
            if (sum <= maxSum) {
                distribution.increment(sum);
            }
        }
    }

}
