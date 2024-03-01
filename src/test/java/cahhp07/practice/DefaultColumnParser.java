package cahhp07.practice;

public class DefaultColumnParser implements ColumnParser {
    @Override
    public ColumnsIndexInfo getColumnIndex(String[] columns) {
        ColumnsIndexInfo result = new ColumnsIndexInfo();
        result.setDateIndex(0);
        result.setUnitNameIndex(2);
        result.setUnitIdIndex(4);
        result.setRequestIndex(5);
        result.setImpressionIndex(6);
        result.setClickIndex(7);
        result.setRevenueIndex(8);
        result.setViewablityIndex(9);
        return result;
    }
}
