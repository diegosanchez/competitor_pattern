package com.fiuba.app;

import com.fiuba.app.reduce.EntityBar;
import com.fiuba.app.reduce.EntityCollection;
import com.fiuba.app.reduce.EntityFoo;
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
