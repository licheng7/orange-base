/**
 * ClassName: MyPublisher
 * Description:
 * date: 2022/11/3 2:47 下午
 *
 * @author licheng
 */
package org.orange.all.reactor;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

@Slf4j
public class MyPublisher implements Publisher<TestMsg> {

    @Override
    public void subscribe(Subscriber<? super TestMsg> subscriber) {
        log.info("我是MyPublisher的subscribe方法，我的线程号是{}", Thread.currentThread().getId());
        Subscription sub = new Subscription() {
            @Override
            public void request(long n) {
                log.info("request 方法被调用,我的线程号是{},n={}", Thread.currentThread().getId(), n);
            }

            @Override
            public void cancel() {
                log.info("cancel 方法被调用");
            }
        };
        subscriber.onSubscribe(sub);
        log.info("我继续执行了");
    }

    @SneakyThrows
    public static void main(String[] args) {
        new MyPublisher().subscribe(new MySubscriber());
        Thread.sleep(10000L);
    }
}
