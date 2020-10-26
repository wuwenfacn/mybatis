package com.fa.entity;

import java.io.Serializable;
import java.util.Date;

/*create table cate(
        c_id int(20) auto_increment primary key comment '主键id',
        c_name varchar(20) unique not null comment '分类名称',
        c_date timestamp not null comment '创建时间',
        c_is_delete int(2) default 1 comment '1表示未删除，0表示已删除'
        );*/

public class Cate implements Serializable {
    /**
     * 主键id
     */
    private Integer cId;

    /**
     * 分类名称
     */
    private String cName;

    /**
     * 创建时间
     */
    private Date cDate;

    /**
     * 1表示未删除，0表示已删除
     */
    private Integer cIsDelete;

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Date getcDate() {
        return cDate;
    }

    public void setcDate(Date cDate) {
        this.cDate = cDate;
    }

    public Integer getcIsDelete() {
        return cIsDelete;
    }

    public void setcIsDelete(Integer cIsDelete) {
        this.cIsDelete = cIsDelete;
    }
}

