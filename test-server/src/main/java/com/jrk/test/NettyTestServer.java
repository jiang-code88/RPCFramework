package com.jrk.test;

import com.jrk.rpc.annotation.ServiceScan;
import com.jrk.rpc.serializer.CommonSerializer;
import com.jrk.rpc.transport.RpcServer;
import com.jrk.rpc.transport.netty.server.NettyServer;

/**
 * 测试用Netty服务提供者（服务端）
 *
 */
@ServiceScan
public class NettyTestServer {

    public static void main(String[] args) {
        RpcServer server = new NettyServer("127.0.0.1", 9999, CommonSerializer.PROTOBUF_SERIALIZER);
        server.start();
    }

}
