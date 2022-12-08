/**
 * ClassName: UserService
 * Description:
 * date: 2022/10/27 4:41 下午
 *
 * @author licheng
 */
package org.orange.mongo.app;

import lombok.extern.slf4j.Slf4j;
import org.orange.mongo.infrastucture.entity.UserEntity;
import org.orange.mongo.infrastucture.mapper.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class UserService {

    //@Autowired
    //private UserRepository userRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public void test1() {
        /*List<UserEntity> all = userRepository.findAll();
        log.info(all.toArray().toString());*/
        List<UserEntity> all = mongoTemplate.findAll(UserEntity.class);
        log.info(all.toArray().toString());
    }
}
