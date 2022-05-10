package com.myait.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.myait.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

//	public List<User> findByait_id(String ait_id);

//	@Query("Select a from User a where a.ait_id=?1")
//	public User findByAitId(String ait_id);

	//@Query("Select a from User a where a.ait_id= :id")
	public User findByAitid(@Param("aitid") String aitid);

//	@Query(value = "Select a from User a where a.ait_id= :id", nativeQuery = true)
//	public User findByAitId(@Param("id") String id);

//	User findByAit_id(String ait_id);
	
//	User findByAitId(String id);

}