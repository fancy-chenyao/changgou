package com.changgou.goods.pojo;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 品牌表
 * </p>
 *
 * @author fancy
 * @since 2020-12-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="TbBrand对象", description="品牌表")
public class TbBrand implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "品牌id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "品牌名称")
    private String name;

    @ApiModelProperty(value = "品牌图片地址")
    private String image;

    @ApiModelProperty(value = "品牌的首字母")
    private String letter;

    @ApiModelProperty(value = "排序")
    private Integer seq;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    @ApiModelProperty(value = "创建人工号")
    private String createUserCode;

    @ApiModelProperty(value = "修改时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;

    @ApiModelProperty(value = "修改人工号")
    private String modifiedUserCode;

    @ApiModelProperty(value = "删除时间")
    private Date gmtDeleted;

    @Version
    @ApiModelProperty(value = "乐观锁")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Integer version;

}
