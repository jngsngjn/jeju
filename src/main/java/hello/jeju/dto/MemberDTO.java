package hello.jeju.dto;

public class MemberDTO {
    private long id;
    private String nickname;
    private String domain_id;
    private String tel;
    private String role;

    public MemberDTO(long id, String nickname, String domain_id, String tel, String role) {
        this.id = id;
        this.nickname = nickname;
        this.domain_id = domain_id;
        this.tel = tel;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDomain_id() {
        return domain_id;
    }

    public void setDomain_id(String domain_id) {
        this.domain_id = domain_id;
    }
}
