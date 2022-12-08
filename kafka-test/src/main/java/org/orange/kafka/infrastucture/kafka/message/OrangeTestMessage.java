/**
 * ClassName: OrangeTestMessage
 * Description:
 * date: 2022/6/25 11:14 上午
 *
 * @author licheng
 */
package org.orange.kafka.infrastucture.kafka.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.List;

@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrangeTestMessage implements Serializable {

    private static final long serialVersionUID = 4648211112442690620L;

    private Long id;

    private String name;

    private List<String> friendNames;
}
