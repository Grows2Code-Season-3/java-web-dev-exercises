package org.launchcode.studios.restaurant;

public class Restaurant {

    public static void main(String[] args) {

        MenuItem pizza = new MenuItem(15, "Classic margherita", "Entrees");
        MenuItem pasta = new MenuItem(12, "Angel hair with cream sauce", "Entrees");
        MenuItem salad = new MenuItem(7, "Appetizer-sized salad", "Apps");
        MenuItem mozz = new MenuItem(10, "Mozzarella sticks w/ red sauce", "Apps");
        mozz.setNew(false);

        MenuItem mozzNew = new MenuItem(10.5, "Mozzarella sticks w/ red sauce", "Apps");

        Menu italianMenu = new Menu();
        italianMenu.addItem(pizza);
        italianMenu.addItem(pasta);
        italianMenu.addItem(salad);
        italianMenu.addItem(mozz);

        System.out.println(italianMenu);


        System.out.println(mozz.equals(mozzNew));

    }

}
