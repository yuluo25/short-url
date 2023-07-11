package link.yuluo.shorturl.service.impl;

import link.yuluo.shorturl.model.UrlPO;
import link.yuluo.shorturl.service.IUrlService;
import org.springframework.stereotype.Service;

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
        return null;
    }
}
