package hello.spring.hello.repository;



import hello.spring.hello.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //회원 저장소 저장
    Optional<Member> findById(Long id); //Optional: 값이 없을 경우 null 대신 Optional로 감싸서 반환 JAVA8
    Optional<Member> findByName(String name); // find: 회원찾기
    List<Member> findAll(); //전체회원 반환



}
