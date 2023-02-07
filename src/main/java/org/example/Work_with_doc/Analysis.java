package org.example.Work_with_doc;


import java.net.URL;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Analysis {
    //возвращает массив url, которых нет в hashtable today
    public static List<URL> get_old(Hashtable<URL, String> yesterday, Hashtable<URL, String> today){
        List<URL> list_of_old_urls = new ArrayList<>();
        for (Map.Entry<URL, String> yo : yesterday.entrySet()) {
            if(!today.containsKey(yo.getKey())){
                list_of_old_urls.add(yo.getKey());
            }
        }
        return list_of_old_urls;
    }
    //возвращает массив url, html страницы которых были изменены
    public static List<URL> get_modified(Hashtable<URL, String> yesterday, Hashtable<URL, String> today){
        List<URL> list_of_modified_urls = new ArrayList<>();
        for (Map.Entry<URL, String> yo : yesterday.entrySet()) {
            if((today.containsKey(yo.getKey()) && !today.get(yo.getKey()).equals(yo.getValue()))){
                list_of_modified_urls.add(yo.getKey());
            }
        }
        return list_of_modified_urls;
    }
    //возвращает массив url, которых нет в hashtable yestarday
    public static List<URL> get_new(Hashtable<URL, String> yesterday, Hashtable<URL, String> today){
        List<URL> list_of_new_urls = new ArrayList<>();
        for (Map.Entry<URL, String> yo : today.entrySet()) {
            if(!yesterday.containsKey(yo.getKey())){
                list_of_new_urls.add(yo.getKey());
            }
        }
        return list_of_new_urls;
    }
}
