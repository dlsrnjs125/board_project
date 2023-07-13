package com.fastcampus.board_project.repository;

import com.fastcampus.board_project.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
}
