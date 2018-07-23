package com.qfedu.service;

import com.qfedu.common.vo.R;
import com.qfedu.domain.Browwer;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/7/23 15:25
 */
public interface BrowwerService {
    R save(Browwer browwer);
    List<Browwer> qeruyAll();
}
