package cn.hym.action.demo.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


/**
 * @ Author     ：hymcagee@163.com
 * @ Date       ：Created in 11:26 2018/8/29
 * @ Description：
 * @ Modified By：
 * @ Version    :
 */
@Controller
public class AnnotationController {
    // 请求映射地址：http://localhost:8080/webcode/test
    @RequestMapping(value = "/test")
    public String goTest(HttpServletRequest request){
        // 输出请求 URL 路径
        System.out.println(request.getRequestURL());
        // 返回逻辑名
        return "index";
    }
}
