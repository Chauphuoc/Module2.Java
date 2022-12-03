package FeatureApp;

public class BannerApp {
    public void menuBanner (String option){
        if (option.equals("Main-Menu")){
            System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                                WELCOME MENU                                                     ║");
            System.out.println("║                         【1】ADD PRODUCT                         【4】SEARCH PRODUCT                              ║");
            System.out.println("║                         【2】EDIT PRODUCT                        【5】SORT PRODUCT                                ║");
            System.out.println("║                         【3】REMOVE PRODUCT                      【6】PRINTING LIST PRODUCT                       ║");
            System.out.println("║                         【0】EXIT                                           ║");
            System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
            System.out.print("■ Select:");
        }
        if (option.equals("Sort-Product-Menu")){
            System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                                SORTING PRODUCT                                                     ║");
            System.out.println("║                         【1】SORTING PRODUCT BY PRICE             【2】SORT PRODUCT BY NAME                              ║");
            System.out.println("║                         【3】SORTING PRODUCT BY QUANTITY                                                                                   ║");
            System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
            System.out.print("■ Select:");
        }
        if (option.equals("Searching-Product")){
            System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                                SEARCHING PRODUCT                                                     ║");
            System.out.println("║                         【1】SEARCHING PRODUCT BY ID             【2】SEARCHING PRODUCT BY NAME                              ║");
            System.out.println("║                         【0】EXIT                                                                                   ║");
            System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
            System.out.print("■ Select:");
        }
        if (option.equals("Product-Service")){
            System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                                ADD PRODUCT MENU                                                     ║");
            System.out.println("║                         【1】ADD ID PRODUCT                          【4】ADD QUANTITY PRODUCT                              ║");
            System.out.println("║                         【2】ADD NAME PRODUCT                        【5】ADD ID CATEGORY                                ║");
            System.out.println("║                         【3】ADD PRICE PRODUCT                       【R】RETURN                                  ║");
            System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
            System.out.print("■ Select:");
        }
        if (option.equals("Update-product")){
            System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                                EDIT PRODUCT MENU                                                     ║");
            System.out.println("║                         【1】EDIT NAME PRODUCT                          【3】EDIT PRICE PRODUCT                              ║");
            System.out.println("║                         【2】EDIT QUANTITY PRODUCT                       【0】RETURN                                  ║");
            System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
            System.out.print("■ Select:");
        }
        if (option.equals("Sort-by-price")){
            System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                                SORTING PRODUCT BY PRICE                                                    ║");
            System.out.println("║                         【1】Increasing                          【2】Decreasing                   ║");
            System.out.println("║                         【R】Return                                                         ║");
            System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
            System.out.print("■ Select:");
        }
        if (option.equals("Sort-by-name")){
            System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                                SORTING PRODUCT BY NAME                                                    ║");
            System.out.println("║                         【1】Increasing                          【2】Decreasing                   ║");
            System.out.println("║                         【R】Return                                                         ║");
            System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
            System.out.print("■ Select:");
        }
        if (option.equals("Sort-by-quantity")){
            System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                                SORTING PRODUCT BY QUANTITY                                                    ║");
            System.out.println("║                         【1】Increasing                                【2】Decreasing                   ║");
            System.out.println("║                         【R】Return                                                         ║");
            System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
            System.out.print("■ Select:");
        }
    }
}
