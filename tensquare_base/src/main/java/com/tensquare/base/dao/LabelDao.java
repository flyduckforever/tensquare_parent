package com.tensquare.base.dao;/**
 * @author tianshengfei
 * @Date 2019/10/28 11:15
 * @description
 */

import com.tensquare.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @program: tensquare_parent52
 * @description: 标签数据访问接口
 * @author: tianshengfei
 * @create: 2019-10-28 11:15
 **/
@Repository
public interface LabelDao extends JpaRepository<Label,String>, JpaSpecificationExecutor<Label> {
}
