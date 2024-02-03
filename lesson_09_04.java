import java.util.Scanner;

public class lesson_09_04 {
    //Минимум и максимум.
    //Две полезные функции — это функции min(a, b) и max(a, b). Первая, как вы уже, наверное, догадываетесь,
    //возвращает минимум из двух чисел:
    //Math.min(a, b)

    //А вторая — максимум из двух чисел:
    //Math.max(a, b)

    //Зачем же нужны эти функции, если всегда можно написать if или даже использовать тернарный оператор a < b ? a : b
    //Все дело в читабельности кода. Иногда код и так перегружен if-ами и хочется использовать более компактную запись.

    //Минимум и максимум из нескольких чисел
    //Есть еще одно полезное применение функций min() и max().
    //Это вычисление минимума (или максимума) из нескольких чисел или переменных. Функции очень удобно вызывать друг в друге.
    //Вот как можно записать минимум из 3-х чисел:

    //Math.min(a, Math.min(b, c))

    //В этой задаче тебе нужно:
    //Считать 10 чисел с консоли и заполнить ими массив с помощью метода getArrayOfTenElements().
    //Найти минимальный элемент массива и вернуть этот элемент с помощью метода min(int[]).
    //В методе min(int[]) обязательно используй метод Math.min(int, int).
    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int min = ints[0];
        for (int number : ints) {
            min = Math.min(min, number);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
