/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package project12;
import java.net.MalformedURLException;


public class App {
    public void getGreeting() throws InterruptedException, MalformedURLException {
       TestCases tests = new TestCases(); // Initialize your test class
        SearchAmazon s1 = new SearchAmazon();
        CountHyperLinks c1 = new CountHyperLinks();
        ImageURl i = new ImageURl();
        //TODO: call your test case functions one after other here

       tests.testCase01();
        s1.testCase02();
        c1.testCase01();
        i.testCase01();
        //END Tests


       tests.endTest(); // End your test by clearning connections and closing browser
       s1.endTest();
        c1.endTest();
        i.endTest();
    }

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        new App().getGreeting();
    }
}
