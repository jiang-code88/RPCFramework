package com.jrk.test;

import com.jrk.rpc.api.ByeService;
import com.jrk.rpc.api.HelloObject;
import com.jrk.rpc.api.HelloService;
import com.jrk.rpc.serializer.CommonSerializer;
import com.jrk.rpc.transport.RpcClient;
import com.jrk.rpc.transport.RpcClientProxy;
import com.jrk.rpc.transport.netty.client.NettyClient;

/**
 * 测试用Netty消费者
 *
 */
public class NettyTestClient {

    public static void main(String[] args) {
        RpcClient client = new NettyClient(CommonSerializer.PROTOBUF_SERIALIZER);
        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
        ByeService byeService = rpcClientProxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Netty"));
    }

}
