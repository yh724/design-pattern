package com.jiayuan.responseChain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Jy-Jk<br/>
 * @description: <br/>
 * @date: 2025/4/9 16:50<br/>
 */
@Data
@AllArgsConstructor
public class Request {
    private String name;

    private Integer amount;
}
