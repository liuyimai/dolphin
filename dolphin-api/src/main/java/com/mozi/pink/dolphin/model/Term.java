package com.mozi.pink.dolphin.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: liuyimai
 * @Date: 2021/1/30/0030 20:23
 * @Desc:
 */
@Data
public class Term implements Serializable {

    private Integer id;

    private String name;

    private String shortname;

    private String isvalid;

    private Integer gradeid;

    private Integer gradeCode;

    private Byte termNum;

    private Byte isFree;

    private String remarks;

    @Override
    public String toString() {
        return "Term{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shortname='" + shortname + '\'' +
                ", isvalid='" + isvalid + '\'' +
                ", gradeid=" + gradeid +
                ", gradeCode=" + gradeCode +
                ", termNum=" + termNum +
                ", isFree=" + isFree +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
