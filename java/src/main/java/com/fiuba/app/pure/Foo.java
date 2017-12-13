package com.fiuba.app.pure;

import com.fiuba.app.Competitor;

/**
 * Created by dsanchez on 12/13/17.
 */
public class Foo implements Competitor {

    public Competitor challenge(Competitor another) {
        return this;
    }

    public boolean equals(Object another ) {
        return this.getClass().equals(another.getClass() );
    }
}
