import java.time.LocalDate;
class DayOfYear {
    public int dayOfYear(String date) {
        LocalDate localDate = LocalDate.parse(date);
        return localDate.getDayOfYear();    
    }
}
