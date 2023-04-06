package com.company.jmixpm2.entity.project;

import io.jmix.ui.screen.*;
import com.company.jmixpm2.entity.Project;

@UiController("Project.edit")
@UiDescriptor("project-edit.xml")
@EditedEntityContainer("projectDc")
public class ProjectEdit extends StandardEditor<Project> {
}