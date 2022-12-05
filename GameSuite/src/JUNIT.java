import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JUNIT {
    
    /**
     * Test to make sure the constructor correctly fills the null
     * array with the value "x" for each index
     */
    @Test
    public void testConstructor() {

        Sudoku test = new Sudoku();

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                assertEquals("x", test.getLevelStart()[i][j]);
            }
        }
    }
    
    /**
     * Tests to make sure the String array levelStart has been
     * populated by checking that index (0, 0) is no longer
     * "x", but is now "9" as it should be.
     */
    @Test
    public void testStartGame() {
        Sudoku test = new Sudoku();
        test.startGame();
        assertEquals("9", test.getLevelStart()[0][0]);
    }

    /**
     * Tests if setIndex is working by showing the value of index
     * (0, 3) is "x" before we call the method and has a value of
     * "1" after we call the method with the parameters set to change
     * row 1 column 4 (index 0, 3) to a value of "1".
     */
    @Test
    public void testSetIndex() {
        Sudoku test = new Sudoku();
        test.startGame();
        assertEquals("x", test.getLevelStart()[0][3]);
        test.setIndex(1, 4, "1");
        assertEquals("1", test.getLevelStart()[0][3]);
    }

    /**
     * Tests to make sure gameComplete only returns true if the
     * parameter is set to 0 and not another number.
     */
    @Test
    public void testGameComplete() {
        Sudoku test = new Sudoku();
        test.startGame();
        assertFalse("This checks if gameComplete returns false coreectly.", test.gameComplete(1));
        assertTrue("This will check if gameComplete correctly returns true when 0 is entered for the parameter.", test.gameComplete(0));
    }

    /**
     * Tests if setRow is working by creating a String array with
     * a set of 9 values to replace the ones currently in the
     * Sudoku puzzle. The test does a check of each of the indices
     * that should have been replaced and checks if the value is
     * what was given by the String array.
     */
    @Test
    public void testSetRow() {
        Sudoku test = new Sudoku();
        test.startGame();
        String[] testArr = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        assertEquals("9", test.getLevelStart()[0][0]);
        test.setRow(1, testArr);
        assertEquals("1", test.getLevelStart()[0][0]);
        assertEquals("2", test.getLevelStart()[0][1]);
        assertEquals("3", test.getLevelStart()[0][2]);
        assertEquals("4", test.getLevelStart()[0][3]);
        assertEquals("5", test.getLevelStart()[0][4]);
        assertEquals("6", test.getLevelStart()[0][5]);
        assertEquals("7", test.getLevelStart()[0][6]);
        assertEquals("8", test.getLevelStart()[0][7]);
        assertEquals("9", test.getLevelStart()[0][8]);
    }

    /**
     * Test to check if setEqual method actually sets the users
     * puzzle equal to the master key.
     */
    @Test
    public void testSetEqual() {
        Sudoku test = new Sudoku();
        test.startGame();
        test.master();
        test.setEqual();
        assertArrayEquals(test.getLevelStart(), test.getMasterKey());
    }

    /**
     * Test to see if the testCorrect method is able to tell that the
     * master and user puzzles are equal when they are set that way.
     * 
     * If there are no mistakes in the puzzle, the mistakes variable
     * should remain at 0, allowing us to test the validity of the
     * method.
     */
    @Test
    public void testCheckCorrect() {
        Sudoku test = new Sudoku();
        test.startGame();
        test.master();
        test.setEqual();
        test.checkCorrect();
        assertEquals(0, test.getMistakes());
    }
    
     @Test
    public void testStartgame(){
        Blackjack test = new Blackjack();
        test.startGame();
        assertEquals(9,  test.getLevelStart()[0][0]);
    }
    @Test
    public void teststartGame(){
        Blackjack test = new BlackJack();
        assertEqual(0, test.playerSum()[0]);
        assertEqual(0, test.dealerSum()[0]);
        assertEquals(0, test.flag()[0]);
    }
    
    @Test
    public void testplayerHit(){
        Random name = new Random();
        ArrayList<integer>playerCards = new ArrayList();
        Blackjack test = new BlackJack();
        assertEquals(1, test.size()[1]);
    }


    @Test
    public void testdealerCards(){
        Random name = new Random();
        ArrayList<integer>dealerCards = new ArrayList();
        Blackjack test = new Blackjack();
        assertEquals(1, test.size()[1]);
    }

    @Test
    public void testcompareCards(){
        ArrayList<integer>playerCards = new ArrayList(4);
        ArrayList<integer>dealerCards = new ArrayList(3);
        assertTrue(ArrayList(playerCards) > ArrayList(dealerCards));
        ArrayList(6); ArrayList(8);
        assertTrue(ArrayList(playerCards) < ArrayList(dealerCards));
    }

    @Test
    public void testgetPlayerCrads(){
        ArrayList<integer>playerCards = new ArrayList();
        ArrayList(7);
        assertArrayEquals(playerCards, 7);
    }

    @Test
    public void testDealerCards(){
        ArrayList<integer>dealerCards = new ArrayList();
        ArrayList(4);
        assertArrayEquals(dealerCards, 4);
    }

    @Test
    public void testgetPlayerSum(){
        ArrayList<integer>playerCards = new ArrayList(5);
        playerSum(5);
        assertArrayEquals(playerCards, 5);
    }

    @Test
    public void testgetDealerSum(){
        ArrayList<integer>dealerCards = new ArrayList(8);
        dealerSum(8);
        assertArrayEquals(dealerCards, 8);
    }

    @Test
    public void testgetAceChecked(){
        ArrayList<integer>playerCards = new ArrayList(11);
        checkAce();
        aceCheckCards();
        assertEquals(aceCheckCards(),1);
        assertArrayEquals(playerCards, 1);
    }

    @Test
    public void testsetDealerCards(){
        ArrayList<integer>dealerCards = new ArrayList(4);
        ArrayList(7);
        assertArrayEquals(dealerCards,7);
    }

    @Test
    public void testsetDealerSum(){
        ArrayList<integer>playerCards = new ArrayList(5);
        dealerSum(9);
        assertFalse(playerCards, dealerSum());
    }

    @Test
    public void testsetPlayerCards(){
        ArrayList<integer>playerCards = new ArrayList(4);
        dealerSum(7);
        assertFalse(playerCards, dealerSum());
    }

    @Test
    public void testsetPlayerSum(){
        ArrayList<integer>playerCards = new ArrayList(5);
        playerSum(9);
        assertFalse(playerCards, playerSum());
    }
}
}
