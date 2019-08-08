package OOP;

public enum Size {
    VERY_SMALL("XS"), SMALL("S"), AVERAGE("M"),
    BIG("L"), VERY_BIG("XL"), UNDERFINED("");

    Size(String abbreviation) {

    }

    private String abbreviation;

    public String getAbbreviation() {
        return abbreviation;
    }
}
