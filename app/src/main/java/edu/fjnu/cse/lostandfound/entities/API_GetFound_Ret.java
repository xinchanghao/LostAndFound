package edu.fjnu.cse.lostandfound.entities;

/**
 * API found ret接口
 * Created by zspmh on 2016-12-25.
 */

public class API_GetFound_Ret {
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
