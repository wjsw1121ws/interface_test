package com.wcc.intf.service.impl;

import com.wcc.intf.mapper.SynMapper;
import com.wcc.intf.pojo.Syn;
import com.wcc.intf.pojo.SynExample;
import com.wcc.intf.service.SynService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: changchun_wu
 * @version: 1.0
 **/

@Service
public class SynServiceImpl implements SynService {
    @Autowired
    private SynMapper omsPsOrgChgSynMapper;

    @Override
    public List<Syn> getAll() {
        SynExample example = new SynExample();
        example.createCriteria();
        List<Syn> list = omsPsOrgChgSynMapper.selectByExample(example);
        return list;
    }
}
