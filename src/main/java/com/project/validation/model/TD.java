package com.project.validation.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TD {
    @JsonProperty("EXCHANGE")
    String exchange;
    @JsonProperty("SYMBOL")
    String symbol;
    @JsonProperty("INSTRUMENT_TYPE")
    String instrumentType;
    @JsonProperty("SYMBOL_DESCRIPTION")
    String symbolDescription;
    @JsonProperty("SECTOR")
    String sector;
    @JsonProperty("CURRENCY")
    String currency;
    @JsonProperty("SHRT_DSC")
    String shrt_dsc;
    @JsonProperty("DECIMAL_PLACES")
    String decimalPlaces;
    @JsonProperty("MARKET_ID")
    String marketID;
    @JsonProperty("LOT_SIZE")
    String lotSize;
    @JsonProperty("UNIT")
    String unit;
    @JsonProperty("INDEX_TYPE")
    String indexType;
    @JsonProperty("COMPANY_CODE")
    String companyCode;
    @JsonProperty("CORRECTION_FACTOR")
    String corrctionFactor;
    @JsonProperty("EQUITY_SYMBOL")
    String equitySymbol;
    @JsonProperty("CFID")
    String cfid;
    @JsonProperty("SERIAL")
    String serial;
    @JsonProperty("TI")
    String ti;
    @JsonProperty("RIC_CODE")
    String ricCode;
    @JsonProperty("DS")
    String ds;
    @JsonProperty("ISIN_CODE")
    String isinCode;
    @JsonProperty("LASTTRADABLEDATE")
    String lastTradableDate;
    @JsonProperty("SOURCE_SHORT_ID")
    String sourceShortId;
    @JsonProperty("STRIKE_PRICE")
    String StrikePrice;
    @JsonProperty("EXP_DATE")
    String expDate;
    @JsonProperty("OPI")
    String opi;
    @JsonProperty("AST")
    String ast;
    @JsonProperty("TSZ")
    String tsz;
    @JsonProperty("TCL1")
    String tcl1;
    @JsonProperty("TCL2")
    String tcl2;
    @JsonProperty("TCL3")
    String tcl3;
    @JsonProperty("FSSD")
    String fssd;
    @JsonProperty("FSED")
    String fsed;
    @JsonProperty("SSSD")
    String sssd;
    @JsonProperty("SSED")
    String ssed;
    @JsonProperty("MDATE")
    String mDate;
    @JsonProperty("TC")
    String tc;
    @JsonProperty("FSSH")
    String fssh;
    @JsonProperty("FSEH")
    String fseh;
    @JsonProperty("SSSH")
    String sssh;
    @JsonProperty("SSEH")
    String sseh;
    @JsonProperty("BBGID")
    String bbgid;
    @JsonProperty("GROUP_SECTORS")
    String groupSector;
    @JsonProperty("LOT_SIZE_DEC")
    String lotSizeDec;
    @JsonProperty("EXCHANGE_TICKER")
    String exchangeTicker;
    @JsonProperty("TICK_SIZE_TABLE")
    String tickSizeTable;

//    public TD(String singleDatum, String singleDatum1, String singleDatum2, String singleDatum3, String singleDatum4, String singleDatum5, String singleDatum6, String singleDatum7, String singleDatum8, String singleDatum9, String singleDatum10, String singleDatum11, String singleDatum12, String singleDatum13, String singleDatum14, String singleDatum15, String singleDatum16, String singleDatum17, String singleDatum18, String singleDatum19, String singleDatum20, String singleDatum21, String singleDatum22, String singleDatum23, String singleDatum24, String singleDatum25, String singleDatum26, String singleDatum27, String singleDatum28, String singleDatum29, String singleDatum30, String singleDatum31, String singleDatum32, String singleDatum33, String singleDatum34, String singleDatum35, String singleDatum36, String singleDatum37, String singleDatum38, String singleDatum39, String singleDatum40, String singleDatum41, String singleDatum42, String singleDatum43, String singleDatum44, String singleDatum45) {
//    }
}