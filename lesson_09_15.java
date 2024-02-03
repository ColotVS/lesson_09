public class lesson_09_15 {
    //Побитовый оператор OR
    //Данный оператор очень похож на логический оператор OR (ИЛИ), только обозначается уже не двумя вертикальными линиями, а одной:
    //a | b
    //Также он применяется не к числу в целом, а к его битам: i-й бит числа-результата вычисляется на основе i-х бит каждого из двух чисел.

    //Побитовый OR (ИЛИ) означает, что «результирующий бит равен единице если бит числа a равен единице ИЛИ бит числа b равен единице»:
    //1 | 1 = 1
    //1 | 0 = 1
    //0 | 1 = 1
    //0 | 0 = 0

    //Пример	        Результат
    //0b0011 | 0b1010   0b1011
    //0b1110 | 0b0000   0b1110
    //0b1010 | 0b0101   0b1111
    //0b1111 | 0b1010   0b1111

    //Закомментируй ненужные строки кода, чтобы на экран вывелась цифра 5.
    public static void main(String[] args) {
        int x = 7;
//      x = x & 25;
        x = x & 5;
//      x = x & 3;
        x = x & 12;
        x = x | 1;
        System.out.println(x);
    }
}
