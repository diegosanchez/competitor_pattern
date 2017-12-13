package com.fiuba.app.reduceCoverageLeak;

import java.util.Arrays;
import java.util.List;

/**
 * Created by dsanchez on 12/13/17.
 */
public class EntityLeakCollection {
    List<Entity> entities;

    public EntityLeakCollection(Entity ... entities) {
        this.entities = Arrays.asList(entities);
    }

    public Entity winner() {
        Entity result = null;

        for( Entity e : this.entities) {
            if ( e.happens() ) {
                result = e;
                break;
            }
        }

        if ( result == null ) {
            result = new NullLeakEntity();
        }

        return result;
    };

}
