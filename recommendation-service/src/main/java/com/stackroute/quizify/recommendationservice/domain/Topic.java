package com.stackroute.quizify.recommendationservice.domain;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;


@NodeEntity
@Data
public class Topic {
    @Id
    @GeneratedValue
    private long id;
    @Property
    private String name;
    @Property
    private String imageUrl;
}
