package link.yuluo.shorturl.model.repository;

import link.yuluo.shorturl.model.UrlPO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UrlRepository extends JpaRepository<UrlPO,Long> {

    List<UrlPO> findAllByOriginUrlHash(String url);
}
