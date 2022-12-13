package learnjava.course;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsConverterParameterizedTest {

    RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
    @ParameterizedTest
    @CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
    void converter(int arabic, String romanResult) {
        assertEquals(romanResult, romanNumeralsConverter.converter(arabic));
    }
}