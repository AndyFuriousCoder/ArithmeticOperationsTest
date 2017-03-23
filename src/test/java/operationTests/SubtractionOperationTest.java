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


@Title("Subtraction operation test results")
@RunWith(Parameterized.class)
public class SubtractionOperationTest extends TestBase {

    public SubtractionOperationTest(String operand1, String operand2, String operation, String result) {
        super(operand1, operand2, operation, result);
    }

    @Title("Subtraction operation test")
    @Description("Checking subtraction operation")
    @Test
    public void checkingSubtractionOperationTest(){
        Assert.assertTrue("Wrong subtraction result!", getResult() == getOperand1() - getOperand2());
    }

    @Parameterized.Parameters
    public static ArrayList<String[]> getTestData(){

        return getDataList(OperationTypes.SUBTRACTION);
    }
}
