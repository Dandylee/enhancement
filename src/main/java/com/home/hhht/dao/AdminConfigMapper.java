package com.home.hhht.dao;

import com.home.hhht.domain.AdminConfig;
import java.util.List;

public interface AdminConfigMapper {
    int insert(AdminConfig record);

    List<AdminConfig> selectAll();
}