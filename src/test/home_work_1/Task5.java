package test.home_work_1;

public class Task5 {
    public String sleepText(boolean a, boolean b){
        String text;
        if (sleepIn(a, b)) {
            text = "Можно спать дальше";
            System.out.println(text);
        }else {
            text = "Пора идти на работу";
            System.out.println(text);
        }
        return text;
    }
    public static Boolean sleepIn (boolean weekday, boolean vacation) {
        String x;
        return !weekday || vacation;
    }
}