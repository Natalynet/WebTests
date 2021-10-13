import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.TestNGUtils;
import org.testng.annotations.Test;

public class Test2 {
    @Test
    void validate(){
        int a = 24;
        int b =6;
        int c = 2;

        Assert.assertEquals(Main.getSum(a,b), 30);
        Assert.assertEquals(Main.division(a,b), 4);
        Assert.assertEquals(Main.multiply(c,b), 12);
        Assert.assertEquals(Main.substruction(a,c), 22);
    }


    @Test
    void testAbbreviation(){

        String s = "Hello everybody who lives on the Moon, how are you doing?";
        String result = StringUtils.abbreviate(s, "", 10);
        Assert.assertEquals(result, "Hello ever");




    }
}
