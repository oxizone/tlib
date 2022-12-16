package com.ufr.tlib.models;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Local {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    private String name;
    private String address;
    private String description;
    private String phoneNumber;
    private String email;
    private boolean enabled;

    @OneToMany(mappedBy = "local")
    private List<Artisan> artisans;

    @ManyToOne
    private User manager;
}