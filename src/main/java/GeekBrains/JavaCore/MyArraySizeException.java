package GeekBrains.JavaCore;

public class MyArraySizeException extends  Exception{
    /**Исключение, возникающее при несоответствии длины массива
    * @param size длина массива
     * @return возвращает исключение,в случае несоответствия длины массива
    * */
    public MyArraySizeException(int size) {
        super("The size of the array must be equal to \u001B[36m"+size+"\u001B[0m");
    }
}
