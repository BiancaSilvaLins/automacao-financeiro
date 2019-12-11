package paginas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class PaginaBase {


    public static String retornaData() {
        LocalDateTime now = LocalDateTime.now();
        String format =
                now.format(DateTimeFormatter.ofPattern("yyyyMMddmmss", Locale.ENGLISH));
        return format.toString();
    }

}
