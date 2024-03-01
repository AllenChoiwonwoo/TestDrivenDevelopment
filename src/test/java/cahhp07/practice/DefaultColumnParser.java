package cahhp07.practice;

public class DefaultColumnParser implements ColumnParser {
    @Override
    public ColumnsIndexInfo getColumnIndex(String columnString) {
        String[] columns = columnString.split(",");

//     Dimension.DATE,Ad unit 1,Ad unit 2,Ad unit ID 1,Ad unit ID 2,Column.TOTAL_AD_REQUESTS,Column.TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS,Column.TOTAL_LINE_ITEM_LEVEL_CLICKS,Column.TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE,Column.TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE";
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
        result.setUnitNameIndex(2);
        result.setUnitIdIndex(4);
        return result;
    }
}
