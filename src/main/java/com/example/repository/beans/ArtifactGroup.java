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

@Include(rootLevel = true)
@Entity
public class ArtifactGroup {
    @Id
    public String name = "";
}
