public class ExcelColumnNumber {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (char ch : columnTitle.toCharArray()) {
            int d = ch - 'A' + 1;
            result = result * 26 + d;
        }
        return result;
    }

    public static void main(String[] args) {
        String columnTitle = "B";
        int result = new ExcelColumnNumber().titleToNumber(columnTitle);
        System.out.println(result);
    }
}
