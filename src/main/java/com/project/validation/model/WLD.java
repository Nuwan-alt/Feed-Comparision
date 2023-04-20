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
public class WLD {

    @JsonProperty("WL_ID")
    String wlId;
    @JsonProperty("WL_DSC")
    String wlDsc;
    @JsonProperty("WL_TYPE")
    String wlType;
    @JsonProperty("FLD_LST")
    String fldLst;
    @JsonProperty("AST")
    String ast;
    @JsonProperty("IS_EDT")
    String isEdt;
    @JsonProperty("TI")
    String ti;

}
