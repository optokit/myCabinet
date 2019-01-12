package com.company.mycabinet.web.attachment;

import com.haulmont.cuba.core.app.FileStorageService;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.global.FileStorageException;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.HBoxLayout;
import com.haulmont.cuba.web.gui.components.WebComponentsHelper;
import com.vaadin.server.StreamResource;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.Image;

import javax.inject.Inject;
import java.io.ByteArrayInputStream;
import java.util.Map;

public class Imageframe extends AbstractWindow {

    @Inject
    private FileStorageService fileStorageService;

    @Inject
    private HBoxLayout imageBox;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);
        try {
            FileDescriptor file = (FileDescriptor) params.get("image");
            byte[] imageContent = fileStorageService.loadFile(file);

            Image image = new Image(file.getName(),
                    new StreamResource((StreamResource.StreamSource) () -> new ByteArrayInputStream(imageContent), file.getName()));
            image.setData(imageContent);
            image.setSizeFull();
            imageBox.setSizeAuto();
            ComponentContainer unwrap = (ComponentContainer) WebComponentsHelper.unwrap(imageBox);
            unwrap.addComponent(image);
        } catch (FileStorageException e) {
            //todo eude
        }
    }
}