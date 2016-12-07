import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by admin.kz.alyashev on 07.12.2016.
 */
public class IpTest {
    @Test
    public void toStringTest() throws Exception {

        Ip ip = new Ip("192.168.0.1");
        assertEquals("192.168.0.1", ip.toString());

    }

    @Test
    public void increment() throws Exception {

        Ip ip = new Ip ("192.168.0.254");
        ip.increment();
        assertEquals("192.168.0.255", ip.toString());
        ip.increment();
        assertEquals("192.168.1.0", ip.toString());

    }

    @Test
    public void getOktet() throws Exception {

        Ip ip = new Ip ("192.168.1.2");
        int[] temp = ip.getOktet();
        assertEquals(192, temp[3]);
        assertEquals(168, temp[2]);
        assertEquals(1, temp[1]);
        assertEquals(2, temp[0]);

    }

    @Test
    public void compareTo() throws Exception {

        Ip ip1 = new Ip("192.168.0.1");
        Ip ip2 = new Ip("192.168.0.1");
        Ip ip3 = new Ip("192.168.0.2");

        assertEquals(0, ip1.compareTo(ip2));
        assertEquals(0, ip2.compareTo(ip1));
        assertEquals(-1, ip1.compareTo(ip3));
        assertEquals(1, ip3.compareTo(ip1));

    }

}