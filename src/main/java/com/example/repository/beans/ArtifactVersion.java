/*
 * Copyright 2017 Yahoo Inc. All rights reserved.
 */
package com.example.repository.beans;

import com.yahoo.elide.annotation.Include;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Include(type = "version")
@Entity
public class ArtifactVersion {
    @Id
    public String name = "";

    public Date createdAt = new Date();

    @ManyToOne
    public ArtifactProduct artifact;

    @OneToMany(mappedBy = "version")
    public Set<ArtifactBinary> binaries = new LinkedHashSet<>();
}
