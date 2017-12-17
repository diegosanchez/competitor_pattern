package com.fiuba.app.reduce;

import com.fiuba.app.Competitor;
import junit.framework.TestCase;

/**
 * Created by dsanchez on 12/13/17.
 */
public class CollectionReductionTest
        extends TestCase
{

    public void testGetWinner() {
        Competitor[]arrayOfEntities = {
                new EntityFoo(),
                new EntityBar()
        };

        EntityCollection ec = new EntityCollection(arrayOfEntities);
        assertEquals(new EntityFoo(), ec.winner());
    }

    public void testReduceCollectionToOneWithoutTackingCareAboutTheOrder() {
        Competitor[]arrayOfEntities = {
                new EntityBar(),
                new EntityFoo()
        };

        EntityCollection ec = new EntityCollection(arrayOfEntities);
        assertEquals(new EntityFoo(), ec.winner());
    }

}
