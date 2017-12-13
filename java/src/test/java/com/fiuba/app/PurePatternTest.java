package com.fiuba.app;

import com.fiuba.app.pure.Bar;
import com.fiuba.app.pure.Foo;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class PurePatternTest
    extends TestCase
{

    public void testFooAllwayasPravailsOverBar()
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
