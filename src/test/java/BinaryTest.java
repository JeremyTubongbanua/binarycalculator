import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ontariotechu.Binary;

public class BinaryTest {
    /**
     * Test The constructor with a valid binary vallue
     */
    @Test
    public void normalConstructor() {
        Binary binary = new Binary("1001001");
        assertTrue(binary.getValue().equals("1001001"));
    }

    /**
     * Test The constructor with an invalid binary value of out-of-range digits
     */
    @Test
    public void constructorWithInvalidDigits() {
        Binary binary = new Binary("1001001211");
        assertTrue(binary.getValue().equals("0"));
    }

    /**
     * Test The constructor with an invalid binary value of alphabetic characters
     */
    @Test
    public void constructorWithInvalidChars() {
        Binary binary = new Binary("1001001A");
        assertTrue(binary.getValue().equals("0"));
    }

    /**
     * Test The constructor with an invalid binary value that has a sign
     */
    @Test
    public void constructorWithNegativeSign() {
        Binary binary = new Binary("-1001001");
        assertTrue(binary.getValue().equals("0"));
    }

    /**
     * T est The constructor with a zero tailing valid binary value
     */
    @Test
    public void constructorWithZeroTailing() {
        Binary binary = new Binary("00001001");
        assertTrue(binary.getValue().equals("1001"));
    }

    /**
     * Test The constructor with an empty string
     */
    @Test
    public void constructorEmptyString() {
        Binary binary = new Binary("");
        assertTrue(binary.getValue().equals("0"));
    }

    /**
     * Test The add functions with two binary numbers of the same length
     */
    @Test
    public void add() {
        Binary binary1 = new Binary("1000");
        Binary binary2 = new Binary("1111");
        Binary binary3 = Binary.add(binary1, binary2);
        assertTrue(binary3.getValue().equals("10111"));
    }

    /**
     * Test The add functions with two binary numbers, the length of the first
     * argument is less than the second
     */
    @Test
    public void add2() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("11");
        Binary binary3 = Binary.add(binary1, binary2);
        assertTrue(binary3.getValue().equals("1101"));
    }

    /**
     * Test The add functions with two binary numbers, the length of the first
     * argument is greater than the second
     */
    @Test
    public void add3() {
        Binary binary1 = new Binary("11");
        Binary binary2 = new Binary("1010");
        Binary binary3 = Binary.add(binary1, binary2);
        assertTrue(binary3.getValue().equals("1101"));
    }

    /**
     * Test The add functions with a binary numbers with zero
     */
    @Test
    public void add4() {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("1010");
        Binary binary3 = Binary.add(binary1, binary2);
        assertTrue(binary3.getValue().equals("1010"));
    }

    /**
     * Test The add functions with two zeros
     */
    @Test
    public void add5() {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("0");
        Binary binary3 = Binary.add(binary1, binary2);
        System.out.println(binary3.getValue());
        assertTrue(binary3.getValue().equals("0"));
    }

    /**
     * Test to and two binary numbers with same lengths
     * 1010 = 10
     * 0011 = 3
     * 10 = 2
     */
    @Test
    public void and1() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("0011");
        Binary binary3 = Binary.and(binary1, binary2);
        assertTrue(binary3.getValue().equals("10"));
    }
    
    /**
     * Test to and two binary numbers with different lengths
     * 00111 = 7
     * 01 = 1
     * 1 = 1
     */
    @Test
    public void and2() {
        Binary binary1 = new Binary("00111");
        Binary binary2 = new Binary("01");
        Binary binary3 = Binary.and(binary1, binary2);
        assertTrue(binary3.getValue().equals("1"));
    }

    /**
     * Test to or two binary numbers with same lengths
     * 1010 = 10
     * 0011 = 3
     * 1011 = 11
     */
    @Test
    public void or1() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("0011");
        Binary binary3 = Binary.or(binary1, binary2);
        assertTrue(binary3.getValue().equals("1011"));
    }

    /**
     * Test to or two binary numbers with different lengths
     * 00111 = 7
     * 01 = 1
     * 111 = 7
     */
    @Test
    public void or2() {
        Binary binary1 = new Binary("00111");
        Binary binary2 = new Binary("01");
        Binary binary3 = Binary.or(binary1, binary2);
        assertTrue(binary3.getValue().equals("111"));
    }

    /**
     * Test to multiply two binary numbers with same lengths
     * 1010 = 10
     * 0011 = 3
     * 11110 = 30
     */
    @Test
    public void multiply1() {
        Binary binary1 = new Binary("01010"); // 10
        Binary binary2 = new Binary("00011"); // 3
        Binary binary3 = Binary.multiply(binary1, binary2);
        assertTrue(binary3.getValue().equals("11110")); // 30
    }

    /**
     * Test to multiply two binary numbers with different lengths
     * 1010 = 10
     * 00000 = 0
     * 0 = 0
     */
    @Test
    public void multiply2() {
        Binary binary1 = new Binary("01010"); // 10
        Binary binary2 = new Binary("00000"); // 0
        Binary binary3 = Binary.multiply(binary1, binary2);
        assertTrue(binary3.getValue().equals("0")); // 0
    }   

}
