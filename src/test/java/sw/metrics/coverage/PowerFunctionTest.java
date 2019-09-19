package sw.metrics.coverage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

public class PowerFunctionTest {

    /**
     DELTA required for assertEquals to work properly
     */
    private static final double DELTA = 1e-15;
    private RadiansFunction radiansFunction;

    @Before
    public void init() {
        radiansFunction = new RadiansFunction();
    }

    /**
     * Test that asserts the correct convertion degree(angle) to radians
     * function.
     *
     * @throws Exception
     */
    @Test
    public void testRadian() throws Exception {
        Assert.assertEquals(2.617993877991495, radiansFunction.radians("150.00000000000003"), DELTA);
        Assert.assertEquals(10.629055312895206, radiansFunction.radians("609.0000096399999"), DELTA);
        Assert.assertEquals(3.049110709802968E-6, radiansFunction.radians("1.747011749398488E-4"), DELTA);
    }

    /**
     * Test that verifies that the argument should not be null.
     *
     * @throws Exception
     */
    @Test(expected = NullPointerException.class)
    public void testNullAsArg() throws Exception {
        radiansFunction.radians(null);
    }


    /**
     * Test that verifies that the argument should not be invalid double.
     * 
     * @throws Exception
     */
    @Test(expected = NumberFormatException.class)
    public void testInvalidArg() throws Exception {
        radiansFunction.radians("asdasd");
    }

    /**
     * Test that verifies that the argument should not be a negative
     * number.
     * 
     * @throws Exception
     */
    @Test(expected = Exception.class)
    public void testNegativeFirstArg() throws Exception {
        radiansFunction.radians("-1");
    }


}
