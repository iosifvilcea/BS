package blankthings.cryptocap.data.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;


@Entity(tableName = "coins")
public class Coin {

    @PrimaryKey
    @SerializedName("id")
    private String id;

    @ColumnInfo(name = "name")
    @SerializedName("name")
    private String name;

    @ColumnInfo(name = "symbol")
    @SerializedName("symbol")
    private String symbol;

    @ColumnInfo(name = "rank")
    @SerializedName("rank")
    private String rank;

    @ColumnInfo(name = "price_usd")
    @SerializedName("price_usd")
    private String priceUsd;

    @ColumnInfo(name = "price_btc")
    @SerializedName("price_btc")
    private String priceBtc;

    @ColumnInfo(name = "24h_volume_usd")
    @SerializedName("24h_volume_usd")
    private String dayVolumeUsd;

    @ColumnInfo(name = "market_cap_usd")
    @SerializedName("market_cap_usd")
    private String marketCapUsd;

    @ColumnInfo(name = "available_supply")
    @SerializedName("available_supply")
    private String availableSupply;

    @ColumnInfo(name = "total_supply")
    @SerializedName("total_supply")
    private String totalSupply;

    @ColumnInfo(name = "max_supply")
    @SerializedName("max_supply")
    private String maxSupply;

    @ColumnInfo(name = "percent_change_1h")
    @SerializedName("percent_change_1h")
    private String percentChangeLastHour;

    @ColumnInfo(name = "percent_change_24h")
    @SerializedName("percent_change_24h")
    private String percentChangeLastDay;

    @ColumnInfo(name = "percent_change_7d")
    @SerializedName("percent_change_7d")
    private String percentChangeLastWeek;

    @ColumnInfo(name = "last_updated")
    @SerializedName("last_updated")
    private String lastUpdated;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getPriceUsd() {
        return priceUsd;
    }

    public void setPriceUsd(String priceUsd) {
        this.priceUsd = priceUsd;
    }

    public String getPriceBtc() {
        return priceBtc;
    }

    public void setPriceBtc(String priceBtc) {
        this.priceBtc = priceBtc;
    }

    public String getDayVolumeUsd() {
        return dayVolumeUsd;
    }

    public void setDayVolumeUsd(String dayVolumeUsd) {
        this.dayVolumeUsd = dayVolumeUsd;
    }

    public String getMarketCapUsd() {
        return marketCapUsd;
    }

    public void setMarketCapUsd(String marketCapUsd) {
        this.marketCapUsd = marketCapUsd;
    }

    public String getAvailableSupply() {
        return availableSupply;
    }

    public void setAvailableSupply(String availableSupply) {
        this.availableSupply = availableSupply;
    }

    public String getTotalSupply() {
        return totalSupply;
    }

    public void setTotalSupply(String totalSupply) {
        this.totalSupply = totalSupply;
    }

    public String getMaxSupply() {
        return maxSupply;
    }

    public void setMaxSupply(String maxSupply) {
        this.maxSupply = maxSupply;
    }

    public String getPercentChangeLastHour() {
        return percentChangeLastHour;
    }

    public void setPercentChangeLastHour(String percentChangeLastHour) {
        this.percentChangeLastHour = percentChangeLastHour;
    }

    public String getPercentChangeLastDay() {
        return percentChangeLastDay;
    }

    public void setPercentChangeLastDay(String percentChangeLastDay) {
        this.percentChangeLastDay = percentChangeLastDay;
    }

    public String getPercentChangeLastWeek() {
        return percentChangeLastWeek;
    }

    public void setPercentChangeLastWeek(String percentChangeLastWeek) {
        this.percentChangeLastWeek = percentChangeLastWeek;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
