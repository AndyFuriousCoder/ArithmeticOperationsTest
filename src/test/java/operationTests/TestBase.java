package operationTests;

import ru.yandex.qatools.allure.annotations.Parameter;

public class TestBase {

    @Parameter("Operand1")
    private int operand1;

    @Parameter("Operand2")
    private int operand2;

    @Parameter("Result")
    private int result;

    @Parameter("Operation")
    private String operation;

    public int getOperand1() {
        return operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public int getResult() {
        return result;
    }

    public TestBase(String operand1, String operand2, String operation, String result)
    {
        this.operand1 = Integer.parseInt(operand1);
        this.operand2 = Integer.parseInt(operand2);
        this.operation = operation;
        this.result = Integer.parseInt(result);
    }
}
