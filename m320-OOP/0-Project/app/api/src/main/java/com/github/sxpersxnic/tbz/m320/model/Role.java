package com.github.sxpersxnic.tbz.m320.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * @author sxpersxnic
 */

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "roles")
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    @ManyToMany(mappedBy = "assignedRoles")
    private Set<User> assignedUsers = new HashSet<>();

    public Role(String name) {
        this.name = name;
    }

    public Role() {

    }

    @Override
    public String getAuthority() {
        return name;
    }
}
