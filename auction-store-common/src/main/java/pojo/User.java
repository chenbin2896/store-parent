package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;


/**
 * @author User
 * @date 2019/9/28
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid")
    private Integer id;

    @Column(name = "uname")
    private String username;
    @Column(name = "upass")
    private String password;
    @Column(name = "email")
    private String email;
    private String tel;
    private String userStatus;
    private String accountStatus;
    private String accountPassword;
    private String idCard;
    @Column(name = "utime")
    @CreationTimestamp
    private Date createTime;
}
