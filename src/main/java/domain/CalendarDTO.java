package domain;

import lombok.Data;


/**
 * @author: raoxing5
 * @date: 2023/06/29
 */
@Data
public class CalendarDTO {
    /**
     * 日期 yyyy-MM-dd
     */
    private String date;
    /**
     * 日期类型 0-节假日 1-工作日 2-小休日 3-休息日
     */
    private Integer dateType;
}
