package com.dbapresents.randomnumssum;

import com.dbapresents.randomnumssum.distribution.Distribution;
import com.dbapresents.randomnumssum.distribution.DistributionGenerator;

import java.security.NoSuchAlgorithmException;

public class RandomNumsSum {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        DistributionGenerator distributionGenerator = new DistributionGenerator();
//        Distribution distribution = distributionGenerator.testDice(6, 10000);
//        Distribution distribution = distributionGenerator.computeSumDistribution(6, 1000000);
        Distribution distribution = distributionGenerator.computeSumDistribution(20, 1000000);
        System.out.println(distribution);
    }

}
