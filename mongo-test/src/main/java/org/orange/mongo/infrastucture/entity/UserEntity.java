/**
 * ClassName: MongoTestEntity1
 * Description:
 * date: 2022/10/27 2:53 下午
 *
 * @author licheng
 */
package org.orange.mongo.infrastucture.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document("user")
public class UserEntity {

    @Id
    private Integer id;

    private String name;

    private String address;

    private Date time;

    private List<UserEntity> friends;
}
