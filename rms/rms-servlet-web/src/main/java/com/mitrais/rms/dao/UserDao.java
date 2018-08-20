package com.mitrais.rms.dao;

import java.util.List;
import java.util.Optional;

import com.mitrais.rms.entity.User;

/**
 * Provides interface specific to {@link User} data
 */
public interface UserDao extends Dao<User, Long>
{
    /**
     * Find {@link User} by its username
     * @param userName username
     * @return user
     */
    Optional<User> findByUserName(String userName);
    
    /**
     * Bulk add list of users to database.
     * @param users
     * @return true if the transaction is success
     */
    boolean BulkAddUsers(List<User> users);
}
