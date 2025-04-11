package com.jiayuan.decorator;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/10 10:12<br/>
 */
public class DivNode implements TextNode {
    private String text;

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return "<div>" + this.text + "</div>";
    }
}
