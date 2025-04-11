package com.jiayuan.decorator;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/10 10:20<br/>
 */
public class DelDecorator extends NodeDecorator{
    public DelDecorator(TextNode textNode) {
        super(textNode);
    }

    @Override
    public String getText() {
        return "<del>" + super.getText() + "</del>";
    }
}
