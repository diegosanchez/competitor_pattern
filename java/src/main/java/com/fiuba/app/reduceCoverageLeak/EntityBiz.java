package com.fiuba.app.reduceCoverageLeak;

/**
 * Created by dsanchez on 12/13/17.
 */
public class EntityBiz implements Entity {

    @Override
    public boolean happens() {
        return true;
    }

    public boolean equals( Object another ) {
        return this.getClass().equals( another.getClass() );
    }
}
