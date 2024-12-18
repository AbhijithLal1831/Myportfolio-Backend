package com.projects.myportfolio.collections;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Projects")
@AllArgsConstructor
@NoArgsConstructor
public class Projects {
  @Id
  private int id;

  private String projectName;
  private int duration;
  private String technology;
}
