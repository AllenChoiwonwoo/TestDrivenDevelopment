package cahhp07.practice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColumnParserTest {

    @Test
    void 컬럼파서_테스트(){
        /*
    기본
    Dimension.DATE,Ad unit 1,Ad unit 2,Ad unit ID 1,Ad unit ID 2,Column.TOTAL_AD_REQUESTS,Column.TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS,Column.TOTAL_LINE_ITEM_LEVEL_CLICKS,Column.TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE,Column.TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE

    예외
    Dimension.DATE,Ad unit 1,Ad unit 2,Ad unit 3,Ad unit ID 1,Ad unit ID 2,Ad unit ID 3,Column.TOTAL_AD_REQUESTS,Column.TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS,Column.TOTAL_LINE_ITEM_LEVEL_CLICKS,Column.TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE,Column.TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE


    필요값
    DATE
    adunit 의 이름 ( 숫자가 제일 큰게 이름 )
    REQ
    IMP
    CLICK
    REVENUE
    viewability

         */
        String defaultColumns = "Dimension.DATE,Ad unit 1,Ad unit 2,Ad unit ID 1,Ad unit ID 2,Column.TOTAL_AD_REQUESTS,Column.TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS,Column.TOTAL_LINE_ITEM_LEVEL_CLICKS,Column.TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE,Column.TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE";
        String exceptionColumns = "Dimension.DATE,Ad unit 1,Ad unit 2,Ad unit 3,Ad unit ID 1,Ad unit ID 2,Ad unit ID 3,Column.TOTAL_AD_REQUESTS,Column.TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS,Column.TOTAL_LINE_ITEM_LEVEL_CLICKS,Column.TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE,Column.TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE";
        List<String> defaultColumnsList = Arrays.asList(defaultColumns.split(","));
        for (String column : defaultColumnsList) {
            System.out.println(column);
        }
        System.out.println("====================================");
        List<String> exceptionColumnsList = Arrays.asList(defaultColumns.split(","));
        for (String column : exceptionColumnsList) {
            System.out.println(column);
        }
        /*
            csv 파일을 읽는다.
         */


//        ColumnParser<String> parser = new ColumnParser<>();
//        parser.set("Hello");
//        System.out.println(parser.get());
    }
    String defaultColumns = "Dimension.DATE,Ad unit 1,Ad unit 2,Ad unit ID 1,Ad unit ID 2,Column.TOTAL_AD_REQUESTS,Column.TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS,Column.TOTAL_LINE_ITEM_LEVEL_CLICKS,Column.TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE,Column.TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE";

    @Test
    public void extractRequiredColumn(){

        String[] columns = defaultColumns.split(",");
        ColumnParser columnParser = new DefaultColumnParser();
        ColumnsIndexInfo columnsInfo = columnParser.getColumnIndex(columns); // null
        assertEquals(columnsInfo.getDateIndex(), 1);

    }
}
