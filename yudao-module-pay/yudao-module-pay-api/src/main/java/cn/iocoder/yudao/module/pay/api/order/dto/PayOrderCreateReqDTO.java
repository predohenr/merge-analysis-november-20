package cn.iocoder.yudao.module.pay.api.order.dto;

import cn.iocoder.yudao.framework.common.enums.UserTypeEnum;
import cn.iocoder.yudao.framework.common.validation.InEnum;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 支付单创建 Request DTO
 */
@Data
public class PayOrderCreateReqDTO implements Serializable {

    public static final int SUBJECT_MAX_LENGTH = 32;
    @NotNull(message = "应用标识不能为空")
    private String appKey;
    @NotEmpty(message = "用户 IP 不能为空")
    private String userIp;
    private Long userId;
    @InEnum(UserTypeEnum.class)
    private Integer userType;
    @NotEmpty(message = "商户订单编号不能为空")
    private String merchantOrderId;
    @NotEmpty(message = "商品标题不能为空")
    @Length(max = SUBJECT_MAX_LENGTH, message = "商品标题不能超过 32")
    private String subject;
    @Length(max = 128, message = "商品描述信息长度不能超过128")
    private String body;
    @NotNull(message = "支付金额不能为空")
    @DecimalMin(value = "0", inclusive = false, message = "支付金额必须大于零")
    private Integer price;
    @NotNull(message = "支付过期时间不能为空")
    private LocalDateTime expireTime;

    /**
     * 应用标识
     */

    /**
     * 用户 IP
     */

    /**
     * 用户编号
     */
    /**
     * 用户类型
     */

    // ========== 商户相关字段 ==========

    /**
     * 商户订单编号
     */
    /**
     * 商品标题
     */
    /**
     * 商品描述
     */

    // ========== 订单相关字段 ==========

    /**
     * 支付金额，单位：分
     */

    /**
     * 支付过期时间
     */

}
