import org.junit.Test;
import static org.junit.Assert.*;
public class TestEven {
    @Test
    public void test1(){
        assertTrue(Even.IsEven(2));
    }
    @Test
    public void test2(){
        assertFalse(Even.IsEven(1));
    }

    @Test
    public void test3(){
        assertFalse(Even.IsEven(9999));
    }
}
