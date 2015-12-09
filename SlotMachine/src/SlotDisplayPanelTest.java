import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by mb_ch on 12/8/2015.
 */
public class SlotDisplayPanelTest extends TestCase {

    @Test
    public void testChooseImage() throws Exception {
        SlotDisplayPanel slotpanel = new SlotDisplayPanel();
        String expected = "lol";
        assertEquals("Doesn't match", expected,slotpanel.chooseImage(new String[] {"lol", "close", "weird"}) );
    }

    @Test
    public void testChooseImage2() throws Exception {
        SlotDisplayPanel slotpanel = new SlotDisplayPanel();
        String expected = "Over four";
        assertEquals("Doesn't match", expected, slotpanel.chooseImage(new String[] {"lol", "close", "weird", "Over four"}) );
    }

    @Test
    public void testChooseImage3() throws Exception {
        SlotDisplayPanel slotpanel = new SlotDisplayPanel();
        String expected = null;
        assertEquals("Doesn't match", expected,slotpanel.chooseImage(new String[] {}) );
    }
}