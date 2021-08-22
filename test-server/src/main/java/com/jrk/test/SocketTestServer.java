package com.jrk.test;

import com.jrk.rpc.annotation.ServiceScan;
import com.jrk.rpc.serializer.CommonSerializer;
import com.jrk.rpc.transport.RpcServer;
import com.jrk.rpc.transport.socket.server.SocketServer;

/**
 * 测试用服务提供方（服务端）
 *
 */
@ServiceScan
public class SocketTestServer {

    public static void main(String[] args) {
        RpcServer server = new SocketServer("127.0.0.1", 9998, CommonSerializer.HESSIAN_SERIALIZER);
        server.start();
    }

}
