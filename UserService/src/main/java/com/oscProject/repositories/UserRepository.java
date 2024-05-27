/*
package com.oscProject.repositories;

import com.oscProject.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends {
    @Query(value = "SELECT * from user where email_id=?1", nativeQuery = true)
    Optional<User> existsByEmail(String userid);
}
*/

package com.oscProject.repositories;

import com.oscProject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    @Query(value = "SELECT * from user where email_id = ?1", nativeQuery = true)
    Optional<User> existsByEmail(String userId);

    @Query(value = "SELECT email_id from user where userid=?1", nativeQuery = true)
    Optional<String> findEmailIdByUserId(String userID);

    @Query(value = "SELECT * from user where email_id=?1", nativeQuery = true)
    Optional<User> findByEmailId(String email_id);

    @Query(value = "SELECT user_name from user where userid=?1", nativeQuery = true)
    Optional<String> fetchUsername(String userid);

    @Query(value = "SELECT * from user where userid=?1", nativeQuery = true)
    Optional<String> existsByID(String userid);

    @Query(value = "SELECT password from user where userid=?1", nativeQuery = true)
    Optional<String> fetchPassword(String userid);
}
