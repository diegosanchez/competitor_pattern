package com.fiuba.app.pure;

import com.fiuba.app.Competitor;

/**
 * Created by dsanchez on 12/13/17.
 */
public class Bar implements Competitor {
    public Competitor challenge(Competitor another) {
        return another;
    }

}
