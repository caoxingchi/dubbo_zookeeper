package site.xingchi.dubboconsumer.contoller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.xingchi.service.IDemoService;
import site.xingchi.service.IDemoTestService;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @Reference(version = "1.0.0",group = "dubbo-provider-group")
    private IDemoService demoService;

    @Reference(version = "1.0.2",group = "dubbo-provider-group2")
    private IDemoTestService demoTestService;

    @GetMapping("/getName")
    public String getName(String name){
        String result = demoService.getName(name);
        return result;
    }

    @GetMapping("/getNameNew")
    public String getNameNewVersion(String name){
        String result = demoTestService.getName();
        return result;
    }
}
