//package baitap;
//
//import javax.lang.model.util.Elements;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Baitap4 {
//    public static List<String> extractNewsLinks(String url) {
//        List<String> newsLinks = new ArrayList<>();
//
//        try {
//            // Lấy nội dung HTML của trang web
//            Document document = Jsoup.connect(url).get();
//
//            // Tìm và trích xuất các liên kết tin tức
//            Elements newsItems = document.select("a.news-item-title");
//            for (org.jsoup.nodes.Element newsItem : newsItems) {
//                String newsLink = newsItem.attr("href");
//                newsLinks.add(newsLink);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return newsLinks;
//    }
//    public static void main(String[] args) {
//
//    }
//}
