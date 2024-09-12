package com.technio.scm.entities;
import jakarta.persistence.*;
import lombok.*;
import java.util.*;
@Entity(name = "user")
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User{
    @Id
    private String userId;
    private String name;
    private String password;
    @Column(unique = true,nullable = false)
    private String email;
    @Column(length = 10000)
    private String about;

    private String profilePic;
    private String phoneNumber;
    private boolean enabled = false;
    private boolean emailVerified = false;
    private boolean phoneVerified = false;
    private Providers provider=Providers.SELF;
    private String providerUserId;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
    private List<Contact>contactList;
}