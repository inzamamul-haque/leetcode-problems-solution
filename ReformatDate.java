package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ReformatDate {
    public String reformatDate(String date) {
        Map<String, Integer> map = new HashMap();
        map.put("Jan", 1);
        map.put("Feb", 2);
        map.put("Mar", 3);
        map.put("Apr", 4);
        map.put("May", 5);
        map.put("Jun", 6);
        map.put("Jul", 7);
        map.put("Aug", 8);
        map.put("Sep", 9);
        map.put("Oct", 10);
        map.put("Nov", 11);
        map.put("Dec", 12);

        String[] d = date.split(" ");

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = d.length - 1; i >= 0; i--) {
            if (map.containsKey(d[i])) {
                int month = map.get(d[i]);
                if (month < 10) {
                    stringBuilder.append("0" + month + "-");
                } else {
                    stringBuilder.append(month + "-");
                }

            } else {
                if (i == 0) {
                    String temp = "";
                    int length = d[0].length();
                    if (length < 4) {
                        temp += d[i].charAt(0);
                    } else {
                        temp += d[i].charAt(0) + "" + d[i].charAt(1);
                    }
                    int day = Integer.parseInt(temp);
                    if (day < 10) {
                        stringBuilder.append("0" + temp);
                    } else {
                        stringBuilder.append(temp);
                    }
                } else {
                    stringBuilder.append(d[i] + "-");
                }
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String date = "20th Oct 2052";
        ReformatDate reformatDate = new ReformatDate();
        String res = reformatDate.reformatDate(date);
        System.out.println(res);
    }
}
