package com.dgut.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("bed")
public class Bed {
    @TableId(value = "b_id")
    @JsonProperty("bId")
    //床位ID
    private int bId;
    @JsonProperty("pId")
    //病人ID  默认-1
    private int pId;
    @JsonProperty("dId")
    //医生ID 默认-1
    private int dId;
    @JsonProperty("bState")
    //床位状态  0表示床位空，1表示床位已用
    private Integer bState;
    @JsonProperty("bStart")
    //床位使用开始日期
    private String bStart;
    @JsonProperty("bReason")
    //住院用床原因
    private String bReason;
    @Version
    //乐观锁版本号
    private Integer version;


}
