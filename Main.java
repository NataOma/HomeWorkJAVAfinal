package HomeWorkFinal;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        Store store1 = new Store();

        Os windows11 = new Os("Windows");
        Os linux = new Os("Ubuntu");
        Os macOs = new Os("Macos");
        
        Laptop one = new Laptop("SSD", 256, "DDR4",
                8, windows11.getName(), 48000, "gray");
        Laptop two = new Laptop("SSD", 512, "DDR5",
                16, windows11.getName(), 65000, "black");
        Laptop three = new Laptop("SSD", 512, "DDR4",
                16, macOs.getName(), 99000, "silver");
        Laptop four = new Laptop("SSD", 512, "DDR5",
                16, linux.getName(), 75000, "black");
       
        store1.addProduct(windows11);
        store1.addProduct(linux);
        store1.addProduct(macOs);
        store1.addProduct(one);
        store1.addProduct(two);
        store1.addProduct(three);
        store1.addProduct(four);
        
        System.out.println(store1.getProducts());

        HashMap<Integer, String> filter = new HashMap<>();
        filter.put(1, "ОЗУ");
        filter.put(2, "Объем ЖД");
        filter.put(3, "Операционная система");
        filter.put(4, "Цвет");
        filter.put(5, "Выход");

        HashMap<Integer, String> filterColor = new HashMap<>();
        filterColor.put(1, "black");
        filterColor.put(2, "silver");
        filterColor.put(3, "grey");
        filterColor.put(4, "brown");

        boolean program = true;
        
        while (program) {
            System.out.println("Выберите фильтр");
            for (int i = 1; i < filter.size()+1; i++) {
                System.out.println(i + ". " + filter.get(i));
            }
            int answer = Integer.parseInt(System.console().readLine().trim());
            String answer2;
            switch (answer) {
                case 1:
                    System.out.println("Введите минимальный размер ОЗУ");
                    answer2 = System.console().readLine().trim();
                    System.out.println(store1.getProducts(answer, answer2));
                    break;
                    
                case 2:
                    System.out.println("Введите минимальный размер ЖД");
                    answer2 = System.console().readLine().trim();
                    System.out.println(store1.getProducts(answer, answer2));
                    break;

                case 3: {
                    System.out.println("Выберите операционную систему:");
                    int start = 2;
                    LinkedHashMap<Integer, Os> oss = new LinkedHashMap<>();
                    for (Product product : store1.getProducts().keySet()) {
                        if (product.getClass().getSimpleName().equals("Os")) {
                            System.out.println(start + ". " + product.getName());
                            oss.put(start ++, (Os)product);
                        }
                    }
                    answer2 = oss.get(Integer.parseInt(System.console().readLine().trim())).getName();
                    System.out.println(store1.getProducts(answer, answer2));
                    break;
                }
                case 4:
                    System.out.println("Выберите цвет");
                    for (int i = 1; i < filterColor.size()+1; i++) {
                        System.out.println(i + ". " + filterColor.get(i));
                    }
                    answer2 = filterColor.get(Integer.parseInt(System.console().readLine().trim()));
                    System.out.println(store1.getProducts(answer, answer2));
                    break;
                
                case 5:
                    program = false;
                    break;
            }
        }
    }

}