package com.lx.lyn.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 刘怡男
 * @version 2020/7/16 - 16:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    private Integer id;
    private String productName;
    private Integer productNum;
    private Double productPrice;
}
