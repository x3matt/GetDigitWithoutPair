import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {

    GetDigitWithoutPairClass clazz = new GetDigitWithoutPairClass();

    @Test
    public void testGetDigitWithoutPair(){
        assertEquals(9,clazz.getDigitWithoutPair(new int[]{1,6,7,1,7,9,6}));
        assertEquals(7,clazz.getDigitWithoutPair(new int[]{1,1,7,2,2,8}));
        assertEquals(5,clazz.getDigitWithoutPair(new int[]{1,2,5,4,3,6}));
    }

    @Test(expected = NullPointerException.class)
    public void testGetDigitWithoutPair_NullPointerException(){
        clazz.getDigitWithoutPair(null);
    }
}
