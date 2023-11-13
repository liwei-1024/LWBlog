package com.liwei.domain.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* @Auther:又菜又爱玩的炜
* @Description:
* @Date:2023/11/13
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExcelCategoryVo{
    @ExcelProperty("分类名")
    private String name;
    //描述
    @ExcelProperty("描述")
    private String description;

    //状态0:正常,1禁用
    @ExcelProperty("状态0:正常,1禁用")
    private String status;
}