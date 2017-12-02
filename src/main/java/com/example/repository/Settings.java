/*
 * Copyright 2017 Yahoo Inc. All rights reserved.
 */
package com.example.repository;

import com.example.repository.beans.ArtifactGroup;
import com.yahoo.elide.standalone.config.ElideStandaloneSettings;

public class Settings implements ElideStandaloneSettings {
    @Override
    public String getModelPackageName() {
        return ArtifactGroup.class.getPackage().getName();
    }
}
