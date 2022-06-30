package com.capabler1.booktest.dao;

/**
 * @author capabler1
 * @version 1.0
 * @date 2022/6/27 23:58
 */
import com.capabler1.booktest.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryDAO extends JpaRepository<Category, Integer> {

}
