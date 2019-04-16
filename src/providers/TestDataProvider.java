package providers;


import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import static base.Constants.COMMA_DELIMITER;
import static base.Constants.ERROR_READ;
import static base.Constants.RESOURCES_PATH;
import static base.Constants.TEST_DATA_CSV;

public class TestDataProvider {

    @DataProvider(name = "TestDataProvider")
    public static Object[][] getTestData(ITestContext context) {
        BufferedReader br = null;

        List<TestData> testDataList = new ArrayList<TestData>();

        try {

            br = new BufferedReader(new FileReader(RESOURCES_PATH + TEST_DATA_CSV));

            String line = "";
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] testDataDetails = line.split(COMMA_DELIMITER);

                if (testDataDetails.length > 0) {

                    TestData testData = new TestData(
                            testDataDetails[0], testDataDetails[1], testDataDetails[2],
                            testDataDetails[3], testDataDetails[4], testDataDetails[5]);

                    testDataList.add(testData);
                }
            }
        } catch (Exception ee) {
            ee.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException ie) {
                System.out.println(ERROR_READ);
                ie.printStackTrace();
            }
        }

        Object [][] objArray = new Object[testDataList.size()][];

        for(int i=0;i< testDataList.size();i++){
            objArray[i] = new Object[1];
            objArray[i][0] = testDataList.get(i);
        }

        return objArray;
    }
}
