package com.liwei.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson.JSON;
import com.liwei.domain.ResponseResult;
import com.liwei.domain.dto.CategoryDto;
import com.liwei.domain.entity.Category;
import com.liwei.domain.vo.CategoryVo;
import com.liwei.domain.vo.ExcelCategoryVo;
import com.liwei.enums.AppHttpCodeEnum;
import com.liwei.service.CategoryService;
import com.liwei.utils.BeanCopyUtils;
import com.liwei.utils.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/*
* @Auther:又菜又爱玩的炜
* @Description:写博客
* @Date:2023/11/11
*/
@RestController
@RequestMapping("/content/category")
public class CategoryController{

    @Autowired
    private CategoryService categoryService;
    //写博文-查询文章分类的接口
    @GetMapping("/listAllCategory")
    public ResponseResult listAllCategory(){
        List<CategoryVo> list = categoryService.listAllCategory();
        return ResponseResult.okResult(list);
    }

    //分页查询文章的分类列表
    @GetMapping("/list")
    public ResponseResult list(Category category,Integer pageNum, Integer pageSize){
        return categoryService.selectCategoryPage(category,pageNum,pageSize);
    }

    //增加文章的分类
    @PostMapping
    public ResponseResult add(@RequestBody CategoryDto categoryDto){
        Category category = BeanCopyUtils.copyBean(categoryDto,Category.class);
        categoryService.save(category);
        return ResponseResult.okResult();
    }

    //删除分类
    @DeleteMapping("/{id}")
    public ResponseResult remove(@PathVariable(value = "id")Long id){
        categoryService.removeById(id);
        return ResponseResult.okResult();
    }
    //修改分类  1:先根据分类的id来查询分类 2：根据分类的id来修改分类
    @GetMapping("/{id}")
    public ResponseResult getInfo(@PathVariable(value = "id")Long id){
        Category category = categoryService.getById(id);
        return ResponseResult.okResult(category);
    }
    @PutMapping
    public ResponseResult edit(@RequestBody Category category){
        categoryService.updateById(category);
        return ResponseResult.okResult();
    }


    @PreAuthorize("@ps.hasPermission('content:category:export')")
    @GetMapping("/export")
    public void export(HttpServletResponse response){
        try {
            //设置下载文件的请求头
            WebUtils.setDownLoadHeader("分类.xlsx",response);
            //获取需要导出的数据
            List<Category> categoryVos = categoryService.list();
            List<ExcelCategoryVo> excelCategoryVos = BeanCopyUtils.copyBeanList(categoryVos, ExcelCategoryVo.class);
            //吧数据写入Excel表中
            EasyExcel.write(response.getOutputStream(), ExcelCategoryVo.class).autoCloseStream(Boolean.FALSE).sheet("分类导出")
                    .doWrite(excelCategoryVos);
        } catch (Exception e) {
            //如果出现异常也要响应json
            ResponseResult result = ResponseResult.errorResult(AppHttpCodeEnum.SYSTEM_ERROR);
            WebUtils.renderString(response, JSON.toJSONString(result));
        }
    }

//    @GetMapping("{id}")
//    public ResponseResult

}