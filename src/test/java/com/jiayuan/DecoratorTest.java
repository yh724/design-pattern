package com.jiayuan;

import com.jiayuan.decorator.*;
import org.junit.Test;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/10 10:21<br/>
 */
public class DecoratorTest {

    @Test
    public void test() {
        TextNode node = new DivNode();
        node.setText("Hello, design pattern!");
        System.out.println("Origin text: " + node.getText());

        // 单装饰器加强node
        System.out.println("================================");
        TextNode boldNode = new BoldDecorator(node);
        System.out.println(boldNode.getText());

        TextNode underlineNode = new UnderlineDecorator(node);
        System.out.println(underlineNode.getText());

        TextNode delNode = new DelDecorator(node);
        System.out.println(delNode.getText());

        // 多装饰器嵌套加强node
        System.out.println("================================");
        TextNode mixNode = new DelDecorator(new UnderlineDecorator(new BoldDecorator(node)));
        System.out.println(mixNode.getText());
    }
}
