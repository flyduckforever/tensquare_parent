package entity;/**
 * @author tianshengfei
 * @Date 2019/10/27 16:59
 * @description
 */

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @program: tensquare_parent52
 * @description: 分页返回对象
 * @author: tianshengfei
 * @create: 2019-10-27 16:59
 **/
@Getter@Setter
public class PageResult <T> {
    private Long total;
    private List<T> rows;

    public PageResult() {
    }

    public PageResult(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }


}
