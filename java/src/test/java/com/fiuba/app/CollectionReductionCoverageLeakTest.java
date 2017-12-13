package com.fiuba.app;


import com.fiuba.app.reduceCoverageLeak.Entity;
import com.fiuba.app.reduceCoverageLeak.EntityBiz;
import com.fiuba.app.reduceCoverageLeak.EntityLeakCollection;
import com.fiuba.app.reduceCoverageLeak.EntityQux;
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
