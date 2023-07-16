package link.yuluo.shorturl.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * @author yuluo
 * @className: UrlPO
 * @date 7/3/2023 17:21
 * @description:
 **/

@Data
@Entity
@Table(name = "URL")
public class UrlPO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String originUrl;

    private String originUrlHash;

    private String shortUrl;
}
