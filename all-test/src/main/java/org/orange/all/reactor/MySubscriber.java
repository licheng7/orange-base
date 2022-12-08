/**
 * ClassName: MySubscriber
 * Description:
 * date: 2022/11/3 2:57 下午
 *
 * @author licheng
 */
package org.orange.all.reactor;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

@Slf4j
public class MySubscriber implements Subscriber<TestMsg> {

    @SneakyThrows
    @Override
    public void onSubscribe(Subscription s) {
        log.info("onSubscribe 方法被调用,我的线程号是{}，参数为{}", Thread.currentThread().getId(), s.getClass());
        Thread.sleep(1000);
        s.request(11);
    }

    @Override
    public void onNext(TestMsg testMsg) {
        log.info("onNext 方法被调用，参数为{}", testMsg);
    }

    @Override
    public void onError(Throwable t) {
        log.info("onError 方法被调用，参数为{}", t);
    }

    @Override
    public void onComplete() {
        log.info("onComplete 方法被调用");
    }
}
