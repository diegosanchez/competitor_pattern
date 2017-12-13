package com.fiuba.app.reduceCoverageLeak;

/**
 * Created by dsanchez on 12/13/17.
 */
public class NullLeakEntity implements Entity {
    @Override
    public boolean happens() {
        return false;
    }
}
