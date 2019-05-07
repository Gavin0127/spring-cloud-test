package com.learn.feign.controller;

import com.learn.feign.service.FileUploadFeignService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/7 21:06
 */
@RestController
@Api(value = "文件！上传！", description = "hehehhehe")
public class FeignUploadController {

    @Autowired
    private FileUploadFeignService fileUploadFeignService;

    @PostMapping(value = "/uploadFile",
                 consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ApiOperation(value = "文件文件！")
    public String uploadFile(
            @ApiParam(value = "上传文件", required = true) MultipartFile file) {
        return fileUploadFeignService.fileUpload(file);
    }

}
