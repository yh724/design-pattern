package com.jiayuan.decorator;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/10 10:14<br/>
 */
public abstract class NodeDecorator implements TextNode {

    private final TextNode textNode;

    public NodeDecorator(TextNode textNode) {
        this.textNode = textNode;
    }

    @Override
    public String getText() {
        return textNode.getText();
    }

    @Override
    public void setText(String text) {
        textNode.setText(text);
    }
}
