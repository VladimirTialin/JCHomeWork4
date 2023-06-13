package GeekBrains.JavaCore;

public class Main {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        int size=0;
        int sum=0;
        String arr[][]={{"4","3","2","5"},{"4","+","2","4"},{"4","3","0","5"},{"4","3","2","5"}};
        String arr1[][]={{"4","3","2","5"},{"4","1","2","4"},{"4","3","0","5"},{"4","3","2","5"}};
        SumOfArrayElements.print(arr1);
        size = SumOfArrayElements.setSize(4);
        sum = SumOfArrayElements.ArraySum(arr1);
        System.out.printf("Сумма чисел массива = %d\n", sum);
        SumOfArrayElements.print(arr);
        try {
            size = SumOfArrayElements.setSize(4);
            sum = SumOfArrayElements.ArraySum(arr);
            System.out.printf("Сумма чисел массива = %d\n", sum);
        }catch (MyArraySizeException e){
            System.out.printf("\u001B[31m" +
                    "Невозможно призвести операцию сложения элементов массива!" +
                    "Размер вычисляемого массива = %d.\nДля выполнения операции" +
                    "необходим размер массива = %d.\n" +
                    "\u001B[0m",arr.length,size);
        }catch (MyArrayDataException e){
           System.out.println("\u001B[31m" +
                   "Невозможно подсчитать все элементы массива. " +
                   "Заданный массив имеет символы или строки! Сумма чисел в данном массиве = \u001B[34m"+e.getSum()+"\u001B[0m");
        }
        }
}