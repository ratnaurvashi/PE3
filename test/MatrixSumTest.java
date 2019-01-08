import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixSumTest {

    MatrixSum test;

    @Before
    public void setUp() throws Exception {
        test = new MatrixSum();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void matrixSumSuccess(){
        int[][] result = test.matrixSum(new int[][]{{1,2},{3,4},{5,6}}, new int[][]{{9,8},{7,6},{5,4}},3,2);
        assertEquals(new int[][]{{10,10},{10,10},{10,10}},result);
    }

    @Test
    public void matrixSumFailure(){
        int[][] result = test.matrixSum(new int[][]{{1,2},{3,4},{5,6}}, new int[][]{{9,8},{7,6},{5,4}},3,2);
        assertNotEquals(new int[][]{{20,1},{5,10},{6,6}},result);
    }

    @Test
    public void matrixSumZero(){
        int[][] result = test.matrixSum(new int[][]{{0,0},{0,0}}, new int[][]{{0,0},{0,0}},2,2);
        assertEquals(new int[][]{{0,0},{0,0}},result);
    }

    @Test
    public void matrixSumNull(){
        int[][] result = test.matrixSum(null, null, 0,0);
        assertEquals(null,result);
    }
}