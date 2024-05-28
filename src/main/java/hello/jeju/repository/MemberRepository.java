package hello.jeju.repository;

import hello.jeju.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    MemberEntity findByDomainId(String domainId);
}
