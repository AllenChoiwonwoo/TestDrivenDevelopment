package cahhp07.practice;

public class DefaultColumnParser implements ColumnParser {
    @Override
    public ColumnsIndexInfo getColumnIndex(String columnString) {
        String[] columns = columnString.split(",");

        ColumnsIndexInfo result = new ColumnsIndexInfo();
        for (int i = 0; i < columns.length ; i++) {
            switch (columns[i]) {
                case "Dimension.DATE": result.setDateIndex(i);
                    break;
                case "Column.TOTAL_AD_REQUESTS": result.setRequestIndex(i);
                    break;
                case "Column.TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS": result.setImpressionIndex(i);
                    break;
                case "Column.TOTAL_LINE_ITEM_LEVEL_CLICKS": result.setClickIndex(i);
                    break;
                case "Column.TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE": result.setRevenueIndex(i);
                    break;
                case "Column.TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE": result.setViewablityIndex(i);
                    break;
            }
        }
        result.setUnitIdIndex((result.getRequestIndex()-1));
        result.setUnitNameIndex(result.getUnitIdIndex()/2);
        return result;
    }
}
