package org.example.repository;

import org.example.entity.LectInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectInfoRepository extends JpaRepository<LectInfo, Long> {
}
