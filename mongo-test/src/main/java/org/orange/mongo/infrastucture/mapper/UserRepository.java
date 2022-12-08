/**
 * ClassName: UserRepostory
 * Description:
 * date: 2022/10/27 4:34 下午
 *
 * @author licheng
 */
package org.orange.mongo.infrastucture.mapper;

import org.orange.mongo.infrastucture.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, Integer> {
}
