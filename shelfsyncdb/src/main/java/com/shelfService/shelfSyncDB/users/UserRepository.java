package com.shelfService.shelfSyncDB.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUid(String uid);

    @Transactional
    void deleteByUid(String uid);
}