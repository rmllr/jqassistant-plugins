package de.kontext_e.jqassistant.plugin.plantuml.store.descriptor;

import java.util.Set;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

@Label("Group")
public interface PlantUmlGroupDescriptor extends  PlantUmlDescriptor, PlantUmlElement {

    @Relation("HAS_CHILD_GROUPS")
    Set<PlantUmlGroupDescriptor> getChildGroups();

    @Relation("HAS_LEAFS")
    Set<PlantUmlElement> getLeafs();

}
