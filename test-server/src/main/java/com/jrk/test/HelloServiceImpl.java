package com.jrk.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.jrk.rpc.annotation.Service;
import com.jrk.rpc.api.HelloObject;
import com.jrk.rpc.api.HelloService;


@Service
public class HelloServiceImpl implements HelloService {

    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public String hello(HelloObject object) {
        logger.info("接收到消息：{}", object.getMessage());
        return "这是Impl1方法";
    }

}
