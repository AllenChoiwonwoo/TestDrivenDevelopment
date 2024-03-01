package cahhp07.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ColumnParserTest {
    private final String defaultColumns = "Dimension.DATE,Ad unit 1,Ad unit 2,Ad unit ID 1,Ad unit ID 2,Column.TOTAL_AD_REQUESTS,Column.TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS,Column.TOTAL_LINE_ITEM_LEVEL_CLICKS,Column.TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE,Column.TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE";
    private final String exceptionColumnString = "Dimension.DATE,Ad unit 1,Ad unit 2,Ad unit 3,Ad unit ID 1,Ad unit ID 2,Ad unit ID 3,Column.TOTAL_AD_REQUESTS,Column.TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS,Column.TOTAL_LINE_ITEM_LEVEL_CLICKS,Column.TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE,Column.TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE";

    private ColumnParser columnParser;

    @BeforeEach
    public void setUp(){
        columnParser = new DefaultColumnParser();
    }

    @Test
    public void extractRequiredColumn(){
        try {
        ColumnsIndexInfo columnsInfo = columnParser.getColumnIndex(defaultColumns);
            assertEquals(0, columnsInfo.getDateIndex());
            assertEquals(2, columnsInfo.getUnitNameIndex());
            assertEquals(4, columnsInfo.getUnitIdIndex());
            assertEquals(5, columnsInfo.getRequestIndex());
            assertEquals(6, columnsInfo.getImpressionIndex());
            assertEquals(7, columnsInfo.getClickIndex());
            assertEquals(8, columnsInfo.getRevenueIndex());
            assertEquals(9, columnsInfo.getViewablityIndex());

            ColumnsIndexInfo columnsIndexInfo = columnParser.getColumnIndex(exceptionColumnString);
            assertEquals(0, columnsIndexInfo.getDateIndex());
            assertEquals(3, columnsIndexInfo.getUnitNameIndex());
            assertEquals(6, columnsIndexInfo.getUnitIdIndex());
            assertEquals(7, columnsIndexInfo.getRequestIndex());
            assertEquals(8, columnsIndexInfo.getImpressionIndex());
            assertEquals(9, columnsIndexInfo.getClickIndex());
            assertEquals(10, columnsIndexInfo.getRevenueIndex());
            assertEquals(11, columnsIndexInfo.getViewablityIndex());
        } catch (NullPointerException e) {
            throw new RuntimeException("CSV의 컬럼 파싱중 에러 : " + e.getMessage());
        }
    }

    @Test
    public void columEmptyTest(){
        assertThrows(NullPointerException.class,
                () -> columnParser.getColumnIndex(null));
    }

    @Test
    public void allColumnIndexChecked() {
        ColumnsIndexInfo columnsIndexInfo1 = columnParser.getColumnIndex(defaultColumns);
        assertEquals(true, columnsIndexInfo1.isAllColumnChecked());

        ColumnsIndexInfo columnsIndexInfo2 = columnParser.getColumnIndex(exceptionColumnString);
        assertEquals(true, columnsIndexInfo2.isAllColumnChecked());

        String valueForError = "Dimension,Ad unit 1,Ad unit 2,Ad unit 3,Ad unit ID 1,Ad unit ID 2,Ad unit ID 3,Column.TOTAL_AD_REQUESTS,Column.TOTAL_LINE_ITEM_LEVEL_IMPRESSIONS,Column.TOTAL_LINE_ITEM_LEVEL_CLICKS,Column.TOTAL_LINE_ITEM_LEVEL_CPM_AND_CPC_REVENUE,Column.TOTAL_ACTIVE_VIEW_VIEWABLE_IMPRESSIONS_RATE";
        ColumnsIndexInfo columnsIndexInfo3 = columnParser.getColumnIndex(valueForError);
        assertEquals(false, columnsIndexInfo3.isAllColumnChecked());


    }
}
