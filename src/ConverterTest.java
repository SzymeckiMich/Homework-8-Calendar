public class ConverterTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            System.out.println(i + " day of week is " + CalandarConverter.convertDayToString(i));
        }
    }
}
