package link.yuluo.shorturl.model;

import lombok.Data;

/**
 * @author yuluo
 * @className: UrlPO
 * @date 7/3/2023 17:21
 * @description:
 **/

@Data
public class UrlPO {

    private String originUrl;

    private String originUrlHash;

    private String shortUrl;
}
