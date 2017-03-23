package enums;

public enum OperationTypes {

    ADDITION("+"), SUBTRACTION("-"), MULTIPLICATION("*"), DIVISION("/");

    public String value;

    OperationTypes(String value){
        this.value = value;
    }
}
