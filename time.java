import java.time.LocalTime;
import java.time.LocalDate;
import java.time. LocalDateTime;

public class java_time {
    public static void main(String[] args) {
        LocalTime a=LocalTime.now() ;

        System.out.println(a);

        LocalDate t=LocalDate.now() ;

        System.out.println(t);
        LocalDateTime as=LocalDateTime.now();
        System.out.println(as);
    }
}
