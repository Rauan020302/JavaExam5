package com.company.model;

import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@XmlRootElement(name="person")
public class Person {
    private Long id;
    private Date requestDateTime;
    private String name;
    private Date birthYear;
    private String gender;
}
