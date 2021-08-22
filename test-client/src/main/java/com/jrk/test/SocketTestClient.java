package com.jrk.test;

import com.jrk.rpc.api.ByeService;
import com.jrk.rpc.api.HelloObject;
import com.jrk.rpc.api.HelloService;
import com.jrk.rpc.serializer.CommonSerializer;
import com.jrk.rpc.transport.RpcClientProxy;
import com.jrk.rpc.transport.socket.client.SocketClient;

/**
 * 测试用消费者（客户端）
 *
 * @author ziyang
 */
public class SocketTestClient {

    public static void main(String[] args) {
        SocketClient client = new SocketClient(CommonSerializer.KRYO_SERIALIZER);
        RpcClientProxy proxy = new RpcClientProxy(client);
        HelloService helloService = proxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
        ByeService byeService = proxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Netty"));
    }

}
