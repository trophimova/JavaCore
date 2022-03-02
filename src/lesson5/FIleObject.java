package lesson5;

public class FIleObject {

    private Integer valueIndex;
    private Integer valueRandom;
    private String valueString;

    public FIleObject(Integer valueIndex, Integer valueRandom, String valueString) {
        this.valueIndex = valueIndex;
        this.valueRandom = valueRandom;
        this.valueString = valueString;
    }

    public Integer getValueIndex() {
        return valueIndex;
    }

    public Integer getValueRandom() {
        return valueRandom;
    }

    public String getValueString() {
        return valueString;
    }
}
