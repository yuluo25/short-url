package link.yuluo.shorturl.controller;

import jakarta.annotation.Resource;
import link.yuluo.shorturl.service.IUrlService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuluo
 * @className: ShortController
 * @date 7/10/2023 13:15
 * @description:
 **/
@RestController
public class ShortController {

    @GetMapping("/{originUrl}")
    public String getShortUrl(@PathVariable String originUrl){
        String shortUrl = urlService.getShortUrl(originUrl);
        shortUrl="bilibili.com";
        return shortUrl;
    }


   public void visitOriginalWebsite(){

    }

    @Resource
    IUrlService urlService;
}
