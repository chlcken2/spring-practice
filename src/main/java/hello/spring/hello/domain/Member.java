package hello.spring.hello.domain;

public class Member {
    private Long id; //임의 값(시스템이 정한 값:key값)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
