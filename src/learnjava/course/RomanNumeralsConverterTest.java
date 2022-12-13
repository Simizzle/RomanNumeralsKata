package learnjava.course;


import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RomanNumeralsConverterTest {

    @Test
    public void convertOne() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("I", romanNumeralsConverter.converter(1));
    }

    @Test
    public void convertTwo() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("II", romanNumeralsConverter.converter(2));
    }

    @Test
    public void convertThree() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("III", romanNumeralsConverter.converter(3));
    }

    @Test
    public void convertFour() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("IV", romanNumeralsConverter.converter(4));
    }
    @Test
    public void convertFive() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("V", romanNumeralsConverter.converter(5));
    }

    @Test
    public void convertNine() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("IX", romanNumeralsConverter.converter(9));
    }
    @Test
    public void convertTen() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("X", romanNumeralsConverter.converter(10));
    }

    @Test
    public void convertTwelve() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("XII", romanNumeralsConverter.converter(12));
    }

    @Test
    public void convertFifteen() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("XV", romanNumeralsConverter.converter(15));
    }

    @Test
    public void convertTwenty() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("XX", romanNumeralsConverter.converter(20));
    }
    @Test
    public void convertOneHundredAndFiftyFour() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("CLIV", romanNumeralsConverter.converter(154));
    }

    @Test
    public void convertTwoThousandAndTwentyTwo() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("MMXXII", romanNumeralsConverter.converter(2022));
    }

    @Test
    public void convertFourHundredAndSeventyThree() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("CDLXXIII", romanNumeralsConverter.converter(473));
    }

    @Test
    public void convertNineHundred() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("CM", romanNumeralsConverter.converter(900));
    }

    @Test
    public void convertForty() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("XL", romanNumeralsConverter.converter(40));
    }

    @Test
    public void convertFortyOne() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("XLI", romanNumeralsConverter.converter(41));
    }

    @Test
    public void convertNinety() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("XC", romanNumeralsConverter.converter(90));
    }

}