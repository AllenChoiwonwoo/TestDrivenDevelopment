package cahhp07.practice;

public class ColumnsIndexInfo {
//    String defaultColumns = "Dimension.DATE,Ad unit 1,Ad unit 2,Ad unit ID 1,Ad unit ID 2,Column.TOTAL_AD_REQUESTS,Column.TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS,Column.TOTAL_LINE_ITEM_LEVEL_CLICKS,Column.TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE,Column.TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE";
    private int dateIndex;
    private int unitNameIndex;
    private int unitIdIndex;
    private int requestIndex;
    private int impressionIndex;
    private int clickIndex;
    private int revenueIndex;
    private int viewablityIndex;

    @Override
    public String toString() {
        return "ColumnsIndexInfo{" +
                "dateIndex=" + dateIndex +
                ", unitNameIndex=" + unitNameIndex +
                ", unitIdIndex=" + unitIdIndex +
                ", requestIndex=" + requestIndex +
                ", impressionIndex=" + impressionIndex +
                ", clickIndex=" + clickIndex +
                ", revenueIndex=" + revenueIndex +
                ", viewablityIndex=" + viewablityIndex +
                '}';
    }

    public int getDateIndex() {
        return dateIndex;
    }

    public void setDateIndex(int dateIndex) {
        this.dateIndex = dateIndex;
    }

    public int getUnitNameIndex() {
        return unitNameIndex;
    }

    public void setUnitNameIndex(int unitNameIndex) {
        this.unitNameIndex = unitNameIndex;
    }

    public int getUnitIdIndex() {
        return unitIdIndex;
    }

    public void setUnitIdIndex(int unitIdIndex) {
        this.unitIdIndex = unitIdIndex;
    }

    public int getRequestIndex() {
        return requestIndex;
    }

    public void setRequestIndex(int requestIndex) {
        this.requestIndex = requestIndex;
    }

    public int getImpressionIndex() {
        return impressionIndex;
    }

    public void setImpressionIndex(int impressionIndex) {
        this.impressionIndex = impressionIndex;
    }

    public int getClickIndex() {
        return clickIndex;
    }

    public void setClickIndex(int clickIndex) {
        this.clickIndex = clickIndex;
    }

    public int getRevenueIndex() {
        return revenueIndex;
    }

    public void setRevenueIndex(int revenueIndex) {
        this.revenueIndex = revenueIndex;
    }

    public int getViewablityIndex() {
        return viewablityIndex;
    }

    public void setViewablityIndex(int viewablityIndex) {
        this.viewablityIndex = viewablityIndex;
    }
}
