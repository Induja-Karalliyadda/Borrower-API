package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Borrower {
    private String BID;
    private String NIC;
    private String name;
    private int contact;
    private String address;

}
