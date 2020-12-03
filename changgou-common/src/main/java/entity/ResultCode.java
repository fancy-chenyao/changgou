package entity;

/**
 * @Author: fancy
 * @Description: 状态码常量类
 * @Date: Create in 16:36 2020/8/29
 * @Modified By:
 */
public interface ResultCode {

    Integer SUCCESS = 200; //成功
    Integer ERROR = 201;//失败

    Integer EmptyParam = 300; //参数带空

    Integer SERVERERROR= 500; //服务器错误
    Integer UNAUTHORIZED = 502; //未授权错误
}
