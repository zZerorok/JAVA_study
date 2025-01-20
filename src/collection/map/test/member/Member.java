package collection.map.test.member;

public record Member(
        String id,
        String name
) {

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

