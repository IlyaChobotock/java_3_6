import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestParam1Arr {
    private int[] in;
    private int[] out;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[] {1, 2, 3, 4, 5, 6, 7}, new int[] {5, 6, 7}},
                {new int[] {1, 2, 3, 4}, new int[]{}},
                {new int[] {4, 4, 4, 4, 4, 1}, new int[]{1}},
                {new int[] {4, 2, 1, 6, 5, 8, 7}, new int[]{2, 1, 6, 5, 8, 7}}
        });
    }

    public TestParam1Arr(int[] in, int[] out) {
        this.in = in;
        this.out = out;
    }

    @Test
    public void testParam () {
        Assert.assertArrayEquals(out, Main.arrAfter4(in));
    }
}
