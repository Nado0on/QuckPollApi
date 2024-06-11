package com.apress.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "POLL_OPTION")
public class PollOption {
    public PollOption(Long id, String value) {
        this.id = id;
        this.value = value;
    }

    public PollOption() {
    }

    @Id
    @GeneratedValue
    @Column(name = "OPTION_ID")
    private Long id;

    @Column(name = "OPTION_VALUE")
    private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}
