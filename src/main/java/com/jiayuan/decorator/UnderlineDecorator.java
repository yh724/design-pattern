package com.jiayuan.decorator;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/10 10:17<br/>
 */
public class UnderlineDecorator extends NodeDecorator{

    public UnderlineDecorator(TextNode textNode) {
        super(textNode);
    }

    @Override
    public String getText() {
        return "<u>" + super.getText() + "</u>";
    }

    @Override
    public void setText(String text) {
        super.setText(text);
    }
}
