package com.barchenko.patterns.generating.factoryMethod;

public class HtmlDialog extends Dialog{
    @Override
    public Dialog renderDialog() {
        return new HtmlDialog();
    }
}
