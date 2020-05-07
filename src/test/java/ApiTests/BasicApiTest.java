package ApiTests;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.*;
import utils.ApiUtils;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) //For Ascending order test execution
public class BasicApiTest extends BaseTest {

    @Test
    public void T01_StatusCodeTest() {
        //Verify the http response status returned. Check Status Code is 200?
        res = ApiUtils.getResponsebyPath("/gen/clients");
        jp = ApiUtils.getJsonPath(res);
        testUtils.checkStatusIs200(res);
    }

    @Test
    public void T02_GetClients() {
        res = ApiUtils.getResponsebyPath("/gen/clients");
        jp = ApiUtils.getJsonPath(res);
        System.out.println(testUtils.getClients(jp));
    }

    @Test
    public void T03_GetAndroidModelPackageOptions() {
        res = ApiUtils.getResponsebyPath("/gen/clients/android");
        jp = ApiUtils.getJsonPath(res);
        System.out.println("Opt: " + jp.get("modelPackage.opt"));
        System.out.println("Description: " + jp.get("modelPackage.description"));
        System.out.println("Type: " + jp.get("modelPackage.type"));
    }

}
