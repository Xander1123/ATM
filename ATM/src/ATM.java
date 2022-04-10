/*
 * Copyright (c) 2022.
 *
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 * intellij no copyright generate
 */

import java.io.IOException;

public class ATM {
    public static void main(String[] args) throws IOException {
        OptionMenu optionMenu = new OptionMenu();

        introduction();
       optionMenu.mainMenu();
    }

    private static void introduction() {
        System.out.println("Welcome to The ATM Project!");
    }


}