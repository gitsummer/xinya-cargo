package com.cargo.entity;

import com.commom.supper.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 运单表
 * </p>
 *
 * @author jobob
 * @since 2020-10-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WaybillEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 运单id
     */
    @ApiModelProperty("")
    private String waybillId;

    /**
     * 运单号
     */
    @ApiModelProperty("运单号")
    private String waybillNo;

    /**
     * 订单号
     */
    @ApiModelProperty("订单号")
    private String orderNo;

    /**
     * 订单ID
     */
    @ApiModelProperty("订单ID")
    private String orderId;

    /**
     * 发货公司id
     */
    @ApiModelProperty("发货公司id")
    private String consignmentOrgId;

    /**
     * 发货公司名称
     */
    @ApiModelProperty("发货公司名称")
    private String consignmentOrgName;

    /**
     * 承运商是否接单确认（0:未确认,1:已确认）
     */
    @ApiModelProperty("承运商是否接单确认（0:未确认,1:已确认）")
    private Integer isConfirm;

    /**
     * 车辆id
     */
    @ApiModelProperty("车辆id")
    private String carId;

    /**
     * 车牌号
     */
    @ApiModelProperty("车牌号")
    private String carNo;

    /**
     * 车挂id
     */
    @ApiModelProperty("车挂id")
    private String hangId;

    /**
     * 车挂号
     */
    @ApiModelProperty("车挂号")
    private String hangNo;

    /**
     * 司机id
     */
    @ApiModelProperty("司机id")
    private String driverId;

    /**
     * 司机姓名
     */
    @ApiModelProperty("司机姓名")
    private String driverName;

    /**
     * 司机手机号
     */
    @ApiModelProperty("司机手机号")
    private String driverPhoneNo;

    /**
     * 运单类型（0:省际，1：城际，2：同城）
     */
    @ApiModelProperty("运单类型（0:省际，1：城际，2：同城）")
    private Integer waybillType;

    /**
     * 运单状态（0:待发车,2:已取消,10:提货中,20:待装货,25:装货中,30:待送货,40:送货中,45:待卸货,50:卸货中,60:已签收,）
     */
    @ApiModelProperty("运单状态（0:待发车,2:已取消,10:提货中,20:待装货,25:装货中,30:待送货,40:送货中,45:待卸货,50:卸货中,60:已签收,）")
    private Integer waybillStatus;

    /**
     * 是否预约（0未预约，1已预约）
     */
    @ApiModelProperty("是否预约（0未预约，1已预约）")
    private Integer isBooking;

    /**
     * 公司ID
     */
    @ApiModelProperty("公司ID")
    private String orgId;

    /**
     * 运单总体积
     */
    @ApiModelProperty("运单总体积")
    private BigDecimal totalVolume;

    /**
     * 运单总重量
     */
    @ApiModelProperty("运单总重量")
    private BigDecimal totalWeight;

    /**
     * 运输类型(1:普货,2:冷链,4:危化,3:集装箱)
     */
    @ApiModelProperty("运输类型(1:普货,2:冷链,4:危化,3:集装箱)")
    private Integer transType;

    /**
     * 运输方式 1：整车，2：零担
     */
    @ApiModelProperty("运输方式 1：整车，2：零担")
    private Integer transMode;

    /**
     * 发货-区域ID 省ID
     */
    @ApiModelProperty("发货-省ID")
    private String senderAreaProvinceId;
    @ApiModelProperty("发货")
    private String senderAreaProvinceName;

    /**
     * 发货-区域ID 市ID
     */
    @ApiModelProperty("发货-区域ID 市ID")
    private String senderAreaCityId;
    @ApiModelProperty("发货-区域")
    private String senderAreaCityName;

    /**
     * 发货-区域ID 县ID
     */
    @ApiModelProperty("发货-区域ID 县ID")
    private String senderAreaCountyId;
    @ApiModelProperty("发货-区域")
    private String senderAreaCountyName;

    /**
     * 发货-区域ID 镇ID
     */
    @ApiModelProperty("发货-区域ID 镇ID")
    private String senderAreaTownId;
    @ApiModelProperty("发货-区域ID 镇ID")
    private String senderAreaTownName;

    /**
     * 发货省经纬度
     */
    @ApiModelProperty("发货经纬度")
    private String senderProcityName;

    /**
     * 装货详细地址
     */
    @ApiModelProperty("装货详细地址")
    private String senderAreaDetail;

    /**
     * 发货人
     */
    @ApiModelProperty("发货人")
    private String senderUserName;

    /**
     * 发货人电话
     */
    @ApiModelProperty("发货人电话")
    private String senderPhone;

    /**
     * 提货现场联系人
     */
    @ApiModelProperty("提货现场联系人")
    private String senderSceneMan;

    /**
     * 提货现场联系方式
     */
    @ApiModelProperty("提货现场联系方式")
    private String senderSceneManPhone;

    /**
     * 装货开始时间
     */
    @ApiModelProperty("装货开始时间")
    private LocalDateTime senderStartTime;

    /**
     * 装货结束时间
     */
    @ApiModelProperty("装货结束时间")
    private LocalDateTime senderEndTime;

    /**
     * 收货-区域ID 省ID
     */
    @ApiModelProperty("收货-区域ID 省ID")
    private String deliveryAreaProvinceId;

    /**
     * 收货-区域ID 省名称
     */
    @ApiModelProperty("收货-区域ID 省名称")
    private String deliveryAreaProvinceName;

    /**
     * 收货-区域ID 市ID
     */
    @ApiModelProperty("收货-区域ID 市ID")
    private String deliveryAreaCityId;

    /**
     * 收货-区域ID 市名称
     */
    @ApiModelProperty(" 收货-区域ID 市名称")
    private String deliveryAreaCityName;

    /**
     * 收货-区域ID 县ID
     */
    @ApiModelProperty("收货-区域ID 县ID")
    private String deliveryAreaCountyId;

    /**
     * 收货-区域ID 县名称
     */
    @ApiModelProperty("收货-区域ID 县名称")
    private String deliveryAreaCountyName;

    /**
     * 收货-区域ID 镇ID
     */
    @ApiModelProperty("收货-区域ID 镇ID")
    private String deliveryAreaTownId;

    /**
     * 收货-区域ID 镇名称
     */
    @ApiModelProperty("收货-区域ID 镇名称")
    private String deliveryAreaTownName;

    /**
     * 卸货经纬度
     */
    @ApiModelProperty("卸货经纬度")
    private String deliveryProcityName;

    /**
     * 收货详细地址
     */
    @ApiModelProperty("收货详细地址")
    private String deliveryAreaDetail;

    /**
     * 收件人
     */
    @ApiModelProperty("收件人")
    private String deliveryUserName;

    /**
     * 收件人电话
     */
    @ApiModelProperty("收件人电话")
    private String deliveryPhone;

    /**
     * 收货现场联系人
     */
    @ApiModelProperty("收货现场联系人")
    private String deliverySceneMan;

    /**
     * 收货现场联系方式
     */
    @ApiModelProperty("收货现场联系方式")
    private String deliverySceneManPhone;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String comments;

    /**
     * 取消原因
     */
    @ApiModelProperty("备取消原因注")
    private String cancelComments;

    /**
     * 拒绝原因
     */
    @ApiModelProperty("拒绝原因")
    private String refuseComments;

    /**
     * 运单是否回单，0未回单，1已回单
     */
    @ApiModelProperty("运单是否回单，0未回单，1已回单")
    private Integer isBackWill;

    /**
     * 提货毛重（单位：吨）
     */
    @ApiModelProperty("提货毛重（单位：吨）")
    private BigDecimal deliRoughWeight;

    /**
     * 提货皮重（单位：吨）
     */
    @ApiModelProperty("提货皮重（单位：吨）")
    private BigDecimal deliTareWeight;

    /**
     * 提货净重（单位：吨）
     */
    @ApiModelProperty("提货净重（单位：吨）")
    private BigDecimal deliNetWeight;

    /**
     * 卸货毛重（单位：吨）
     */
    @ApiModelProperty("卸货毛重（单位：吨）")
    private BigDecimal unloadRoughWeight;

    /**
     * 卸货皮重（单位：吨）
     */
    @ApiModelProperty("卸货皮重（单位：吨）")
    private BigDecimal unloadTareWeight;

    /**
     * 卸货净重（单位：吨）
     */
    @ApiModelProperty("卸货净重（单位：吨）")
    private BigDecimal unloadNetWeight;

    /**
     * 提货位置
     */
    @ApiModelProperty("提货位置")
    private String startLocation;

    /**
     * 出发时间
     */
    @ApiModelProperty("出发时间")
    private LocalDateTime startTime;

    /**
     * 业务类型：1-车船直取 2-进罐/入仓
     */
    @ApiModelProperty("业务类型：1-车船直取 2-进罐/入仓")
    private Integer businessType;

    /**
     * 异常标识（0:无异常，1:有异常,2 异常关闭）
     */
    @ApiModelProperty("异常标识（0:无异常，1:有异常,2 异常关闭）")
    private Integer exceptFlag;

    @ApiModelProperty("预计到达时间")
    private LocalDateTime estimatedTime;

    @ApiModelProperty("实际到达时间")
    private LocalDateTime actualTime;

    @ApiModelProperty("实际卸货时间")
    private LocalDateTime unloadingTime;


    @ApiModelProperty("预计发车时间")
    private String estimatTime;

    @ApiModelProperty("实际发车时间")
    private String actTime;

    @ApiModelProperty("发货区域代码")
    private String senderAreaAdcode;

    @ApiModelProperty("收货区域代码")
    private String deliveryAreaAdcode;

    /**
     * 创建人
     */
    private String createUserId;

    /**
     * 创建人
     */
    private String createUserName;


}
