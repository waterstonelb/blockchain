package com.liangwei.demo.service;

import com.liangwei.demo.model.Block;
import com.liangwei.demo.model.BTranscation;
import java.util.List;
import org.apache.ibatis.annotations.*;



public interface UserService {

    List<BTranscation> getUser();

    List<Block> getNewBlock();
}
