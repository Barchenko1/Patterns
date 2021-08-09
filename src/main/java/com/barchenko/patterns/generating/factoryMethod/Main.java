package com.barchenko.patterns.generating.factoryMethod;

public class Main {
    public static void main(String[] args) {
        Dialog dialog = new HtmlDialog();
        dialog.renderButton();
        System.out.println(dialog.renderDialog());
    }
}
