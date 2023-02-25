package com.otb.yamujige.usedgoods.repository;

import com.otb.yamujige.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsedGoodsRepository extends JpaRepository<User, Long> {
}
