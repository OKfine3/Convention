package edu.ustb.crypto.convention.compile.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class WhenStatement {
    OrExpression orExpression;

    public WhenStatement(OrExpression orExpression) {
        this.orExpression = orExpression;
    }

    public OrExpression getOrExpression() {
        return orExpression;
    }
}
