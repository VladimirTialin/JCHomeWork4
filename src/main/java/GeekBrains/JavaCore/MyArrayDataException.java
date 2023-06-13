package GeekBrains.JavaCore;

public class MyArrayDataException extends Exception {
    private int sum;
    public int getSum() {
        return sum;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }
    /**
     * Исключение, возникающее при наличии в массиве нечислового значения
     *
     * @param x элемент двумерного массива по высоте
     * @param y элемент двумерного массива по длине
     * @return выводит сообщение с указанием высоты и длины, в котором расположен нечисловой элемент
     */
    public MyArrayDataException(int x, int y) {
        super("The cell [\u001B[36m" + x + "\u001B[0m]:[\u001B[36m" + y + "\u001B[0m] contains a symbol or text instead of number\n");
    }

    // Данный конструкторы сделал для того, чтобы подсчитать сумму элементов массива до возникновения исключения.
    // Возможно не так понял задание № 3.
    // Может это и лишнее, но задание в последнем задание нужно вывести результаты подсчетов до возникновелния исключения
    public MyArrayDataException(int sum) {
        setSum(sum);
    }

    public MyArrayDataException(int x, int y, int sum) {
        super("The cell [\u001B[36m" + x + "\u001B[0m]:[\u001B[36m" + y + "\u001B[0m]" +
                "contains a symbol or text instead of number.\n sum = " + sum);
        setSum(sum);
    }
}
