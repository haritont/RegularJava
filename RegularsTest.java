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
    @Test
    public void checkTrueGUID(){
        Assert.assertEquals(true, regular.checkGUID("e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
        Assert.assertEquals(true, regular.checkGUID("c1af4cf5-674d-4e7a-adbe-401e0163cff5"));
        Assert.assertEquals(true, regular.checkGUID("1f9959f1-0094-4cfa-a229-27b6f953c4fe"));
        Assert.assertEquals(true, regular.checkGUID("3148898f-0fea-403e-a106-769f23ab6266"));
        Assert.assertEquals(true, regular.checkGUID("ffecf9c3-44cb-4a44-b2f8-9b23f0c75d2e"));
        Assert.assertEquals(true, regular.checkGUID("85a2ccdc-1101-4c4d-8644-77f9518ba2e1"));
    }
    @Test
    public void checkFalseGUID(){
        Assert.assertEquals(false, regular.checkGUID("e02fd0e400fd090Aca300d00a0038ba0"));
        Assert.assertEquals(false, regular.checkGUID("c1af4cf5-674d-4e7a-adbe-adff-401e0163cff5"));
        Assert.assertEquals(false, regular.checkGUID("1f9959f1_0094_4cfa_a229_27b6f953c4fe"));
        Assert.assertEquals(false, regular.checkGUID("3148898f-0fea-403e-a106769f23ab6266"));
        Assert.assertEquals(false, regular.checkGUID("fFecf9c3,44CB,4a44,b2f8,9b23F0c75d2e"));
        Assert.assertEquals(false, regular.checkGUID("85a2ccdc-1101-4c4d-77f9518ba2e1"));
    }
}