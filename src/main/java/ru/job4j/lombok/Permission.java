package ru.job4j.lombok;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Permission {
    private int id;
    private String name;
    @Singular("accessBy")
    private List<String> rules;
}