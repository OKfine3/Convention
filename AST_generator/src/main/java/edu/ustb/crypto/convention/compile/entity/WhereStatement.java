package edu.ustb.crypto.convention.compile.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class WhereStatement {
    OrExpression orExpression;

    public WhereStatement(OrExpression orExpression) {
        this.orExpression = orExpression;
    }

    public OrExpression getOrExpression() {
        return orExpression;
    }
}
