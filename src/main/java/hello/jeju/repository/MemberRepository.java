package hello.jeju.repository;

import hello.jeju.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByDomainId(String domainId);
}
