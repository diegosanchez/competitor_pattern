package com.fiuba.app.reduce;

import com.fiuba.app.Competitor;

/**
 * Created by dsanchez on 12/13/17.
 */
public class EntityBar implements DomainEntity, Competitor {
    public Competitor challenge(Competitor another) {
        return another;
    }

    public boolean equals(Object another) {
        return this.getClass().equals( another.getClass() );
    }

}
