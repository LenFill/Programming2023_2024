package exampleLab10.example_8;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class NewsParser {
    public static void main(String[] args) {
        Document doc = null;
        for(int i = 1; i <= 3; i++){
            try{
                doc = Jsoup.connect("https://jsoup.org/new/").get();
                break;
            } catch (IOException e){
                System.out.println("Ошибка подключения. Попытка " + i + " из 3: " + e.getMessage());
            }
        }
        if (doc == null){
            return;
        }

        try{
            //Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
            //Elements titles = doc.getElementsByClass("blocktitle");
            //Elements dates = doc.getElementsByClass("blockdate");

            Elements titles = doc.select(".toc .entry a");
            Elements dates = doc.select(".toc .date time");
            try (FileWriter file = new FileWriter("src/exampleLab10/example_8/news.txt")){
                for (int i = 0; i <titles.size(); i++){
                    System.out.println("Тема: " + titles.get(i).text());
                    System.out.println("Время: " + dates.get(i).text());
                    System.out.println();

                    file.write("Тема: " + titles.get(i).text() + "\n");
                    file.write("Время: " + dates.get(i).text() + "\n\n");
                }
            }
            System.out.println("Новости сохранены в файл.");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
