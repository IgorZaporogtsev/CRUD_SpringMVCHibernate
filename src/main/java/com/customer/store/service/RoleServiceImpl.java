package com.customer.store.service;

import com.customer.store.dao.RoleDao;
import com.customer.store.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleDao roleDao;

    public void addRole(Role role) {
        roleDao.addRole(role);
    }

}
