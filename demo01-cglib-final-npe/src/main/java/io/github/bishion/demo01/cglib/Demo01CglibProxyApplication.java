package io.github.bishion.demo01.cglib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.DebuggingClassWriter;

import java.util.Properties;

@SpringBootApplication
public class Demo01CglibProxyApplication {
    public static void main(String[] args){

        Properties props = System.getProperties();
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/alidata1/admin/logs/");
        props.put("net.sf.cglib.core.DebuggingClassWriter.traceEnabled", "true");

        SpringApplication.run(Demo01CglibProxyApplication.class, args);
    }
}
