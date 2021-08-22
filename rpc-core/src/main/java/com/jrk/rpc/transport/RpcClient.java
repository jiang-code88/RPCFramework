package com.jrk.rpc.transport;

import com.jrk.rpc.entity.RpcRequest;
import com.jrk.rpc.serializer.CommonSerializer;

/**
 * 客户端类通用接口
 *
 */
public interface RpcClient {

    int DEFAULT_SERIALIZER = CommonSerializer.KRYO_SERIALIZER;

    Object sendRequest(RpcRequest rpcRequest);

}
