package com.qfedu.service.impl;

import com.qfedu.common.vo.R;
import com.qfedu.domain.Browwer;
import com.qfedu.mapper.BrowwerMapper;
import com.qfedu.service.BrowwerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/7/23 15:28
 */
@Service
public class BrowerServiceImpl implements BrowwerService {
    @Autowired
    private BrowwerMapper mapper;
    @Override
    public R save(Browwer browwer) {
        browwer.setMoney(browwer.getMoney()*100);
        if(mapper.insert(browwer)>0){
            return R.setOK("新增成功");
        }else{
            return R.setError("新增失败");
        }
    }

    @Override
    public List<Browwer> qeruyAll() {
        return mapper.queryAll();
    }
}
