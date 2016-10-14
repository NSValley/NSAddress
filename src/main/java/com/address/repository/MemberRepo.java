package com.address.repository;

import com.address.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 1004w455 on 2016. 10. 14..
 */
@Repository
public interface MemberRepo extends JpaRepository<Member, Long> {
}
