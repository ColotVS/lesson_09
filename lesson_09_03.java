public class lesson_09_03 {
    //Алгебраические функции в Java

    //Кроме геометрии, программистам иногда приходится использовать и алгебраические функции.
    //И, конечно же, класс Math содержит самые распространенные из них:
    //Метод                             Описание
    //double sqrt(double a)             квадратный корень из a
    //double cbrt(double a)             кубический корень из a
    //double pow(double a, double b)    возведение в степень: ab
    //double exp(double a)              экспонента: ea
    //double log(double a)              натуральный логарифм a: ln(a)
    //double log10(double a)            десятичный логарифм a: log10a
    //double log1p(double x)            натуральный логарифм x + 1: ln(x + 1)
    //double expm1(double x)            ex-1

    //Если вы хотите получить корень более высокой степени, воспользуйтесь функцией возведения в степень:
    //a в степени ¼ — это и будет корень четвертой степени, и т.д.
    //Math.pow(2, 0.25)

    //Последние две функции log1p() и expm1() могут быть вам полезны, если вы проводите вычисления при очень маленьких значениях x.
    //
    //При сложении очень маленьких и очень больших double переменных часто может возникнуть ситуация,
    //когда очень маленькое значение просто игнорируется (отбрасывается) как незначащее.
    //Это, собственно, и будет происходить, если использовать функции log() и exp().
    //Поэтому программисты придумали функции, которые возвращают только ту самую «маленькую значащую часть»

    //Исправь методы класса Solution, используя класс Math:
    //
    //sqrt(double) — должен возвращать квадратный корень переданного аргумента.
    //cbrt(double) — должен возвращать кубический корень переданного аргумента.
    //pow(int, int) — должен возвращать значение первого аргумента, возведенного в степень второго аргумента.
    public static void main(String[] args) {
        System.out.println("3:\nsqrt=" + sqrt(3) + "\ncbrt=" + cbrt(3) + "\npow=" + pow(3,3));
    }
    public static double sqrt(double a) {
        return Math.sqrt(a);
    }
    public static double cbrt(double a) {
        return Math.cbrt(a);
    }

    public static double pow(int number, int power) {
        return Math.pow(number,power);
    }
}
