package com.secbro.drools.chapter0;

import com.secbro.drools.BaseTest;
import com.secbro.drools.model.Person;
import org.junit.Test;
import org.kie.api.runtime.KieSession;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by zhuzs on 2017/8/9.
 */
public class LearnDroolsTest extends BaseTest{

    /**
     *  not in 测试
     */
    @Test
    public void notInTest(){
        KieSession kieSession = getKieSessionBySessionName("learn-drools");

        Person p1 = new Person();
        p1.setName("zhaoliu");

        kieSession.insert(p1);

        int count = kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println("Fire " + count + " rules!");
    }

    /**
     *  in 测试
     */
    @Test
    public void inTest(){
        KieSession kieSession = getKieSessionBySessionName("learn-drools");

        Person p1 = new Person();
        p1.setName("wangwu");

        kieSession.insert(p1);

        int count = kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println("Fire " + count + " rules!");
    }

    /**
     *  != null 测试
     */
    @Test
    public void neNullTest(){
        KieSession kieSession = getKieSessionBySessionName("learn-drools");

        Person p1 = new Person();
        p1.setName("wangwu");

        kieSession.insert(p1);

        int count = kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println("Fire " + count + " rules!");
    }

    /**
     *  == null 测试
     */
    @Test
    public void eNullTest(){
        KieSession kieSession = getKieSessionBySessionName("learn-drools");

        Person p1 = new Person();
        p1.setName(null);

        kieSession.insert(p1);

        int count = kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println("Fire " + count + " rules!");
    }

    /**
     *  not soundslike 测试
     */
    @Test
    public void notSoundsLikeTest(){
        KieSession kieSession = getKieSessionBySessionName("learn-drools");

        Person p1 = new Person();
        p1.setName("word");

        kieSession.insert(p1);

        int count = kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println("Fire " + count + " rules!");
    }

    /**
     *  soundslike 测试
     */
    @Test
    public void soundsLikeTest(){
        KieSession kieSession = getKieSessionBySessionName("learn-drools");

        Person p1 = new Person();
        p1.setName("world");

        kieSession.insert(p1);

        int count = kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println("Fire " + count + " rules!");
    }

    /**
     *  not matches 测试
     */
    @Test
    public void notMatchesTest(){
        KieSession kieSession = getKieSessionBySessionName("learn-drools");

        Person p1 = new Person();
        p1.setName("李四");

        kieSession.insert(p1);

        int count = kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println("Fire " + count + " rules!");
    }

    /**
     *  matches 测试
     */
    @Test
    public void matchesTest(){
        KieSession kieSession = getKieSessionBySessionName("learn-drools");

        Person p1 = new Person();
        p1.setName("张三");

        kieSession.insert(p1);

        int count = kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println("Fire " + count + " rules!");
    }

    /**
     *  != 测试
     */
    @Test
    public void neTest(){
        KieSession kieSession = getKieSessionBySessionName("learn-drools");

        Person p1 = new Person();
        p1.setAge(19);

        kieSession.insert(p1);

        int count = kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println("Fire " + count + " rules!");
    }

    /**
     *  == 测试
     */
    @Test
    public void eTest(){
        KieSession kieSession = getKieSessionBySessionName("learn-drools");

        Person p1 = new Person();
        p1.setAge(18);

        kieSession.insert(p1);

        int count = kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println("Fire " + count + " rules!");
    }

    /**
     *  <= 测试
     */
    @Test
    public void leTest(){
        KieSession kieSession = getKieSessionBySessionName("learn-drools");

        Person p1 = new Person();
        p1.setAge(17);

        kieSession.insert(p1);

        int count = kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println("Fire " + count + " rules!");
    }

    /**
     *  < 测试
     */
    @Test
    public void lTest(){
        KieSession kieSession = getKieSessionBySessionName("learn-drools");

        Person p1 = new Person();
        p1.setAge(17);

        kieSession.insert(p1);

        int count = kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println("Fire " + count + " rules!");
    }

    /**
     *  >= 测试
     */
    @Test
    public void geTest(){
        KieSession kieSession = getKieSessionBySessionName("learn-drools");

        Person p1 = new Person();
        p1.setAge(18);

        kieSession.insert(p1);

        int count = kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println("Fire " + count + " rules!");
    }

    /**
     *  > 测试
     */
    @Test
    public void gTest(){
        KieSession kieSession = getKieSessionBySessionName("learn-drools");

        Person p1 = new Person();
        p1.setAge(20);

        kieSession.insert(p1);

        int count = kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println("Fire " + count + " rules!");
    }

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
    public void testDateFormat() {

        DateFormat dateFormat = new SimpleDateFormat("dd-mmm-yyyy", Locale.US);

        System.out.println(dateFormat.format(new Date()));
    }

    @Test
    public void equalsTest(){
        KieSession kieSession = getKieSessionBySessionName("learn-drools");

        Person p1 = new Person();
        p1.setBornDate(new Date(System.currentTimeMillis()));
        System.out.println(System.currentTimeMillis());

        p1.setMarry(true);
        p1.setAdult('0');
        p1.setName("zhangsan");
        p1.setAge(18);
        p1.setSalary(101);

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
