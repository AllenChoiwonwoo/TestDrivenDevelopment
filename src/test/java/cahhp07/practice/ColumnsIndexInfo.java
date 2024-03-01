package cahhp07.practice;

public class ColumnsIndexInfo {
//    String defaultColumns = "Dimension.DATE,Ad unit 1,Ad unit 2,Ad unit ID 1,Ad unit ID 2,Column.TOTAL_AD_REQUESTS,Column.TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS,Column.TOTAL_LINE_ITEM_LEVEL_CLICKS,Column.TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE,Column.TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE";
    private byte dateIndex;
    private byte unitNameIndex;
    private byte unitIdIndex;
    private byte requestIndex;
    private byte impressionIndex;
    private byte clickIndex;
    private byte revenueIndex;
    private byte viewablityIndex;

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

    public byte getDateIndex() {
        return dateIndex;
    }

    public void setDateIndex(byte dateIndex) {
        this.dateIndex = dateIndex;
    }

    public byte getUnitNameIndex() {
        return unitNameIndex;
    }

    public void setUnitNameIndex(byte unitNameIndex) {
        this.unitNameIndex = unitNameIndex;
    }

    public byte getUnitIdIndex() {
        return unitIdIndex;
    }

    public void setUnitIdIndex(byte unitIdIndex) {
        this.unitIdIndex = unitIdIndex;
    }

    public byte getRequestIndex() {
        return requestIndex;
    }

    public void setRequestIndex(byte requestIndex) {
        this.requestIndex = requestIndex;
    }

    public byte getImpressionIndex() {
        return impressionIndex;
    }

    public void setImpressionIndex(byte impressionIndex) {
        this.impressionIndex = impressionIndex;
    }

    public byte getClickIndex() {
        return clickIndex;
    }

    public void setClickIndex(byte clickIndex) {
        this.clickIndex = clickIndex;
    }

    public byte getRevenueIndex() {
        return revenueIndex;
    }

    public void setRevenueIndex(byte revenueIndex) {
        this.revenueIndex = revenueIndex;
    }

    public byte getViewablityIndex() {
        return viewablityIndex;
    }

    public void setViewablityIndex(byte viewablityIndex) {
        this.viewablityIndex = viewablityIndex;
    }
}
