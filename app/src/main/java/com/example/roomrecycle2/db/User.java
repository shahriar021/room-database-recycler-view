package com.example.roomrecycle2.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {

    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name="acc_id")
    public String boId;

    @ColumnInfo(name="share")
    public String stockName;

    @ColumnInfo(name="quantity")
    public String quantity;

    @ColumnInfo(name="buying_price")
    public String buyingPrice;

    @ColumnInfo(name="selling_Price")
    public String sellingPrice;

    @ColumnInfo(name="profitLoss")
    public String profitLoss;
}
