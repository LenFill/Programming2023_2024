package exampleLab4;
import java.util.Random;
/*
Напишите программу, в которой создается и инициализируется
двумерный числовой массив. Затем из этого массива удаляется строка и
столбец (создается новый массив, в котором по сравнению с исходным
удалена одна строка и один столбец). Индекс удаляемой строки и индекс
удаляемого столбца определяется с помощью генератора случайных чисел.
 */
public class Example_6 {
    public static void main(String[] args) {
        int [][] mass = new int[7][7];
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            System.out.println();
            for (int j = 0; j < 7; j++){
                mass[i][j] = random.nextInt(10, 99);
                System.out.print(mass[i] [j]+ " ");
            }
        }
        int stroka = random.nextInt(6);
        int stolbetc = random.nextInt(6);
        System.out.println("\nУдаляется строка " + (stroka+1) + " столбец " + (stolbetc+1));
        int [][] mass1 = new int[6][6];
        for (int i = 0; i <= 6; i++ ){
            if (i< stroka){
                for (int j = 0; j<= 6; j++) {
                    if (j < stolbetc) {
                        mass1[i][j] = mass[i][j];
                    } else if (j == stolbetc)
                        continue;
                    else if (j > stolbetc) {
                        mass1[i][j - 1] = mass[i][j];
                    }
                }
            } else if (i == stroka)
                continue;
            else if (i > stroka) {
                for (int j = 0; j<= 6; j++) {
                    if (j < stolbetc) {
                        mass1[i-1][j] = mass[i][j];
                    } else if (j == stolbetc)
                        continue;
                    else if (j > stolbetc) {
                        mass1[i-1][j - 1] = mass[i][j];
                    }
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.println();
            for (int j = 0; j < 6; j++) {
                System.out.print(mass1[i][j] + " ");
            }
        }
    }
}

