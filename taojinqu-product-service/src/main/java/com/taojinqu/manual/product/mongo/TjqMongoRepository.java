package com.taojinqu.manual.product.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.taojinqu.manual.product.vo.order.AliOrderVO;

@Repository("tjqMongoRepository")
public interface TjqMongoRepository extends MongoRepository<AliOrderVO, String> {

}
