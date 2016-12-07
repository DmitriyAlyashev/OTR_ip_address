


public class SearchIpImpl implements SearchIp {


    public void searchInterval(Ip min, Ip max) {

        if (min.compareTo(max) < 0) {
            toSeach(min, max);
        } else toSeach(max, min);

    }

    private void toSeach(Ip min, Ip max) {

        while (min.compareTo(max) < 0) {
            min.increment();

            if (min.compareTo(max) < 0) {
                System.out.println(min);
            }
        }
    }
}
