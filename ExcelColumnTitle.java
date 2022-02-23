public class ExcelColumnTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder columnTitle = new StringBuilder();
        while (columnNumber > 0) {
            char d = (char) ('A' + (columnNumber -1) % 26);
            columnTitle.append(d);
            columnNumber = (columnNumber -1) / 26;
        }
        System.out.println(1/26);
        return columnTitle.reverse().toString();
    }

    public static void main(String[] args) {
        String result = new ExcelColumnTitle().convertToTitle(53);
        System.out.println(result);
    }
}
