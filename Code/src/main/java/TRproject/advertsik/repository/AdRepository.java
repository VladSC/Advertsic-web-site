package TRproject.advertsik.repository;

import TRproject.advertsik.bean.Ad;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdRepository extends CrudRepository<Ad, Long> {
    List<Ad> findByTitle(String title);

    void deleteById(Long id);
}
