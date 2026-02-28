package org.example.myapp.model;


import jakarta.persistence.*;

@Entity
@Table(name = "owners")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "owner_id")
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String phone;

    // get - methods
    public Long getId() { return id; }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }

    // set - methods
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
