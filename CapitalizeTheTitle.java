package leetcode;

public class CapitalizeTheTitle {
    public String capitalizeTitle(String title) {
        String[] strings = title.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strings) {
            if (str.length() > 2) {
                String firstChar = str.substring(0, 1).toUpperCase();
                String remainingChar = str.substring(1).toLowerCase();
                stringBuilder.append(firstChar + remainingChar);
            } else {
                stringBuilder.append(str.toLowerCase());
            }
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {
        CapitalizeTheTitle capitalizeTheTitle = new CapitalizeTheTitle();
        String result = capitalizeTheTitle.capitalizeTitle("i love leetcode");
        System.out.println(result);
    }
}
