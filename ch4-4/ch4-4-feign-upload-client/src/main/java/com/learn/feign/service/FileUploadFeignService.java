package com.learn.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/7 20:59
 */
@FeignClient(name = "ch4-4-feign-file-server")
public interface FileUploadFeignService {

    @RequestMapping(value = "/uploadFile/server", produces =
            {MediaType.APPLICATION_JSON_UTF8_VALUE}, consumes =
                            MediaType.MULTIPART_FORM_DATA_VALUE)
    String fileUpload(@RequestPart(value = "file") MultipartFile file);

}
