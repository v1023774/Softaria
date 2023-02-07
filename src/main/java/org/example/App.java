package org.example;

import org.example.Work_with_doc.Analysis;
import org.example.Work_with_doc.Print;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;

public class App {
    public static void main(String[] args) {
        //Это простая проверка моего кода...не обращайте внимания..
        Hashtable<URL, String> Yesterday = new Hashtable<>();
        Hashtable<URL, String> Today = new Hashtable<>();

        URL url, url1, url2, url3, url4, url5;
        try {
            url = new URL("http://version=8");
            url1 = new URL("http://version=9");
            url2 = new URL("http://version=10");
            url3 = new URL("http://version=11");
            url4 = new URL("http://version=12");
            url5 = new URL("http://version=13");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        String Html = "1234567890";
        String Html1 = "12345";
        String Html2 = "123456";
        String Html3 = "1234589";
        String Html31 = "1234555";

        Yesterday.put(url, Html);
        Yesterday.put(url1, Html1);
        Yesterday.put(url3, Html31);
        Yesterday.put(url4, Html31);

        Today.put(url, Html);
        Today.put(url1, Html1);
        Today.put(url2, Html2);
        Today.put(url3, Html31);
        Today.put(url4, Html);
        //Html код страницы решил хранить стрингом

        //печать письма, решил вывести в консоль текст письма, тк в задании ничего про формат не сказано... хотя вывести в документ формата txt или ворд не составило бы труда.
        Print.print_DOC("Mia Toretto", Analysis.get_old(Yesterday, Today),Analysis.get_modified(Yesterday, Today),Analysis.get_new(Yesterday, Today) );
    }
}