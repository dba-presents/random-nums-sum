package com.dbapresents.randomnumssum.dice;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Dice {

    private final SecureRandom rand;
    private final int sidesNum;

    public Dice(int sidesNum) throws NoSuchAlgorithmException {
        this.sidesNum = sidesNum;
        this.rand = SecureRandom.getInstanceStrong();
    }

    public int roll() {
        return rand.nextInt(sidesNum) + 1;
    }

}
