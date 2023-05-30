package com.tibame.timetotravel.repository;

import com.tibame.timetotravel.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("UserRepository")
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserAccount(String username);

    @Modifying
    @Query(value = "UPDATE USER JOIN (SELECT USER_ID FROM USER WHERE USER_ACCOUNT = ?1) AS subquery SET USER_STATUS = ?2 WHERE USER.USER_ID = subquery.USER_ID", nativeQuery = true)
    void updateUserStatus(String Account, Integer status);

    @Query(value = "SELECT * FROM USER ORDER BY USER_SIGN_DATETIME DESC LIMIT ?1,?2",nativeQuery = true)
    List<User> findByPage(Integer currPage, Integer rows);

    @Query(value = "SELECT COUNT(*) FROM USER WHERE USER_STATUS = ?1 ORDER BY USER_SIGN_DATETIME DESC",nativeQuery = true)
    Integer findAllStatus(Integer status);

    @Query(value = "SELECT * FROM USER WHERE USER_STATUS = ?1 ORDER BY USER_SIGN_DATETIME DESC LIMIT ?2,?3",nativeQuery = true)
    List<User> findStatusByPage(Integer status, Integer currPage, Integer rows);

    @Query(value = "SELECT COUNT(*) FROM USER WHERE USER_ACCOUNT like %?1% OR USER_NAME like %?1% ORDER BY USER_SIGN_DATETIME DESC",nativeQuery = true)
    Integer findAllByKeword(String keyword);

    @Query(value = "SELECT * FROM USER WHERE USER_ACCOUNT like %?1% OR USER_NAME like %?1% ORDER BY USER_SIGN_DATETIME DESC LIMIT ?2,?3",nativeQuery = true)
    List<User> findKeywordByPage(String keyword, Integer currPage, Integer rows);

}
