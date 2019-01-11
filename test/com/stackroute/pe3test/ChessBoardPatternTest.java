package com.stackroute.pe3test;

import com.stackroute.pe3main.ChessBoardPattern;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardPatternTest {

    ChessBoardPattern test;

    @Before
    public void setUp() throws Exception {
        test = new ChessBoardPattern();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void ChessBoardPatternSuccess(){
        String[][] result = test.printChessBoard(8,8);
        assertEquals(new String[][] {{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}},result);
    }

    @Test
    public void ChessBoardPatternFailure(){
        String[][] result = test.printChessBoard(8,8);
        assertNotEquals(new String[][] {{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}},result);
    }

    @Test
    public void ChessBoardPatternInvalid(){
        String[][] result = test.printChessBoard(4,5);
        assertEquals(new String[][] {{"invalid"}},result);
    }


}