package com.example.beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BeansApplicationTests {

    @Autowired
    MyService myService;

    @Test
    void testBeanInjection() {
        Assertions.assertNotNull(myService.getStore());
        MyStoreInterface store = myService.getStore();
        Person p = new Person("A", "B");
        store.add(p);
        store.add(p);
        Assertions.assertEquals(2, store.size());
     //   Assertions.assertEquals(1, store.size());
    }

}
