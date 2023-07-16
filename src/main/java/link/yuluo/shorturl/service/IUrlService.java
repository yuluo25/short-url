package link.yuluo.shorturl.service;

/**
 * @author yuluo
 * @className: IUrlService
 * @date 7/10/2023 13:16
 * @description:
 **/
public interface IUrlService {
    String getShortUrl(String originUrl);

    String visitOriginalWebsite(String url);
}
