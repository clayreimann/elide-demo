/*
 * Copyright 2017 Yahoo Inc. All rights reserved.
 */
package com.example.repository.beans;

import com.yahoo.elide.annotation.Include;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Include(type = "product")
@Entity
public class ArtifactProduct {
    @Id
    public String name = "";

    public String commonName = "";

    public String description = "";

    @ManyToOne
    public ArtifactGroup group = null;

    @OneToMany(mappedBy = "artifact")
    public List<ArtifactVersion> versions = new ArrayList<>();
}
