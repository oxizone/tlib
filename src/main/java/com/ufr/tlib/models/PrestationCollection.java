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
public class PrestationCollection {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;


    @OneToOne(mappedBy="prestationCollection", fetch = FetchType.LAZY)
    private RDV rdv;


    @OneToMany(mappedBy = "prestationCollection",fetch = FetchType.LAZY)
    private List<Prestation> prestations;
}
