package com.otb.yamujige.usedgoods.entity;

import com.otb.yamujige.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsedGoods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    private Long cost;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @OneToMany(mappedBy = "usedGoods", fetch = FetchType.LAZY)
    private List<UsedGoodsComment> usedGoodsComments;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
