package com.fa.entity;

import java.io.Serializable;

/*create table product(
        p_id int(20) auto_increment primary key comment '主键id',
        p_title varchar(20) unique not null comment '商品的标题',
        p_content varchar(255) not null comment '详细信息',
        p_img varchar(255) not null comment '商品的图片',
        p_price decimal not null comment '商品的价格',
        p_is_delete int(2) default 1 comment '1表示未删除，0表示已删除',
        c_id int(20) comment 'cate表的外键',
        foreign key (c_id) references cate(c_id)
        );*/

public class Product implements Serializable {
    /**
     * 主键id
     */
    private Integer pId;

    /**
     * 商品的标题
     */
    private String pTitle;

    /**
     * 详细信息
     */
    private String pContent;

    /**
     * 商品的图片
     */
    private String pImg;

    /**
     * 商品的价格
     */
    private Long pPrice;

    /**
     * 1表示未删除，0表示已删除
     */
    private Integer pIsDelete;

    /**
     * cate表的外键
     */
    private Integer cId;

    private static final long serialVersionUID = 1L;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpTitle() {
        return pTitle;
    }

    public void setpTitle(String pTitle) {
        this.pTitle = pTitle;
    }

    public String getpContent() {
        return pContent;
    }

    public void setpContent(String pContent) {
        this.pContent = pContent;
    }

    public String getpImg() {
        return pImg;
    }

    public void setpImg(String pImg) {
        this.pImg = pImg;
    }

    public Long getpPrice() {
        return pPrice;
    }

    public void setpPrice(Long pPrice) {
        this.pPrice = pPrice;
    }

    public Integer getpIsDelete() {
        return pIsDelete;
    }

    public void setpIsDelete(Integer pIsDelete) {
        this.pIsDelete = pIsDelete;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }
}

