package learnjava.course;

public class RomanNumeralsConverter {

    public String converter(int a) {

        StringBuilder roman = new StringBuilder();

        for(Numeral numeral : Numeral.values()) {
            while(a >= numeral.arabic) {
                roman.append(numeral.roman);
                a -= numeral.arabic;
            }
        }
        return roman.toString();
    }

    private enum Numeral {
        THOUSAND(1000, "M"),
        NINE_HUNDRED(900, "CM"),
        FIVE_HUNDRED(500, "D"),
        FOUR_HUNDRED(400, "CD"),
        HUNDRED(100, "C"),
        NINETY(90, "XC"),
        FIFTY(50, "L"),
        FORTY(40, "XL"),
        TEN (10, "X"),
        NINE (9, "IX"),
        FIVE (5, "V"),
        FOUR (4, "IV"),
        ONE (1, "I");

        private final int arabic;
        private final String roman;

        Numeral(int arabic, String roman) {
            this.arabic = arabic;
            this.roman = roman;
        }
    }
}
