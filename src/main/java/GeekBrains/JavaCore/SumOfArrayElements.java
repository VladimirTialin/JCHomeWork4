package GeekBrains.JavaCore;

public class SumOfArrayElements {
    private static int size=0;

    public static int setSize(int size) {
        SumOfArrayElements.size = size;
        return size;
    }
    /**
     * Метод подсчета элементов массива
     *
     */
    public static int ArraySum(String [][] str) throws MyArrayDataException, MyArraySizeException {
        int sum=0;
        if((str.length & str[0].length)!=size)
                throw new MyArraySizeException(size);
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length ; j++) {
                if(!isStringInteger((str[i][j])))
                    throw new MyArrayDataException(i,j,sum);
                    /*Также доступны варианты исключения:
                     1. MyArrayDataException(i,j);
                     2. MyArrayDataException(sum);
                    */
                sum += Integer.parseInt(str[i][j]);
            }
        }
        return sum;
    }
    /**
     *  Метод проверки числа в строке
     */
    static boolean isStringInteger(String number ){
        try{
            Integer.parseInt(number);
        }catch(Exception e ){
            return false;
        }
        return true;
    }
    /**
     *  Метод печати массива
     */
    public static void print(String [][] str){
        for (int i = 0; i <str.length; i++) {
            System.out.print("|");
            for (int j = 0; j < str[i].length; j++) {
                System.out.print(str[i][j]+"|");
            }
            System.out.println();
        }
    }
}
