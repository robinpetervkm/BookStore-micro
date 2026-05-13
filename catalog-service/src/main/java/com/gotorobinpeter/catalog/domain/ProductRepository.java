package com.gotorobinpeter.catalog.domain;

import java.math.BigDecimal;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

interface ProductRepository extends JpaRepository<ProductEntity, BigDecimal> {
    Optional<ProductEntity> findByCode(String code);
}
