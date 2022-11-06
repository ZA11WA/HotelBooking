package com.example.test_hotel.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Bill")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private  Client client;

    @Column(name = "bill")
    @NotNull
    private String bill;

    public Bill(Client client, String bill) {
        this.client = client;
        this.bill = bill;
    }
}
