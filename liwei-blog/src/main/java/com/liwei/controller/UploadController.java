package com.liwei.controller;

import com.liwei.domain.ResponseResult;
import com.liwei.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/*
* @Auther:又菜又爱玩的炜
* @Description:
* @Date:2023/11/8
*/
@RestController
public class UploadController{

    @Autowired
    private UploadService uploadService;

    @PostMapping("/upload")
    public ResponseResult uploadImg(MultipartFile img){
        return uploadService.uploadImg(img);
    }
}