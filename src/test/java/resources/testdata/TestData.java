package resources.testdata;


import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "credentials")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
        {"Tester", "Harrow", "up to 5 miles", "30000", "50000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow on the Hill"},
                  {"Accountant", "Coventry", "up to 7 miles", "2500", "3500", "Per month", "Contract", "Contract Accountant jobs in Coventry"},
                {"Retail Sales", "London", "up to 15 miles", "500", "550", "Per week", "Part Time", "Part Time Retail Sales jobs in London"},
                {"Team Administrator", "Coventry", "up to 2 miles", "20000", "25000", "Per annum", "Temporary", "Temporary Team Administrator jobs in Coventry"}

        };
        return data;
    }

}
