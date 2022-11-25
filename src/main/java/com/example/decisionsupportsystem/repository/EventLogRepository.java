package com.example.decisionsupportsystem.repository;

import com.example.decisionsupportsystem.repository.entity.EventLog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventLogRepository extends MongoRepository<EventLog, String> {

}
