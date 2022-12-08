/**
 * ClassName: MyFlux
 * Description:
 * date: 2022/11/4 2:04 下午
 *
 * @author licheng
 */
package org.orange.all.reactor;

import reactor.core.CoreSubscriber;
import reactor.core.publisher.Flux;

public class MyFlux extends Flux<TestMsg> {

    @Override
    public void subscribe(CoreSubscriber<? super TestMsg> actual) {

    }
}
