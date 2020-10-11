import org.junit.Assert;
import org.junit.Test;

public class TestArr {

    @Test
    public void test1arrAfter4() {
        int[] in = new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] out = new int[]{1, 7};
        Assert.assertArrayEquals(out, Main.arrAfter4(in));
    }

    @Test(expected = RuntimeException.class)
    public void test2arrAfter4() {
        int[] in = new int[]{5, 8, 9, 2, 1, 6};
        Main.arrAfter4(in);
    }

    @Test
    public void test1arrWith1and4() {
        int[] in = new int[]{3, 5, 7, 9};
        Assert.assertFalse(Main.arrWith1and4(in));
    }

    @Test
    public void test2arrWith1and4() {
        int[] in = new int[]{1, 1, 4, 4, 1, 1};
        Assert.assertTrue(Main.arrWith1and4(in));
    }



}
