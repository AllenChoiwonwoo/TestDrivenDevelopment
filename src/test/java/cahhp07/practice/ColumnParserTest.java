package cahhp07.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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
    private final String defaultColumns = "Dimension.DATE,Ad unit 1,Ad unit 2,Ad unit ID 1,Ad unit ID 2,Column.TOTAL_AD_REQUESTS,Column.TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS,Column.TOTAL_LINE_ITEM_LEVEL_CLICKS,Column.TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE,Column.TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE";
    private final String exceptionColumnString = "Dimension.DATE,Ad unit 1,Ad unit 2,Ad unit 3,Ad unit ID 1,Ad unit ID 2,Ad unit ID 3,Column.TOTAL_AD_REQUESTS,Column.TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS,Column.TOTAL_LINE_ITEM_LEVEL_CLICKS,Column.TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE,Column.TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE";


    private ColumnParser columnParser;

    @BeforeEach
    public void setUp(){
        columnParser = new DefaultColumnParser();
    }

    @Test
    public void extractRequiredColumn(){
        ColumnsIndexInfo columnsInfo = columnParser.getColumnIndex(defaultColumns);
        assertEquals(0, columnsInfo.getDateIndex());
        assertEquals(2, columnsInfo.getUnitNameIndex());
        assertEquals(4, columnsInfo.getUnitIdIndex());
        assertEquals(5, columnsInfo.getRequestIndex());
        assertEquals(6, columnsInfo.getImpressionIndex());
        assertEquals(7, columnsInfo.getClickIndex());
        assertEquals(8, columnsInfo.getRevenueIndex());
        assertEquals(9, columnsInfo.getViewablityIndex());
    }

    @Test
    @DisplayName("기본순서와는 다른 순서를 가진 컬럼들에서 필요한 컬럼 파싱 테스트")
    public void extractRequiredColumnFromExceptionColumns(){
        ColumnsIndexInfo columnsIndexInfo = columnParser.getColumnIndex(exceptionColumnString);


    }


}
