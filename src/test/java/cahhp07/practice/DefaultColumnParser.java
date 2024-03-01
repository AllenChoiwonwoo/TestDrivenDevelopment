package cahhp07.practice;

public class DefaultColumnParser implements ColumnParser {
    @Override
    public ColumnsIndexInfo getColumnIndex(String[] columns) {
        ColumnsIndexInfo result = new ColumnsIndexInfo();
        result.setDateIndex(1);
        return result;
    }
}
