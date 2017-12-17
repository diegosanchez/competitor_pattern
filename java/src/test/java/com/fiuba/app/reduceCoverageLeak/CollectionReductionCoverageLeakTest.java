package com.fiuba.app.reduceCoverageLeak;


import junit.framework.TestCase;

/**
 * Created by dsanchez on 12/13/17.
 */
public class CollectionReductionCoverageLeakTest extends TestCase {

    public void testBizAlwaysWin() {
        Entity[]arrayOfEntities = {
                new EntityBiz(),
                new EntityQux()
        };

        EntityLeakCollection ec = new EntityLeakCollection(arrayOfEntities);
        assertEquals(new EntityBiz(), ec.winner());
    }

}
