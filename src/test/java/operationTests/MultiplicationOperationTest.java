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


@Title("Multiplication operation test results")
@RunWith(Parameterized.class)
public class MultiplicationOperationTest extends TestBase {

    public MultiplicationOperationTest(String operand1, String operand2, String operation, String result) {
        super(operand1, operand2, operation, result);
    }

    @Title("Multiplication operation test")
    @Description("Checking multiplication operation")
    @Test
    public void checkingMultiplicationOperationTest(){
        Assert.assertTrue("Wrong multiplication result!", getResult() == getOperand1() * getOperand2());
    }

    @Parameterized.Parameters
    public static ArrayList<String[]> getTestData(){

        return getDataList(OperationTypes.MULTIPLICATION);
    }
}