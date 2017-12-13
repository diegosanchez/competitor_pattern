package com.fiuba.app;

import com.fiuba.app.reduce.EntityBar;
import com.fiuba.app.reduce.EntityFoo;
import com.fiuba.app.reduce.NullEntity;
import junit.framework.TestCase;

import java.util.Arrays;

/**
 * Created by dsanchez on 12/13/17.
 */
public class CollectionReduction extends TestCase {

    public void testReduceCollectionToOne() {
        Competitor[]arrayOfEntities = {
                new EntityFoo(),
                new EntityBar()
        };

        Competitor winner = Arrays.asList(arrayOfEntities)
                .stream()
                .reduce(new NullEntity(), (Competitor a, Competitor b) -> {
                    return a.challenge(b);
                });

        assertEquals(new EntityFoo(), winner);
    }

    public void testReduceCollectionToOneWithoutTackingCareAboutTheOrder() {
        Competitor[]arrayOfEntities = {
                new EntityBar(),
                new EntityFoo()
        };

        Competitor winner = Arrays.asList(arrayOfEntities)
                .stream()
                .reduce(new NullEntity(), (a, b) -> {
                    return a.challenge(b);
                });

        assertEquals(new EntityFoo(), winner);
    }
}
