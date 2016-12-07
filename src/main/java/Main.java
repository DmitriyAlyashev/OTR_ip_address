import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Please, enter first IP-address: ");
            Ip ipFirst = new Ip(reader.readLine());
            System.out.print("Please, enter last IP-address: ");
            Ip ipLast = new Ip(reader.readLine());
            SearchIpImpl search = new SearchIpImpl();
            search.searchInterval(ipFirst, ipLast);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
