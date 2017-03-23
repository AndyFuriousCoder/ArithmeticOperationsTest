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

@Title("Addition operation test results")
@RunWith(Parameterized.class)
public class AdditionOperationTest extends TestBase {

    public AdditionOperationTest(String operand1, String operand2, String operation, String result) {
        super(operand1, operand2, operation, result);
    }

    @Title("Addition operation test")
    @Description("Checking addition operation")
    @Test
    public void checkingAdditionOperationTest(){
        Assert.assertTrue("Wrong addition result!", getResult() == getOperand1() + getOperand2());
    }

    @Parameterized.Parameters
    public static ArrayList<String[]> getTestData(){

        return getDataList(OperationTypes.ADDITION);
    }
}


