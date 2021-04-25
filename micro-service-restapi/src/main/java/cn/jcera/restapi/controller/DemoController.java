package cn.jcera.restapi.controller;

import cn.jcera.core.entity.ResultBean;
import cn.jcera.core.util.ApiLogger;
import cn.jcera.core.util.HttpUtil;
import cn.jcera.restapi.version.ApiVersion;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ApiVersion(1)
@RequestMapping("/demo")
public class DemoController {

    @GetMapping
    public ResultBean<String> hello(String name) {
        return ResultBean.success("hello " + (StringUtils.isNotEmpty(name) ? name : "未知先生"));
    }

    @GetMapping("get-hello")
    public ResultBean<String> getHello(String name) {
        String url = "http://final-service/v1/demo?name=" + name;
        try {
            Thread.sleep((int) (Math.random() * 500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String response = HttpUtil.get(url, null);
        ApiLogger.httpLog.info("Api请求：地址：【{}】, 结果：【{}】", url, response);

        return ResultBean.success(response);
    }
}
