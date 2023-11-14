package com.liwei.controller;

import com.liwei.domain.ResponseResult;
import com.liwei.domain.entity.Menu;
import com.liwei.domain.vo.MenuVo;
import com.liwei.service.MenuService;
import com.liwei.utils.BeanCopyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
* @Auther:又菜又爱玩的炜
* @Description:查询菜单列表的访问接口
* @Date:2023/11/13
*/
@RestController
@RequestMapping("/system/menu")
public class MenuController{

    @Autowired
    private MenuService menuService;

    @GetMapping("/list")
    public ResponseResult list(Menu menu){
        List<Menu> menus = menuService.selectMenuList(menu);
        List<MenuVo> menuVos = BeanCopyUtils.copyBeanList(menus,MenuVo.class);
        return ResponseResult.okResult(menuVos);
    }

    @PostMapping
    public ResponseResult add(@RequestBody Menu menu){
        return ResponseResult.okResult(menuService.save(menu));
    }

    @GetMapping("/{menuId}")
    public ResponseResult getInfo(@PathVariable Long menuId){
        return ResponseResult.okResult(menuService.getById(menuId));
    }

    @PutMapping
    public ResponseResult edit(@RequestBody Menu menu){
        if (menu.getId().equals(menu.getParentId())){
            return ResponseResult.errorResult(500,"修改菜单'"+menu.getMenuName()+"'失败，上级菜单不能选择自己");
        }
        menuService.updateById(menu);
        return ResponseResult.okResult();
    }
}