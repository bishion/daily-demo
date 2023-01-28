package io.github.bishion.demo.swagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

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
