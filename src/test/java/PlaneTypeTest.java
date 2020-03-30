import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTypeTest {

    PlaneType planeType;

    @Before
    public void setUp(){
        planeType = new Plane(PlaneType.BOEING737);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(6, planeType.getCapacity());
    }
}
