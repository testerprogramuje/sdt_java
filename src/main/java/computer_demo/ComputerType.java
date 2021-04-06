package computer_demo;

public enum ComputerType {

    HOME_PC("Home PC"),
    OFFICE_PC("Office PC");

    private String value;

    ComputerType(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.getValue();
    }
}
