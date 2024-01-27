package com.niet.signodes.UserRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niet.signodes.entity.PrescriptionEntity;

public interface PrescriptionRepo extends JpaRepository<PrescriptionEntity,Long> {
	//List<PrescriptionEntity> findByTitleContainingOrContentContaining(String text, String textAgain);  
}
