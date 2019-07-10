package com.service;

import com.dao.TypeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService {

    @Autowired
    private TypeDAO typeDAO;

    public List allType() {

        List list = typeDAO.selectList(null);
        return list;

    }
}
