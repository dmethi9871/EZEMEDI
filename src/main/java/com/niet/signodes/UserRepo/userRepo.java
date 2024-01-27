package com.niet.signodes.UserRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niet.signodes.entity.UserDltscontact;




public interface userRepo extends JpaRepository<UserDltscontact,Integer> {
}