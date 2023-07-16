package link.yuluo.shorturl.service.impl;

import jakarta.annotation.Resource;
import link.yuluo.shorturl.model.UrlPO;
import link.yuluo.shorturl.model.repository.UrlRepository;
import link.yuluo.shorturl.service.IUrlService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author yuluo
 * @className: UrlServiceImpl
 * @date 7/10/2023 13:16
 * @description:
 **/
@Service
public class UrlServiceImpl  implements IUrlService {
    @Override
    public String getShortUrl(String originUrl) {
        UrlPO url=new UrlPO();
        url.setOriginUrl(originUrl);
        url.setOriginUrlHash(String.valueOf(originUrl.hashCode()));
//        String baseUrl="https://short.yuluo.link:8080/";
        String baseUrl="http://192.168.31.211:8080/re/";

        url.setShortUrl(baseUrl+url.getOriginUrlHash());
        UrlPO urlPO = urlRepository.saveAndFlush(url);
        return url.getShortUrl();
    }
    @Override
    public String visitOriginalWebsite(String url){
        List<UrlPO> allByShortUrl = urlRepository.findAllByOriginUrlHash(url);
        Optional<UrlPO> first = allByShortUrl.stream().findFirst();
        UrlPO urlPO = first.get();
        StringBuffer sb=new StringBuffer();
        sb.append("redirect:").append(urlPO.getOriginUrl());
        return sb.toString();
    }

    @Resource
    UrlRepository urlRepository;
}
