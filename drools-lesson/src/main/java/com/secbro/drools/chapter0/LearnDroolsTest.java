package com.secbro.drools.chapter0;

import com.secbro.drools.BaseTest;
import com.secbro.drools.model.Person;
import org.junit.Test;
import org.kie.api.runtime.KieSession;

/**
 * Created by zhuzs on 2017/8/9.
 */
public class LearnDroolsTest extends BaseTest{

    @Test
    public void nullSafeTest(){
        KieSession kieSession = getKieSessionBySessionName("learn-drools");

        Person p1 = new Person();
        p1.setName(null);
        p1.setAge(18);

        kieSession.insert(p1);

        int count = kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println("Fire " + count + " rules!");
    }

    @Test
    public void equalsTest(){
        KieSession kieSession = getKieSessionBySessionName("learn-drools");

        Person p1 = new Person();
        p1.setName("zhangsan");

        kieSession.insert(p1);

        int count = kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println("Fire " + count + " rules!");
    }

    @Test
    public void bindingTest(){
        KieSession kieSession = getKieSessionBySessionName("learn-drools");

        Person p1 = new Person();
        p1.setAge(18);

        kieSession.insert(p1);

        int count = kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println("Fire " + count + " rules!");
    }
}
