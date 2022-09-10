import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class RegularsTest {
    private static Regulars regular;

    @BeforeAll
    public static void init() {
        regular = new Regulars();
    }

    @AfterAll
    public static void tearDown(){regular=null;}

    @Test
    public void checkTrueIP(){
        Assert.assertEquals(true, regular.checkIP("127.0.0.1"));
        Assert.assertEquals(true, regular.checkIP("255.255.255.0"));
        Assert.assertEquals(true, regular.checkIP("78.0.89.8"));
        Assert.assertEquals(true, regular.checkIP("0.0.0.1"));
        Assert.assertEquals(true, regular.checkIP("23.70.9.34"));
        Assert.assertEquals(true, regular.checkIP("254.0.0.255"));
    }
    @Test
    public void checkFalseIP(){
        Assert.assertEquals(false, regular.checkIP("256.256.255.265"));
        Assert.assertEquals(false, regular.checkIP("0.0.123.iu"));
        Assert.assertEquals(false, regular.checkIP("tyu.ytg.gyu.oiu"));
        Assert.assertEquals(false, regular.checkIP("6,9,0,9"));
        Assert.assertEquals(false, regular.checkIP("-8.o.0.8"));
        Assert.assertEquals(false, regular.checkIP("iu,ghj.0.0"));
    }
}