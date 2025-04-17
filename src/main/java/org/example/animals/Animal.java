package org.example.animals;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@AllArgsConstructor
public abstract class Animal {
     String name;
     int age;

     abstract public void voice (int a);
     abstract public void run(int distance);
     abstract public void swim(int distance);
}
