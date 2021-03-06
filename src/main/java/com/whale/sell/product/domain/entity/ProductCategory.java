package com.whale.sell.product.domain.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @ClassName ProductCategory
 * @Description 商品类目
 * @Author like
 * @Data 2019/3/7 17:35
 * @Version 1.0
 **/
@Entity
@DynamicUpdate
@Data
@ToString
public class ProductCategory {

    /**
     * 类目id.
     **/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    /**
     * 类目名.
     **/
    private String categoryName;

    /**
     * 类目编号.
     **/
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

}
