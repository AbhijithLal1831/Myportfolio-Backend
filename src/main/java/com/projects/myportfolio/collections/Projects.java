package com.projects.myportfolio.collections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Projects")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Projects {
  @Id
  private int id;

  private String projectName;
  private int duration;
  private String technology;
}
