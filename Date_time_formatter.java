import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Date_time_formatter {

    public static void main(String[] args) {
        LocalDateTime df=LocalDateTime.now();
        System.out.println(df);

        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/MM/yyyy--E h:m a");


        String g=df.format(f);
        System.out.println(g);

    }
}
