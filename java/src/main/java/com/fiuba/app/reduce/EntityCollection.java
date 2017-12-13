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
        return this.competitors
                .stream()
                .reduce(new NullEntity(), (Competitor a, Competitor b) -> {
                    return a.challenge(b);
                });

    };
}
