/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package features.sheep;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 *
 * @author tomo
 */
public class MyersTest {

    private Myers myers;

    public MyersTest() {
        myers = new Myers();
    }

    @Test
    public void 正三角形() {
        String name = myers.getName(2, 2, 2);
        assertThat(name, is("正三角形"));
    }

    @Test
    public void 二等辺三角形1() {
        String name = myers.getName(5, 3, 3);
        assertThat(name, is("二等辺三角形"));
    }

    @Test
    public void 二等辺三角形2() {
        String name = myers.getName(3, 5, 3);
        assertThat(name, is("二等辺三角形"));
    }

    @Test
    public void 二等辺三角形3() {
        String name = myers.getName(3, 3, 5);
        assertThat(name, is("二等辺三角形"));
    }

    @Test
    public void 不等辺三角形() {
        String name = myers.getName(5, 3, 4);
        assertThat(name, is("不等辺三角形"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void 三角形でない1() {
        String name = myers.getName(1, 2, 0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void 三角形でない2() {
        String name = myers.getName(-1, 2, 3);
    }
    @Test(expected = IllegalArgumentException.class)
    public void 三角形でない3() {
        String name = myers.getName(1, 3, 2);
    }

}
