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
public class WLTD
{
    @JsonProperty("WL_ID")
    String WL_ID;
    @JsonProperty("EXCHANGE")
    String exchange;
    @JsonProperty("TKR_LST")
    String tkrLst;
}
