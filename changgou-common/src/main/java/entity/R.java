package entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: fancy
 * @Description: 统一返回结果的类
 * @Date: Create in 15:49 2020/8/2
 * @Modified By:
 */
// 确保序列化JSON时，如果是null对象，其key也会消失。
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
//@JsonSerialize中的include字段已经弃用
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class R implements Serializable {

    @ApiModelProperty(value = "是否成功")
    private Boolean success;
    @ApiModelProperty(value = "返回码")
    private Integer code;
    @ApiModelProperty(value = "返回消息")
    private String message;
    @ApiModelProperty(value = "返回数据")
    private Map<String,Object> data = new HashMap<>();

    //构造方法私有化（在外面，这个类不能newR对象了）
    private R(){}


    //成功静态方法
    public static R ok(){
        R r = new R();
        r.setSuccess(true);
        r.setCode(ResultCode.SUCCESS);
        r.setMessage("成功");
        return r;
    }

    //失败静态方法
    public static R error(){
        R r = new R();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMessage("失败");
        return r;
    }

    public R success(Boolean success){
        this.setSuccess(success);
        return this;
    }

    public R message(String message){
        this.setMessage(message);
        return this;
    }

    public R code(Integer code){
        this.setCode(code);
        return this;  //this表示当前的对象，谁调用这个方法就代表谁
    }

    public R data(String key,Object value){
        this.data.put(key, value);
        return this;
    }

    public R data(Map<String,Object> map){
        this.setData(map);
        return this;
    }

}
