package com.stock.Repository;

import com.stock.Model.ProductRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRequestRepository extends JpaRepository <ProductRequest, Long>{
List<ProductRequest> findByReceiverId(Long receivableId);

}
