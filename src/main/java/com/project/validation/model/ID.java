package com.project.validation.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ID {
    @JsonProperty("EXCHANGE")
    String EXCHANGE;
    @JsonProperty("SYMBOL")
    String symbol;
    @JsonProperty("INSTRUMENT_TYPE")
    String instrumentType;
    @JsonProperty("INDEX_TYPE")
    String indexType;
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
    @JsonProperty("SERIAL")
    String serial;
    @JsonProperty("CORRECTION_FACTOR")
    String correctionFactor;
    @JsonProperty("DS")
    String ds;
    @JsonProperty("TC")
    String tc;
    @JsonProperty("ISIN_CODE")
    String isinCode;
    @JsonProperty("GROUP_SECTORS")
    String groupSector;

}