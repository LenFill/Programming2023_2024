package exampleLab10.example_9;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadExcelFileExample {
    public static void main(String[] args) throws IOException {
        String filePath = "src/exampleLab10/example_5/example.xlsx";
        Scanner in = new Scanner(System.in);
        while (true){
            try(FileInputStream inputStream = new FileInputStream(filePath);
                XSSFWorkbook workbook = new XSSFWorkbook(inputStream)){
                XSSFSheet sheet = workbook.getSheetAt(0);

                for(Row row : sheet) {
                    for (Cell cell : row) {
                        System.out.println(cell.toString() + "\t");
                    }
                    System.out.println();
                }
                break;
            }catch (Exception e){
                System.out.println("Ошибка чтения: " + e.getMessage());
                System.out.println(
                        "Проверьте путь к файлу, формат XLSX и наличие листа.");
            }
            System.out.println(
                    "После исправления ошибки нажмите Enter для повтора "
                            + "или введите 0 для выхода.");
            if (in.nextLine().equals("0")) {
                return;
            }
        }
    }
}
