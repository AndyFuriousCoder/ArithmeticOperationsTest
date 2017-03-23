package processing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import enums.OperationTypes;

public class DataProcessing {

    public static ArrayList<String[]> getDataList(OperationTypes operationType) {

        ArrayList<String[]> dataList = new ArrayList<String[]>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/data.txt"));
            while (reader.ready())
            {
                String dataLine = reader.readLine();
                String[] data = dataLine.split(";");
                if(data[2].equals(operationType.value))
                dataList.add(data);
            }
            reader.close();
        } catch (Exception e) {System.out.println("Data file reading error!");}

        return dataList;
    }
}
