package site.xingchi.dubbozookeeperprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import site.xingchi.service.IDemoTestService;
@Service(group = "dubbo-provider-group2",timeout = 18000,version = "1.0.2")
public class DemoTestServiceImpl implements IDemoTestService {
    @Override
    public String getName() {
        return "new version 1.0.2";
    }
}
