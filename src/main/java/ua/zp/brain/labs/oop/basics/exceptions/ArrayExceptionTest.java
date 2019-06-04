package ua.zp.brain.labs.oop.basics.exceptions;

class ArrayExceptionTest {
    public static void main(String[] args) {
        int arr [] = {5,1,3,7,9,6};
        printArray(arr,5,9);
        printArray(arr,2,5);
        printArray(arr,4,2);
    }
    static void printArray(int arr[],int start,int end){
        for (int i = start; i <end; i++) {
            try {
                System.out.println(arr[i] + " ");
            }catch(ArrayIndexOutOfBoundsException с){
                System.out.println("Ошибка. Попытка обращения к несуществующемуиндексу:текущий индекс = "+i+
                        ";размер массива = "+ start);
            }
        }
    }
}
