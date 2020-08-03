import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CircularBufferTest {

    @Test
    public void create_new_buffer_should_empty(){
        CircularBuffer cb = new CircularBuffer();
        boolean result = cb.isEmpty();
        assertTrue("busy", result);
    }

    @Test
    public void create_new_buffer_with_default_size_10(){
        CircularBuffer cb = new CircularBuffer();
        for(int i=0; i<10; i++){
            cb.writeData("A" + i);
        }
        boolean result = cb.isFull();
        assertTrue("busy", result);
    }

    @Test
    public void write_A_B_to_buffer_should_read_A_B_from_buffer(){
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());
    }

}