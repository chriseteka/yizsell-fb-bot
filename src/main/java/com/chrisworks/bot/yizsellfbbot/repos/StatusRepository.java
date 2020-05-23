package com.chrisworks.bot.yizsellfbbot.repos;

import com.chrisworks.bot.yizsellfbbot.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Chris_Eteka
 * @since 5/21/2020
 * @email chriseteka@gmail.com
 */
@Repository
public interface StatusRepository extends JpaRepository<Status, Long> {
}
