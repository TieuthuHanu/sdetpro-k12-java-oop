package lab_06;

public class Lab0604 {

    public static void main(String[] args) {
        String url = "https://google.com";

        // Check http OR https; domain name, .com OR .net
        String[] urlSplits = url.split("://");
        String secure = urlSplits[0];
        String domainName = urlSplits[1];

        System.out.println(secure.equals("https"));
        System.out.println(domainName);
        System.out.println(".com OR .net? " + domainName.substring(domainName.length() - 4, domainName.length()));
    }
}
