package domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @description:  退供单信息（页面用）
 * @author: haoxiaoming
 * @date: 2019/04/08
 * @Version: V1.0
 */
@Setter
@Getter
public class ROrderPageDTO {
    /**
     * 任务编号
     */
    private Long taskId;
    /**
     * 退货单号
     */
    private Integer id;
    /**
     * 退货单状态
     */
    private Integer state;
    /**
     * 退货机构
     */
    private Integer dcId;
    /**
     * 机构名称
     */
    private String dcName;
    /**
     * 库房号
     */
    private Integer storeId;
    /**
     * 库房名称
     */
    private String storeName;
    /**
     * 供应商简码
     */
    private String vendorCode;
    /**
     * 供应商名称
     */
    private String vendorName;
    /**
     * 供应商类型
     */
    private Integer vendorType;
    /**
     * 添加时间
     */
    private Date createTime;
    /**
     * 售后地址
     */
    private String receiverAddress;
    /**
     * 邮编
     */
    private String zipCode;
    /**
     * 售后联系人
     */
    private String receiver;
    /**
     * 售后联系人电话
     */
    private String receiverPhone;
    /**
     * 联系人身份证号
     */
    private String receiverId;
    /**
     * 申请退货总金额
     */
    private BigDecimal applyAmount;
    /**
     * 实际退货总金额
     */
    private BigDecimal actualAmount;
    /**
     * 备注
     */
    private String remark;
    /**
     * 运费
     */
    private BigDecimal carriage;
    /**
     * 预约时间/送货时间
     */
    private Date bookingDate;
    /**
     * 运输方式
     */
    private Integer transportType;
    /**
     * 创建人ERP账号
     */
    private String creator;
    /**
     * 创建人姓名
     */
    private String creatorName;
    /**
     * 结算类型
     */
    private Integer settlementType;
    /**
     * 业务来源编号
     */
    private Long rfId;
    /**
     * 退货来源
     */
    private Integer source;
    /**
     * 退货备注
     */
    private String returnNote;
    /**
     * 客户订单编号
     */
    private Long cOrderId;
    /**
     * 结算主体
     */
    private String ouId;
    /**
     * ou名称
     */
    private String ouName;
    /**
     * 退货类型（10：普通，11：EPT，12：残次品，13：海尔退货）
     */
    private Integer orderType;
    /**
     * 合同编号
     */
    private String contractNo;
    /**
     * 销售类型,0：零售；1：分销；2：闪购
     */
    private Integer saleType;
    /**
     * 下传WMS时间
     */
    private Date sendToWmsDate;
    /**
     * 结算部门名称
     */
    private String settleDeptName;
    /**
     * 结算组别名称
     */
    private String settleGroupName;
    /**
     * 财务结算部门编码
     */
    private String settleDeptCode;
    /**
     * 财务结算组别编码
     */
    private String settleGroupCode;
    /**
     * 建单人部门编号
     */
    private String creatorDeptCode;
    /**
     * 建单人组别编号
     */
    private String creatorGroupCode;
    /**
     * 建单人最新组别名称
     */
    private String creatorGroupNameNow;
    /**
     * 销售员账号
     */
    private String salerId;
    /**
     * 销售员姓名
     */
    private String salerName;
    /**
     * 残良品类型,0：良品；1：售后入库；2：拒收入库
     */
    private Integer defectType;
    /**
     * 是否可报废,0：超期不报废；1：超期报废；2：立即报废
     */
    private Integer allowScrapFlag;
    /**
     * 货币类型
     */
    private String currencyType;
    /**
     * 发货时间
     */
    private Date shipmentTime;
    /**
     * 仓类型,0：大仓，1：移动仓
     */
    private Integer storeType;
    /**
     * 是否图书退货单（用于移动仓建单获取站点信息）,0：否；1：是
     */
    private Integer bookOrderFlag;
    /**
     * PAF流程编码
     */
    private String pafProcessId;
    /**
     * 审核意见
     */
    private String auditOpinion;
    /**
     * 是否为EDI单据,0：不是；1：是
     */
    private Integer ediOrderFlag;
    /**
     * 合同是否过期,0：否，1：是
     */
    private Integer contractExpiredFlag;
    /**
     * 虚拟单据类型,10：真实退货；20：少货；21：混货；22：破损；23：其他
     */
    private Integer virtualOrderType;
    /**
     * 药品标识,0：非医药；1：OTC；2：处方药
     */
    private Integer medicalFlag;
    /**
     * SKU种类数
     */
    private Integer skuKindNum;
    /**
     * 超期天数
     */
    private Integer overdueDay;
    /**
     * 大件超期总费用
     */
    private BigDecimal totalOverdueCost;
    /**
     * 大件商品总体积
     */
    private BigDecimal totalVolume;
    /**
     * 退货数量Units（实际）
     */
    private Integer totalSkuUnits;
    /**
     * 最大比差值
     */
    private Double maxDifferRatio;
    /**
     * 供应商邮件发送状态
     */
    private Integer emailVendorFlag;
    /**
     * 采销邮件发送状态
     */
    private Integer emailCreatorFlag;
    /**
     * 结算方式
     */
    private Integer balanceType;
    /**
     * 海尔退货单号
     */
    private String hairReturnOrderId;
    /**
     * 下发edi结果标识,4：下传失败；8：下发库房时下发成功；9：生产完成时下传成功；10：库房取消回传时下传成功
     */
    private Integer pushEdiFlag;
    /**
     * 状态名称
     */
    private String stateStr;
    /**
     * 退货类型名称
     */
    private String orderTypeStr;
    /**
     * 退货来源名称
     */
    private String sourceStr;
    /**
     * 报废类型名称
     */
    private String scrapTypeStr;
    /**
     * 退货数量Units（申请）
     */
    private Integer applyTotalSkuUnits;
    /**
     * 虚仓id
     */
    private Integer virtualStoreId;
    /**
     * 添加时间 前台展示
     */
    private String createTimeStr;
    /**
     * 审核类别
     */
    private Integer auditBizType;
    /**
     * 库房联系人
     */
    private String storeContact;
    /**
     * 库房地址
     */
    private String storeAddr;
    /**
     * 拣货时间
     */
    private Date pickTime;
    /**
     * 结算单号
     */
    private Integer balanceId;
    /**
     * 运输单号
     */
    private String transmitNum;
    /**
     * 销售类型
     */
    private String saleTypeStr;
    /**
     * 邮件发送状态
     */
    private String emailVendorStr;
    /**
     * 取货时间-用于前端展示
     */
    private String bookingDateStr;
    /**
     * 运输方式-用于前端展示
     */
    private String transportTypeStr;
    /**
     * 下传时间-用于前端展示
     */
    private String sendToWmsDateStr;
    /**
     * 真实虚拟退货-用于前端展示
     */
    private String virtualOrderTypeStr;
    /**
     * 是否以销定结
     */
    private String settlementTypeStr;
    /**
     * 是否可报废
     */
    private String allowScrapFlagStr;
    /**
     * 是否有逻辑批次信息
     */
    private boolean hasLogicalBatch = false;
    /**
     * 是否能驳回新订单
     */
    private boolean rejectNew;
    /**
     * 结算名称
     */
    private String balanceTypeStr;
    /**
     * 库房联系人
     */
    private String StockLinkMan;

    /**
     * 库房联系人地址
     */
    private String StockLinkAddress;
    /**
     * 商品编号
     */
    private Long skuId;
    /**
     * 商品名称
     */
    private String skuName;
    /**
     * 退货单价
     */
    private BigDecimal returnPrice;
    /**
     * 退货数量
     */
    private Integer applyNum;
    /**
     * 锁库存数量
     */
    private Integer lockNum;
    /**
     * 实退数量
     */
    private Integer actualNum;
    /**
     * 市场定价
     */
    private BigDecimal marketPrice;
    /**
     * 特殊编码，当前只有图书ISBN
     */
    private String specNo;
    /**
     * 海尔商品机身编码
     */
    private String wareCode;
    /**
     * 系统缺量
     */
    private Integer locateShortageNum;
    /**
     * 商品破损
     */
    private Integer brokenNum;
    /**
     * 商品混货
     */
    private Integer mixNum;
    /**
     * 商品少货
     */
    private Integer lostNum;
    /**
     * 建单人部门名称
     */
    private String creatorDeptName;
    /**
     * 业务单号
     */
    private String bizOrderId;
    /**
     * 行业编号
     */
    private Integer industryId;
    /**
     * 退货模式
     */
    private Integer returnMode;
    /**
     * 出库复核员
     */
    private String reChecker;
    /**
     * 行业描述
     */
    private String industryDesc;
    /**
     * 退货模式描述
     */
    private String returnModeDesc;
    /**
     * 原始供应商简码
     */
    private String beforeVendor;
    /**
     * 库房联系电话
     */
    private String storeContactTel;

    /**
     * 删单原因类型
     */
    private Integer deleteType;
    /**
     * 删除原因
     */
    private String deleteTypeStr;
    /**
     * 最大提货日期，即报废日期，供应商应该在此日期之前提货，发邮件通知供应商时使用
     */
    private Integer maxDeliveryDay;
    /**
     * 最大提货日期 月
     */
    private Integer maxDeliveryMonth;
    /**
     * 建单人email地址
     */
    private String creatorEmailAddress;
    /**
     * 销售员email地址
     */
    private String salerEmailAddress;
    /**
     * sku种类数
     */
    private Integer totalSkuNum;
    /**
     * 是否采控建单,0：否，1：是
     */
    private Integer purchaseControlFlag;
    /**
     * 折扣
     */
    private BigDecimal discount;
    /**
     * 参考价
     */
    private BigDecimal refPrice;
    /**
     * 码洋
     */
    private BigDecimal fixedPrice;
    /**
     * 实洋
     */
    private BigDecimal discountPrice;
    /**
     * 供应商电子邮件
     */
    private String vendorEmail;
    /**
     * 供应商电子邮件2
     */
    private String vendorEmail2;
    /**
     * 供应商电子邮件3
     */
    private String vendorEmail3;
    /**
     * 建单人二级部门名称
     */
    private String creatorGroupName;
}
