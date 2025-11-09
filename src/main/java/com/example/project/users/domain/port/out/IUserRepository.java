package com.example.project.users.domain.port.out;

import com.example.project.common.domain.GenericPortOut;
import com.example.project.users.infraestructure.adapter.out.entity.User;

public interface IUserRepository extends GenericPortOut<User, Long> {
}
