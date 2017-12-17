package com.fiuba.app.pure;

import com.fiuba.app.Competitor;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class PurePatternTest
    extends TestCase
{

    public void testFooAlwayasPrevailsOverBar()
    {
        Competitor foo = new Foo();
        Competitor bar = new Bar();

        assertEquals(foo.challenge(bar), new Foo());
    }

    public void testBarAlwaysLostAgainstFoo()
    {
        Competitor foo = new Foo();
        Competitor bar = new Bar();

        assertEquals(bar.challenge(foo), new Foo());
    }

}
