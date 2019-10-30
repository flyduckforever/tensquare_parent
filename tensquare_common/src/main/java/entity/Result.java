package entity;/**
 * @author tianshengfei
 * @Date 2019/10/27 16:49
 * @description
 */

import lombok.Getter;
import lombok.Setter;

/**
 * @program: tensquare_parent52
 * @description: 控制层返回对象
 * @author: tianshengfei
 * @create: 2019-10-27 16:49
 **/
@Getter@Setter
public class Result<T> {
    //是否成功
    private boolean flag;
    //返回码
    private Integer code;
    //返回信息
    private String message;
    //返回数据
    private T data;

    public Result() {
    }

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }



    public Result(boolean flag, Integer code, String message, T data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
