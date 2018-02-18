package com.customer.store.dao;

import com.customer.store.model.Role;

public interface RoleDao {
    Role getRoleByRoleName(String roleName);
    void addRole (Role roleName);

}
