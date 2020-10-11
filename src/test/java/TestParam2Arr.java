import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestParam2Arr {
    private int[] in;
    private boolean flag;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[] {1, 2, 3, 4, 5, 6, 7}, false},
                {new int[] {1, 4, 1, 4}, true},
                {new int[] {4, 4, 4, 4, 4, 1}, true},
                {new int[] {1, 1, 1, 1}, false}
        });
    }

    public TestParam2Arr(int[] in, boolean flag) {
        this.in = in;
        this.flag = flag;
    }

    @Test
    public void testParam2 (){
        Assert.assertEquals(flag, Main.arrWith1and4(in));
    }
}
