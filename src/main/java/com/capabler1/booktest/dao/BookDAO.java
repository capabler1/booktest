package com.capabler1.booktest.dao;

/**
 * @author capabler1
 * @version 1.0
 * @date 2022/6/27 23:57
 */
import com.capabler1.booktest.pojo.Book;
import com.capabler1.booktest.pojo.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookDAO extends JpaRepository<Book,Integer> {
    List<Book> findAllByCategory(Category category);
    List<Book> findAllByTitleLikeOrAuthorLike(String keyword1, String keyword2);
}
