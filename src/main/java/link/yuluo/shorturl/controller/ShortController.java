package link.yuluo.shorturl.controller;

import jakarta.annotation.Resource;
import link.yuluo.shorturl.service.IUrlService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author yuluo
 * @className: ShortController
 * @date 7/10/2023 13:15
 * @description:
 **/
@Controller
@CrossOrigin
public class ShortController {

    @GetMapping("/get-short")
    @ResponseBody
    public String getShortUrl(@RequestParam String originUrl) {
        String shortUrl = urlService.getShortUrl(originUrl);
        return shortUrl;
    }

    @GetMapping("/re/{url}")
    public String visitOriginalWebsite(@PathVariable String url) {
        return urlService.visitOriginalWebsite(url);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello world";
    }

    @Resource
    IUrlService urlService;
}
