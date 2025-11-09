package com.example.project.users.domain.port.in;

import com.example.project.common.domain.GenericPortIn;
import com.example.project.users.infraestructure.adapter.out.entity.User;

public interface IUserService extends GenericPortIn<User, Long> {
}
