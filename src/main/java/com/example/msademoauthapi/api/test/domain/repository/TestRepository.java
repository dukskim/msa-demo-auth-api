package com.example.msademoauthapi.api.test.domain.repository;

import com.example.msademoauthapi.api.test.domain.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, BigInteger> {
}
