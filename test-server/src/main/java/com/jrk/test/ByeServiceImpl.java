package com.jrk.test;

import com.jrk.rpc.annotation.Service;
import com.jrk.rpc.api.ByeService;

@Service
public class ByeServiceImpl implements ByeService {

    @Override
    public String bye(String name) {
        return "bye, " + name;
    }
}
