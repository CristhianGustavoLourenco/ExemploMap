/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exemplomap;

import entities.Product;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author crist
 */
public class ExemploMap {

    public static void main(String[] args) {

//Demonntração 1
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711122");

        cookies.remove("email");
        cookies.put("phone", "99771133");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));

        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES:");
        for (String key : cookies.keySet()) {
            System.out.println(key + ":" + cookies.get(key));
        }

//Demonstração 2
        Map<Product, Double> stock = new HashMap<>();
        
        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);
        
        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);
        
        Product ps = new Product("Tv", 900.0);
        
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}
