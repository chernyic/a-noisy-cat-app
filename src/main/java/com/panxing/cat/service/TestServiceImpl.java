package com.panxing.cat.service;

import com.panxing.cat.util.Result;
import org.springframework.stereotype.Service;

/**
 * Created by panxing on 17/5/2
 */
@Service("testService")
public class TestServiceImpl implements ITestService {
    @Override
    public Result test() {
        return Result.BLANK_SUCCESS;
    }
}
