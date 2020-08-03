import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void sayHi_should_return_Hello_World() {
        HelloWorld h = new HelloWorld();
        String result = h.sayHi();
        assertEquals("Hello World", result);
    }

    @Test
    public void sayHi_with_saowalak_should_return_Hello_Somkiat() {
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("saowalak");
        assertEquals("Hello Saowalak", result);
    }

    @Test
    public void sayHi_with_beem_should_return_Hello_Pui() {
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("beem");
        assertEquals("Hello Beem", result);
    }
}