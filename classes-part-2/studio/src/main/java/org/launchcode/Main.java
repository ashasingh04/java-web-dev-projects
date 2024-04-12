package org.launchcode;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem item1 = new MenuItem("Lotus Stem Honey Crunch", "Lotus stems cooked with honey and spring onion greens", 11, "Appetizers",true);
        MenuItem item2 = new MenuItem("Chaat Quiche", "A fusion snack at its best – tart shells stuffed with Indian style chaat.", 10, "Appetizers");
        MenuItem item3 = new MenuItem("Crispy Greens with Tofu", "A quick stir-fry of pak choy, snow peas, asparagus, bean sprouts with shallow fried tofu and a few aromatics.", 14, "Main course");
        MenuItem item4 = new MenuItem("Corn Pepper Au Gratin", "Layer of corn and coloured pepper mixture topped with white sauce and processed cheese and baked.", 12, "Main course",true);
        MenuItem item5 = new MenuItem("Jackfruit Ice Cream", "The ripened jackfruits segments can be turned into a delicious icecream.", 12.49, "Desserts",true);
        MenuItem item6 = new MenuItem("Christmas Macaroons", "The eats made during Christmas should be presented well and these macaroons are a classic example of this.", 13.99, "Desserts");
        MenuItem item7 = new MenuItem("Christmas Macaroons", "The eats made during Christmas should be presented well and these macaroons are a classic example of this.", 11.99, "Desserts");
        System.out.println(item1);

        Menu menu = new Menu();
        menu.addMenuItem(item1);
        menu.addMenuItem(item2);
        menu.addMenuItem(item3);
        menu.addMenuItem(item4);
        menu.addMenuItem(item5);
        menu.addMenuItem(item6);

        System.out.println(menu);

        menu.removeMenuItem(item5);
        System.out.println(menu);

        //menu.addMenuItem(item7);
        System.out.println(item6.equals(item1));
        System.out.println(item6.equals(item7));

        menu.addMenuItem(item7);
    }
}
