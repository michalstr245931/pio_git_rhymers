
package edu.kis.vh.nursery;
import org.junit.Assert;
import org.junit.Test;

public class FIFORhymerUnitTest {

    @Test
    public void testCountOut() {
        FIFORhymer fifoRhymer = new FIFORhymer();
        int testValue = 0;

        fifoRhymer.countIn(testValue);
        Assert.assertEquals(testValue, fifoRhymer.countOut());
    }

    @Test
    public void testCountOutMultipleValues() {
        FIFORhymer fifoRhymer = new FIFORhymer();
        int[] testValues = {1, 2, 3, 4};

        for (int value : testValues) {
            fifoRhymer.countIn(value);
        }

        for (int value : testValues) {
            Assert.assertEquals(value, fifoRhymer.countOut());
        }
    }

    @Test
    public void testCountOutWithEmpty() {
        FIFORhymer fifoRhymer = new FIFORhymer();

        Assert.assertEquals(-1, fifoRhymer.countOut());
    }
}