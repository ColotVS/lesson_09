public class lesson_09_07 {
    //Как получить случайные целые числа в диапазоне 1..6, а не вещественные в диапазоне 0..1?
    //Сначала нужно превратить диапазон [0,1) в [0, 6).
    //Для этого нужно просто умножить результат функции random() на 6.
    //Прибавить 1 чтобы изменить диапазон чисел от 0 до 6 на диапазон от 1 до 7;
    //Ну а чтобы получить целые числа, нужно это все округлить:
    public static int getRandomDiceNumber()
    {
        return (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            int x = getRandomDiceNumber();
            System.out.println(x);
        }
    }
}
