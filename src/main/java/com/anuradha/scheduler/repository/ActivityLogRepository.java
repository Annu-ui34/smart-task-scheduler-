package com.anuradha.scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anuradha.scheduler.entity.ActivityLog;

public interface ActivityLogRepository extends JpaRepository<ActivityLog, Long> {

}