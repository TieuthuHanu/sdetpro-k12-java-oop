package lab_06;

public class Lab0601 {

    public static void main(String[] args) {
        String str = "2hrs and 5 minutes";

        String[] strSplits = str.split(" and ");
        String hourStr = strSplits[0].substring(0, 1);
        String minStr = strSplits[1].substring(0, 1);

        int hour = Integer.parseInt(hourStr);
        int minute = Integer.parseInt(minStr);

        int totalMinute = hour * 60 + minute;
        System.out.println(totalMinute);
    }
}
