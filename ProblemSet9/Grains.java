package ProblemSet9;

import java.math.BigInteger;

public class Grains {
    private int grain;


    public Grains() {
    }

    public BigInteger computeNumberOfGrainsOnSquare (int grain){
        if (grain < 1 || grain > 64){
            throw new IllegalArgumentException("square must be between 1 and 64");
        } else {
            this.grain = grain;
        }
        BigInteger two = new BigInteger("2");
        BigInteger first = two.pow(grain - 1);
        return first;
    }

    public BigInteger computeTotalNumberOfGrainsOnBoard(){
        BigInteger second = new BigInteger("2");
        BigInteger total = second.pow(64);
        return total.subtract(BigInteger.valueOf(1));
    }
}