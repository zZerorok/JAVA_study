package collection.map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    private final Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member) {
        memberMap.put(member.id(), member);
    }

    public void remove(String id) {
        memberMap.remove(id);
    }

    public Member findById(String id) {
        return memberMap.get(id);
    }

    public Member findByName(String name) {
        for (Member member : memberMap.values()) {
            if (member.name().equals(name)) {
                return member;
            }
        }
        return null;
    }
}
