package com.dbapresents.randomnumssum.distribution;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Distribution {

    private static final int SCALE = 2;

    private final int[] counts;

    public Distribution(int buckets) {
        this.counts = new int[buckets];
    }

    public void increment(int bucketNum) {
        counts[bucketNum - 1]++;
    }

    @Override
    public String toString() {
        int totalCounts = Arrays.stream(counts).sum();

        StringBuilder builder = new StringBuilder();
        builder.append("Distribution:").append("\n");
        for (int id = 0; id < counts.length; id++) {
            BigDecimal perc = BigDecimal.valueOf(counts[id] * 100L, SCALE).divide(BigDecimal.valueOf(totalCounts, SCALE), RoundingMode.HALF_DOWN);
            builder.append(id + 1).append(";").append(counts[id]).append(";")
                    .append(perc).append("%").append("\n");
        }
        return builder.toString();
    }

}
