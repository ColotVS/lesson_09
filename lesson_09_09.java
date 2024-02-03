import java.util.Random;

public class lesson_09_09 {
    //Класс Random
    //В Java есть специальный класс Random, который инкапсулирует в себе последовательность псевдослучайных чисел.
    //Можно создать несколько объектов класса Random,
    //и каждый из этих объектов будет генерировать свою последовательность псевдослучайных чисел.

    //Метод double nextDouble()
    //Этот метод возвращает случайное вещественное число в диапазоне 0.0 – 1.0. Очень похоже на метод Math.random().
    //И ничего удивительного, ведь метод Math.random() просто вызывает метод nextDouble() у объекта типа Random.

    //Метод float nextFloat()
    //Метод очень похож на метод nextDouble(), только возвращаемое случайное число типа float.
    //Оно также лежит в диапазоне 0.0 – 1.0. И, как всегда, в Java диапазон не включает число 1.0.

    //Метод int nextInt(int max)
    //Этот метод возвращает случайное целое число в диапазоне [0, max). 0 входит в диапазон, max — не входит.
    //Т.е. если вы хотите получить случайное число из набора 1, 2, 3, 4, 5, 6,
    //вам нужно будет прибавить к полученному случайному числу единицу:
    //Random r = new Random();
    //int x = r.nextInt(6) + 1;

    //Метод int nextInt()
    //Этот метод аналогичен предыдущему, но не принимает никаких параметров.
    //Он выдает числа от -2147483648 до +2147483647.

    //Метод long nextLong()
    //Этот метод аналогичен методу nextInt(), только возвращаемое значение будет из всего возможного диапазона значений типа long.

    //Метод boolean nextBoolean()
    //Этот метод возвращает случайное значение типа boolean: false или true.

    //Метод void nextBytes(byte[] data)
    //Этот метод ничего не возвращает (тип void). Вместо этого он заполняет переданный в него массив случайными значениями.

    //Метод double nextGaussian()
    //Этот метод возвращает случайное вещественное число в диапазоне 0.0 — 1.0.
    //Вот только числа в этом диапазоне распределены не равномерно, а подчиняются нормальному распределению.
    //Числа ближе к середине диапазона (0.5) будут выпадать чаще, чем значение по краям диапазона.

    //В этой задаче тебе предстоит реализовать метод getPrediction() в классе MagicBall, который будет работать как шар предсказаний.
    //Он случайным образом возвращает фразу-ответ на заданный вопрос. В методе getPrediction() нужно использовать метод nextInt(int) класса Random, который должен возвращать значения от 0 до 7 включительно.
    //В зависимости от результата работы метода nextInt(int) возвращается один из вариантов ответа:
    //0 -> Бесспорно
    //1 -> Определённо да
    //2 -> Вероятнее всего
    //3 -> Хорошие перспективы
    //4 -> Спроси позже
    //5 -> Попробуй снова
    //6 -> Мой ответ — нет
    //7 -> Весьма сомнительно
    //Иначе вернуть null.

    public static void main(String[] args) {
        System.out.println("");
        System.out.println(MagicBall.getPrediction());
    }
}
class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        int random = new Random().nextInt(8);
        if (random == 0) {
            return CERTAIN;
        } else if (random == 1) {
            return DEFINITELY;
        } else if (random == 2) {
            return MOST_LIKELY;
        } else if (random == 3) {
            return OUTLOOK_GOOD;
        } else if (random == 4) {
            return ASK_AGAIN_LATER;
        } else if (random == 5) {
            return TRY_AGAIN;
        } else if (random == 6) {
            return NO;
        } else if (random == 7) {
            return VERY_DOUBTFUL;
        } else {
            return null;
        }
    }
}
