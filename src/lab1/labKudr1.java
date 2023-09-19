package lab1;
import java.util.Scanner;
public class labKudr1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            boolean play = true;
            int i, len, sum, minEl = 0, maxEl = 0;
            while(play){
                System.out.println("Введите номер задания или 0 для выхода: ");
                switch (sc.nextInt()){
                    case 0: play = false;
                        break;
                    case 3:
                        sum = 0;
                        System.out.print("Задание 3.\nВведите длину массива: ");
                        len = sc.nextInt();
                        int [] array = new int[len];
                        System.out.println("Введите массив: ");
                        for (i = 0; i < len; i++) {
                            array[i] = sc.nextInt();
                            sum += array[i];
                        }
                        System.out.println("Сумма элементов в массиве: " + sum);
                        System.out.println("Среднее арифметическое массива: " + sum / len);
                        break;
                    case 4:
                        System.out.print("Задание 4.\nВведите длину массива: ");
                        len = sc.nextInt();
                        sum = 0;
                        int [] array4 = new int[len];
                        System.out.println("Введите массив: ");
                        i = 0;
                        while(i < len){
                            array4[i] = sc.nextInt();
                            if (i == 0){
                                minEl = array4[i];
                                maxEl = array4[i];
                            }
                            else {
                                if (array4[i] > maxEl)
                                    maxEl = array4[i];
                                if (array4[i] < minEl)
                                    minEl = array4[i];
                            }
                            sum += array4[i];
                            i++;
                        }
                        System.out.println("Сумма элементов в массиве: " + sum);
                        System.out.println("Минимальный элемент в массиве: " + minEl);
                        System.out.println("Максимальный элемент в массиве: " + maxEl);

                        //То же самое, но с циклом do while

                        System.out.print("Задание 4.2\nВведите длину массива: ");
                        len = sc.nextInt();
                        sum = 0;
                        int [] a = new int[len];
                        System.out.println("Введите массив: ");
                        i = 0;
                        do {
                            a[i] = sc.nextInt();
                            if (i == 0){
                                minEl = a[i];
                                maxEl = a[i];
                            }
                            else {
                                if (a[i] > maxEl)
                                    maxEl = a[i];
                                if (a[i] < minEl)
                                    minEl = a[i];
                            }
                            sum += a[i];
                            i++;
                        }while (i < len);
                        System.out.println("Сумма элементов в массиве: " + sum);
                        System.out.println("Минимальный элемент в массиве: " + minEl);
                        System.out.println("Максимальный элемент в массиве: " + maxEl);
                        break;
                    case 5:
                        System.out.println("Все аргументы командной строки: ");
                        for (i = 0; i < args.length; i++)
                            System.out.println("Аргумент " + (i+1) + ": " + args[i]);
                        break;
                    default:
                        System.out.println("Такого задания нет:)");
                        break;
                }
            }

        }

}
