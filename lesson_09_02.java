public class lesson_09_02 {
    //Реализуй методы sin(double), cos(double), tan(double) которые возвращают синус, косинус и тангенс угла соответственно,
    //полученного как параметр. Угол задан в градусах.
    //В этом тебе помогут соответствующие методы класса Math, которые принимают параметром угол, заданный в радианах.
    public static void main(String[] args) {
        double a = sin(45);
        double b = cos(45);
        double c = tan(45);
        System.out.println("Значения для угла в 45 градусов:\n sin(45)=" + a + "\n cos(45)=" + b + "\n tan(45)=" + c);
    }
    public static double sin(double a) {
        return Math.sin(Math.toRadians(a));
    }

    public static double cos(double a) {
        return Math.cos(Math.toRadians(a));
    }

    public static double tan(double a) {
        return Math.tan(Math.toRadians(a));
    }
}
