import java.util.concurrent.TimeUnit;

public class lesson_09_13 {
    //Класс TimeUnit
    //Этот класс делает то же самое, что и Thread.sleep(), просто удобнее:

    //TimeUnit.HOURS.sleep(15)
    //Этот код усыпит вашу программу на 15 часов.
    //Также доступны минуты, секунды, дни.  А еще — микросекунды (1/1000,000) и наносекунды (1/1000,000,000).

    //У класса TimeUnit есть такие свойства:
    //наносекунды: NANOSECONDS
    //микросекунды: MICROSECONDS
    //миллисекунды: MILLISECONDS
    //секунды: SECONDS
    //минуты: MINUTES
    //часы: HOURS
    //дни: DAYS

    //Очень удобно работать с такими свойствами: не нужно задумываться о переводе, скажем, часов в миллисекунды.
    //Такой код и писать, и читать гораздо приятнее.

    //В классе Solution реализуй метод setTimer(int, int, int, int, int),
    //который засыпает на определенное время, используя соответствующие методы java.util.concurrent.TimeUnit.
    public static void main(String[] args) throws InterruptedException {
        setTimer(0,0,0,5,5);
    }
    public static void setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
        System.out.println("Таймер запущен!");
        TimeUnit.DAYS.sleep(days);
        TimeUnit.HOURS.sleep(hours);
        TimeUnit.MINUTES.sleep(minutes);
        TimeUnit.SECONDS.sleep(seconds);
        TimeUnit.MILLISECONDS.sleep(millis);
        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
    }
}
