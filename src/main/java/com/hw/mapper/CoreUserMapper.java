package com.hw.mapper;

import com.hw.entity.CoreUser;
import com.hw.entity.dto.RespCoreUser;
import org.apache.ibatis.annotations.Param;

public interface CoreUserMapper {

    CoreUser findByUsername(@Param("name") String name);

    CoreUser findByUserPhone(@Param("phone") String phone);

    CoreUser findUserById(@Param("Id") String Id);

    int register(CoreUser user);

    void edit(CoreUser coreUser);

    RespCoreUser findRespUserById(@Param("Id") String Id);
}
