package com.barchenko.patterns.generating.factoryMethod;

public abstract class Dialog {
    public void renderButton() {
        Button button = new HtmlButton();
        button.render();
    }
    public abstract Dialog renderDialog();
}
