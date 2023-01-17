package Team2.com.member.entity;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name="Request", uniqueConstraints = {@UniqueConstraint(columnNames = {"member_role","member_status","member_id"})})
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_role")
    private String role;

    @Column(name = "member_status")
    private String status;

    @Column(name = "member_id")
    private Long user;

    public Request(Long member, String role, String status) {
        this.user = member;
        this.role = role;
        this.status = status;

    }

}