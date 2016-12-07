


public class Ip implements Comparable {

    private int[] oktet = new int[4];

    @Override
    public String toString() {
        return oktet[3] + "." + oktet[2] + "." + oktet[1] + "." + oktet[0];
    }

    public Ip(String ip) throws Exception {

        if (ip == null) {
            throw new Exception("IP-address should not be null");
        }

        String[] temp = ip.split("\\.");

        if (temp.length != 4) {

            throw new Exception("invalid IP-address format");
        }

        for (int i = 3; i >= 0; i--) {

            oktet[3 - i] = Integer.parseInt(temp[i]);

            if (oktet[3 - i] > 255 || oktet[3 - i] < 0) {

                throw new Exception("invalid IP-address format");
            }

        }

    }

    public void increment() {
        increment(0);
    }

    private void increment(int index) {
        if (index < 4 && ++oktet[index] == 256) {
            oktet[index] = 0;
            increment(++index);
        }
    }


    public int[] getOktet() {
        return oktet;
    }

    public int compareTo(Object o) {

        return compareto(((Ip) o).getOktet(), 3);

    }

    private int compareto(int[] temp, int index) {

        if (oktet[index] != temp[index]) {

            return oktet[index] > temp[index] ? 1 : -1;
        }

        return index == 0 ? 0 : compareto(temp, --index);
    }
}
