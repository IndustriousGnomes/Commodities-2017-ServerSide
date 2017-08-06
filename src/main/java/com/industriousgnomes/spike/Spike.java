package com.industriousgnomes.spike;

/**
 * Created by jrtitko1 on 8/6/17.
 */
public class Spike {

    protected InjectMe injectMe;

    public boolean testMe() {
        return injectMe.execute();
    }
}
