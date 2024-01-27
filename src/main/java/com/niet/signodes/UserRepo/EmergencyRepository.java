package com.niet.signodes.UserRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niet.signodes.entity.Emergency;

public interface EmergencyRepository extends JpaRepository<Emergency, Long> {
    // You can add custom query methods here if needed
}
