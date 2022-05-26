package site.xingchi.dubbozookeeperprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import site.xingchi.service.IDemoService;

@Service(group = "dubbo-provider-group",timeout = 18000,version = "1.0.0")
public class DemoServiceImpl implements IDemoService {
    @Override
    public String getName(String name) {
        return "test demo sss";
    }
}
