package com.tencent.tpns.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonValue;


//@ApiModel(value = "运行的环境")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Environment {

    // @ApiModelProperty(value = " 推送生产环境")
    product(0, "product"),
    // @ApiModelProperty(value = "推送开发环境")
    dev(1, "dev"),;

    Environment(int type, String name) {
        this.type = type;
        this.name = name;
    }

    public int getType() {
        return type;
    }


    @JsonValue
    public String getName() {
        return name;
    }

    private int type;

    private String name;
}



