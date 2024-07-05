public class FirstLevel {
    private int id;
    private MyEnum myEnum;
    private ComplexType complexType;

    public FirstLevel(int id, MyEnum myEnum, ComplexType complexType) {
        this.id = id;
        this.myEnum = myEnum;
        this.complexType = complexType;
    }

    public int getId() {
        return id;
    }

    public MyEnum getMyEnum() {
        return myEnum;
    }

    public ComplexType getComplexType() {
        return complexType;
    }

    @Override
    public String toString() {
        return "FirstLevel{id=" + id + ", myEnum=" + myEnum + ", complexType=" + complexType + "}";
    }
}
