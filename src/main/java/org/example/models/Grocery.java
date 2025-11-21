package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Grocery {
    public static List<String> groceryList = new ArrayList<>();


    public static boolean checkItemIsInList(String product){
        return groceryList.contains(product);//hocam kesin chat gpt kullandi diyeceksiniz bu kisma o yuzden simdiden mesajimi vereyim kullanmadim:}
    }

    public static void addItems(String input){
        if (!checkItemIsInList(input)) groceryList.add(input);//ve evet buradada
    }

    public static void removeItems(String input){
        if (checkItemIsInList(input)) groceryList.remove(input);//:}
    }

    public static void printSorted() {
        Collections.sort(groceryList);
        System.out.println(groceryList);
    }

    //scanner methodunu tam bilmedigimden yardim aldim ;(
    public static void startGrocery() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Grocery Uygulaması ===");
            System.out.println("0 - Çıkış");
            System.out.println("1 - Ürün ekle");
            System.out.println("2 - Ürün çıkar");
            System.out.print("Seçiminiz: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Uygulama sonlandırılıyor...");
                    break;
                case 1:
                    System.out.print("Eklemek istediğiniz ürünleri girin. ");
                    String addInput = scanner.nextLine();
                    String[] addItems = addInput.split(",");
                    for (String item : addItems) {
                        item = item.trim();
                        addItems(item);
                    }
                    printSorted();
                    break;
                case 2:
                    System.out.print("Çıkarmak istediğiniz ürünleri girin.");
                    String removeInput = scanner.nextLine();
                    String[] removeItems = removeInput.split(",");
                    for (String item : removeItems) {
                        item = item.trim();
                        removeItems(item);
                    }
                    printSorted();
                    break;
                default:
                    System.out.println("Geçersiz seçim, tekrar deneyin.");
            }

        } while (choice != 0);

        scanner.close();
    }


}
