package edu.fjnu.cse.lostandfound.entities;

/**
 * api lost ret 接口
 * Created by zspmh on 2017-6-10.
 */

public class API_GetLost_Ret {
    LostItem[] lostItems;
    int totalRows;

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public LostItem[] getLostItems() {
        return lostItems;
    }

    public void setLostItems(LostItem[] lostItems) {
        this.lostItems = lostItems;
    }
}
