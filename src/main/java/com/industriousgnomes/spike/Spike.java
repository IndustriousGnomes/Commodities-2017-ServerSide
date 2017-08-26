package com.industriousgnomes.spike;

/**
 * Created by jrtitko1 on 8/6/17.
 */
public class Spike {

    protected InjectMe injectMe;

    public boolean testMe() {
        return injectMe.execute();
    }

    public int sumNumbers(int max) {
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        return sum;
    }
}
