package com.example.springbootjwt_ttd.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "token")
@Getter
@Setter
public class Token extends BaseEntity{

    @Column(length =1000)
    private String token;
    private Date tokenExpDate;

}
