package com.company.jmixpm2.entity.project;

import io.jmix.ui.screen.*;
import com.company.jmixpm2.entity.Project;

@UiController("Project.browse")
@UiDescriptor("project-browse.xml")
@LookupComponent("projectsTable")
public class ProjectBrowse extends StandardLookup<Project> {
}