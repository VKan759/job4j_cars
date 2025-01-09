package ru.job4j.cars.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.job4j.cars.model.Post;

import java.util.List;
import java.util.Map;

@Repository
@AllArgsConstructor
public class PostRepository {
    private final CrudRepository crudRepository;

    List<Post> findAllForLastDay() {
        return crudRepository.query("from Post where date(created) = (current_date - interval '1 day')", Post.class);
    }

    List<Post> findByCarName(String carName) {
        return crudRepository.query("""
                from Post p 
                where p.car_id =
                (select c.id from Car c where c.name = :carName) 
                """, Post.class, Map.of("carName", carName));
    }
}
