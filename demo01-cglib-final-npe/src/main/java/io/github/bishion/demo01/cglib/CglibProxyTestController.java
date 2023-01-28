package io.github.bishion.demo01.cglib;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api(tags = {"测试swagger"})
@RestController
public class CglibProxyTestController {
    @Resource
    private BookOrderService bookOrderService;


    @GetMapping("/createOrderWithFinal")
    public String createOrderWithFinal() {
        bookOrderService.createOrderWithFinal(null);
        return "SUCCESS";
    }

    @GetMapping("/createOrderWithoutFinal")
    public String createOrderWithoutFinal() {
        bookOrderService.createOrderNoFinal(null);
        return "SUCCESS";
    }
}
