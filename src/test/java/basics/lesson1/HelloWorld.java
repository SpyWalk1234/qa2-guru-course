package basics.lesson1;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class HelloWorld {
    @Test
    public void printHelloWorld() {
        System.out.println("Hello, world!");
        byte age = 12;
        Byte bigAge = null;

        short distance = 32767;
        Short bigDistance = null;

        int userId = 223322223;
        Integer bigUserId = 454355435;

        long id = 74835765446775L;
        Long bigId = null;

        float price = 15.29F;
        Float bigPrice = 999.99F;

        double weight = 4.4039;
        Double bigWeight = 7383.5567;

        double result = weight + bigWeight;//result = 4.4039+7383.5567

        BigDecimal carPrice = new BigDecimal("73833.83");
        BigDecimal secondCarPrice = new BigDecimal("3537900.98");

        carPrice.add(secondCarPrice);
        /*
        multiple
        line
        comment
         */

        char letter = 'h';
        Character space = ' ';

        String text = "Hello, Nikita!";
        String oneChar = "h";

        boolean isLightSwitchedOn = true;
        Boolean isLectureEnded = false;
    }

    @Test
    public void variablesExamples() {
        int a = 13;
        int b = 44;

        String c = "13";
        String d = "44";

        System.out.println(a + b);
        System.out.println(c + d);

        System.out.println(a + c);
        System.out.println(c + a);

        int x = 12345;
        String y = "12345";

        int z = Integer.parseInt(y);
        System.out.println(z);

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Date" + date);
        System.out.println("Time" + time);
        System.out.println("Date and time" + dateTime);

        System.out.println(date.getMonth().getDisplayName(TextStyle.SHORT, Locale.GERMANY));
        System.out.println(date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
    }
}