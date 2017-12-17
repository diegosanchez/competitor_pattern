package com.fiuba.app.reduce;

import com.fiuba.app.Competitor;

import java.util.Arrays;
import java.util.List;

/**
 * Created by dsanchez on 12/13/17.
 */
public class EntityCollection {
    List<Competitor> competitors;
    public EntityCollection(Competitor ... competitors) {
        this.competitors = Arrays.asList(competitors);
    }

    public Competitor winner() {
        Competitor result = new NullEntity();

        for( Competitor c : this.competitors) {
            result = result.challenge(c);
        }

        return result;
    };
}
