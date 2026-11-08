package exampleLab10.example_4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class NewsParser {
    public static void main(String[] args) {
        try{
            //Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
            //Elements titles = doc.getElementsByClass("blocktitle");
            //Elements dates = doc.getElementsByClass("blockdate");

            Document doc = Jsoup.connect("https://jsoup.org/news/").get();
            Elements titles = doc.select(".toc .entry a");
            Elements dates = doc.select(".toc .date time");

            for (int i = 0; i <titles.size(); i++){
                System.out.println("Тема: " + titles.get(i).text());
                System.out.println("Время: " + dates.get(i).text());
                System.out.println();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
