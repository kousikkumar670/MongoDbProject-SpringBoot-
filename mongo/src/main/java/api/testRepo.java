package api;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface testRepo extends MongoRepository<testModel, String> {
	List<testModel> findAll();
 
}
