package com.jiayuan.decorator;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/10 10:19<br/>
 */
public class BoldDecorator extends NodeDecorator{
    public BoldDecorator(TextNode textNode) {
        super(textNode);
    }

    @Override
    public String getText() {
        return "<b>" + super.getText() + "</b>";
    }
}
