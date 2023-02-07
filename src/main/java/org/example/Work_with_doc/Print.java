package org.example.Work_with_doc;

import java.net.URL;
import java.util.List;

public class Print {
    protected static void print_old_urls(List<URL> old_url){
        if(!old_url.isEmpty()){
            for (URL url: old_url) {
                System.out.println(url);
            }
        }
    }
    protected static void print_modified_urls(List<URL> modified_url) {
        if(!modified_url.isEmpty()){
            for (URL url : modified_url) {
                System.out.println(url);
            }
        }
    }
    protected static void print_new_urls(List<URL> new_url) {
        if(!new_url.isEmpty()){
            for (URL url : new_url) {
                System.out.println(url);
            }
        }
    }
    public static void print_DOC(String FIO, List<URL> old_urls, List<URL> modified_urls,List<URL> new_urls){
        System.out.println("Здравствуйте, дорогая " + FIO + "\n\n"
                + "За последние сутки во вверенных Вам сайтах произошли следующие изменения:\n\n"
                + "Исчезли следующие страницы:");
        print_old_urls(old_urls);
        System.out.println("Появились следующие новые страницы:");
        print_new_urls(new_urls);
        System.out.println("Изменились следующие страницы:");
        print_modified_urls(modified_urls);
        System.out.println("С уважением,\n" +
                "автоматизированная система\n" +
                "мониторинга.");
    }
}

