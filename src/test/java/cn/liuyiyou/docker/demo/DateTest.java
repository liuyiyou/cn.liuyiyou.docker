package cn.liuyiyou.docker.demo;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author: liuyiyou.cn
 * @date: 2018/12/14
 * @version: V1.0
 */
public class DateTest {

    @Test
    public void  formartDate(){
        LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }
}
