package com.company.mycabinet.web.attachment;


import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.gui.WindowParam;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.Image;
import com.haulmont.cuba.gui.data.Datasource;

import javax.inject.Inject;
import java.util.Map;

public class Imageframe extends AbstractFrame {
    @Inject
    protected Image image;

    @WindowParam
    protected Datasource imageFile;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

    }
}