package com.example.msademoauthapi.api.test.repository;

import com.example.msademoauthapi.api.test.model.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, BigInteger> {
}
