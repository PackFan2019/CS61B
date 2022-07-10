import static org.junit.Assert.*;
import org.junit.Test;


public class TestSort {
    @Test
    public void testSort(){
        String[] input ={"i","have", "a","dog"};
        String[] expected ={"a","dog","have","i"};

        Sort.sort(input);

        assertArrayEquals(expected,input);

    }

    @Test
    public void testFindSmallest(){

        String[] input ={"i","have", "a","dog"};
        int expected =2;

       int actual=Sort.findSmallest(input,2);
        assertEquals(expected,actual);

    }

    @Test
    public void testSwamp(){

        String[] input ={"i","have", "a","dog"};
        String[] expected ={"have","i", "a","dog"};

        Sort.swap(input,0,1);
        assertArrayEquals(expected,input);

    }


}
