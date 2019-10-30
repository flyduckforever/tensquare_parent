package com.tensquare.base.pojo;/**
 * @author tianshengfei
 * @Date 2019/10/28 10:43
 * @description
 */

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @program: tensquare_parent52
 * @description: 标签实体类
 * @author: tianshengfei
 * @create: 2019-10-28 10:43
 **/
@Entity
@Data
@Table(name = "tb_label")
public class Label {

    @Id
    private String id;
    //标签名称
    private String labelName;
    //状态
    private String state;
    //使用数量
    private Long count;
    //关注数
    private Long fans;
    //是否推荐
    private String recommend;

}
