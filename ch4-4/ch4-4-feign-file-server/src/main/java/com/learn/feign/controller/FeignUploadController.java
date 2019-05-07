package com.learn.feign.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/7 21:03
 */
@RestController
public class FeignUploadController {

    @RequestMapping(value = "/uploadFile/server", consumes =
            MediaType.MULTIPART_FORM_DATA_VALUE, method = RequestMethod.POST)
    public String fileUploadServer(MultipartFile file) {
        return file.getOriginalFilename();
    }

}
