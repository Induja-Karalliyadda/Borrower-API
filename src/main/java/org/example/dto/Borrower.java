package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Borrower {
    private Long id;
    private String bid;
    private String nic;
    private String name;
    private int contact;
    private String address;

}
