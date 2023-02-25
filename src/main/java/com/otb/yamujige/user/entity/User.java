package com.otb.yamujige.user.entity;

import com.otb.yamujige.usedgoods.entity.UsedGoods;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "user")
    private List<UsedGoods> usedGoods;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
