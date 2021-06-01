package domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @description: 退货单sku数量汇总对象
 * @author: haoxiaoming
 * @date: 2019/04/08
 * @Version: V1.0
 */
@Setter
@Getter
public class VReturnSkuNum {

    /**
     * 退货单号
     */
    private Integer roId;
    /**
     * sku种类数
     */
    private Integer totalSkuNum;
    /**
     * units数（实际）
     */
    private Integer totalSkuUnits;
    /**
     * units数（申请）
     */
    private Integer applyTotalSkuUnits;
}
