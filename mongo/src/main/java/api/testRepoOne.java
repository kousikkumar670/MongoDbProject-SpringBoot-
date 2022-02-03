package api;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface testRepoOne  extends MongoRepository<testModelOne, String> {
	List<testModelOne> findAll();

}