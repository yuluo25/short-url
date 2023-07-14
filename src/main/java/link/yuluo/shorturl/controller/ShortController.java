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
public class ShortController {

    @GetMapping("/{originUrl}")
    @ResponseBody
    public String getShortUrl(@PathVariable String originUrl){
        String shortUrl = urlService.getShortUrl(originUrl);
        return shortUrl;
    }


   public void visitOriginalWebsite(){

    }

    /**
     * test
     * @return
     */
    @PostMapping  ("/login")
    public String login() {
        return "redirect:http://www.baidu.com";
    }

    @Resource
    IUrlService urlService;
}
