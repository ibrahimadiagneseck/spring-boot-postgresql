package com.project.postgresql.service;

import com.project.postgresql.vo.UserVO;

import java.util.List;

public interface UserService {

    List<UserVO> findAll();

    void createUser(UserVO userVO);

    void updateUser(Long id, UserVO userVO);

    void deleteUser(Long id);

}
