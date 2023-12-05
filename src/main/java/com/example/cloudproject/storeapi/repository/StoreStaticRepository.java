package com.example.cloudproject.storeapi.repository;

import com.example.cloudproject.storeapi.entity.Category;
import com.example.cloudproject.storeapi.entity.StoreStatic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StoreStaticRepository extends JpaRepository<StoreStatic, Long> {
    /*List<StoreStatic> findByStoreNameLike(String searchWord);*/

    Page<StoreStatic> findByStoreNameLike(String searchWord, Pageable pageable);
    Page<StoreStatic> findByCategoryId_CategoryId(Integer categoryId, Pageable pageable);
    StoreStatic findByStoreId(Long storeId);

}
