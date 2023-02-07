package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "jobDescription")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester", "Harrow","up to 5 miles","30000","500000","Per annum","Permanent","Permanent Tester jobs in Harrow on the Hill|"}

        };
        return data;
    }
}
