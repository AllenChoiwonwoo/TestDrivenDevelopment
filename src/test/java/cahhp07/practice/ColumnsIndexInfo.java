package cahhp07.practice;

public class ColumnsIndexInfo {
//    String defaultColumns = "Dimension.DATE,Ad unit 1,Ad unit 2,Ad unit ID 1,Ad unit ID 2,Column.TOTAL_AD_REQUESTS,Column.TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS,Column.TOTAL_LINE_ITEM_LEVEL_CLICKS,Column.TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE,Column.TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE";
    private short dateIndex;
    private short unitNameIndex;
    private short unitIdIndex;
    private short requestIndex;
    private short impressionIndex;
    private short clickIndex;
    private short revenueIndex;
    private short viewablityIndex;

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

    public short getDateIndex() {
        return dateIndex;
    }

    public void setDateIndex(short dateIndex) {
        this.dateIndex = dateIndex;
    }

    public short getUnitNameIndex() {
        return unitNameIndex;
    }

    public void setUnitNameIndex(short unitNameIndex) {
        this.unitNameIndex = unitNameIndex;
    }

    public short getUnitIdIndex() {
        return unitIdIndex;
    }

    public void setUnitIdIndex(short unitIdIndex) {
        this.unitIdIndex = unitIdIndex;
    }

    public short getRequestIndex() {
        return requestIndex;
    }

    public void setRequestIndex(short requestIndex) {
        this.requestIndex = requestIndex;
    }

    public short getImpressionIndex() {
        return impressionIndex;
    }

    public void setImpressionIndex(short impressionIndex) {
        this.impressionIndex = impressionIndex;
    }

    public short getClickIndex() {
        return clickIndex;
    }

    public void setClickIndex(short clickIndex) {
        this.clickIndex = clickIndex;
    }

    public short getRevenueIndex() {
        return revenueIndex;
    }

    public void setRevenueIndex(short revenueIndex) {
        this.revenueIndex = revenueIndex;
    }

    public short getViewablityIndex() {
        return viewablityIndex;
    }

    public void setViewablityIndex(short viewablityIndex) {
        this.viewablityIndex = viewablityIndex;
    }
}
