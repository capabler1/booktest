package com.capabler1.booktest.pojo;

/**
 * @author capabler1
 * @version 1.0
 * @date 2022/6/29 18:17
 */
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "admin_menu")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class AdminMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    String path;
    String name;
    String nameZh;
    String iconCls;
    String component;
    int parentId;
    @Transient
    List<AdminMenu> children;

}
