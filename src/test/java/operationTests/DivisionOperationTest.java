package operationTests;

import enums.OperationTypes;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;
import java.util.ArrayList;
import static processing.DataProcessing.getDataList;

@Title("Division operation test results")
@RunWith(Parameterized.class)
public class DivisionOperationTest extends TestBase {

    public DivisionOperationTest(String operand1, String operand2, String operation, String result) {
        super(operand1, operand2, operation, result);
    }

    @Title("Division operation test")
    @Description("Checking division operation")
    @Test
    public void checkingDivisionOperationTest(){

        if(getOperand2() == 0) Assert.fail("Division by zero");
        Assert.assertTrue("Wrong division result!", getResult() == getOperand1() / getOperand2());
    }

    @Parameterized.Parameters
    public static ArrayList<String[]> getTestData(){

        return getDataList(OperationTypes.DIVISION);
    }
}