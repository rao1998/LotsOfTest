package poi;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.util.*;

public class TestPoi1 {
    public static void main(String[] args) throws Exception {
        aaaa();
    }

    public static WebResponse<List<ThroughputVo>> aaaa() throws Exception {
        HashMap<String, Long> map = new HashMap<String, Long>();
//        根据url下载资源  解析
//        String[] split = url.split("/", 2);
//        InputStream inputStream = JdStorageService.getInstance().downLoadFile(split[0], split[1]);
        Workbook workbook = WorkbookFactory.create(new FileInputStream("E:\\test.xlsx"));
        Sheet sheet = workbook.getSheetAt(0);
        if (sheet == null) {
            throw new Exception("第一个sheet页不能为空");
        }

        Row row = sheet.getRow(0);
        if (row == null) {
            throw new Exception("首行不能为空");
        }
        //判断第一行的第一个和第二个格子是不是  原始链接（必填）  关联项目ID（选填）
        Cell cell1 = row.getCell(0);
        Cell cell2 = row.getCell(1);

        if (cell1 == null || cell2 == null) {
            return new WebResponse<List<ThroughputVo>>(-1, "第一行不能为空", false);
        }
        if (CellType.STRING != cell1.getCellTypeEnum() || CellType.STRING != cell2.getCellTypeEnum()) {
            return new WebResponse<List<ThroughputVo>>(-1, "第一行必须为文本类型", false);
        }
        if (!"原始链接（必填）".equals(cell1.getStringCellValue())) {
            return new WebResponse<List<ThroughputVo>>(-1, "第一行第一列必须为原始链接（必填）", false);
        }
        if (!"关联项目ID（选填）".equals(cell2.getStringCellValue())) {
            return new WebResponse<List<ThroughputVo>>(-1, "第一行第二列必须为关联项目ID（选填）", false);
        }

        Iterator<Row> rowIterator = sheet.rowIterator();
        while (rowIterator.hasNext()) {
            Row nextRow = rowIterator.next();
            System.out.println(nextRow.getRowNum());
            if (nextRow.getRowNum() == 0) {
                continue;
            }
            /*//从第二行开始判断
            if (nextRow.getCell(0) == null) {
                return new WebResponse<List<ThroughputVo>>(-1, "原始链接不能为空", false);
            }
            if ("".equals(nextRow.getCell(0)) && null == nextRow.getCell(1)) {
                continue;
            }
            if ("".equals(nextRow.getCell(0)) && "".equals(nextRow.getCell(1))) {
                continue;
            }
            if ("".equals(nextRow.getCell(0)) && null != nextRow.getCell(1)) {
                return new WebResponse<List<ThroughputVo>>(-1, "原始链接不能为空", false);
            }*/
            //从第二行开始判断

            if (null == nextRow.getCell(0)) {
                if (null != nextRow.getCell(1)) {
                    return new WebResponse<List<ThroughputVo>>(-1, "原始链接不能为空", false);
                } else {
                    continue;
                }
            }

            if ("".equals(nextRow.getCell(0).toString().trim())) {
                if (null == nextRow.getCell(1) || "".equals(nextRow.getCell(1).toString().trim())) {
                    continue;
                } else {
                    return new WebResponse<List<ThroughputVo>>(-1, "原始链接不能为空", false);
                }
            }

            if (!CellType.STRING.equals(nextRow.getCell(0).getCellTypeEnum())) {
                return new WebResponse<List<ThroughputVo>>(-1, "原始链接必须填且为文本类型", false);
            }


//            if (!CellType.BLANK.equals(nextRow.getCell(1).getCellTypeEnum())) {
            if (nextRow.getCell(1) != null) {
                //填了关联项目ID
                if (!CellType.NUMERIC.equals(nextRow.getCell(1).getCellTypeEnum())) {
                    //不是数字类型
                    return new WebResponse<List<ThroughputVo>>(-1, "关联项目ID必须为数字类型", false);
                }
                //是数字类型  加到map里面去
                map.put(nextRow.getCell(0).getStringCellValue(), (long) nextRow.getCell(1).getNumericCellValue());
            } else {
                //没填关联项目ID   直接把原始链接放进map
                map.put(nextRow.getCell(0).getStringCellValue(), null);
            }
        }
        for (Map.Entry<String, Long> stringLongEntry : map.entrySet()) {
            System.out.println(stringLongEntry.getKey() + "===" + stringLongEntry.getValue());
        }
        return null;

    }
}
