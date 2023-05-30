package com.lcwd.user.service.Service.repository;

import com.lcwd.user.service.Service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {


}
