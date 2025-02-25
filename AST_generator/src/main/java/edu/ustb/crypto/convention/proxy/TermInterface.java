package edu.ustb.crypto.convention.proxy;

import edu.ustb.crypto.convention.compile.entity.GeneralClause;
import edu.ustb.crypto.convention.compile.entity.GeneralTerm;

public interface TermInterface {
    public boolean preHandle(GeneralTerm generalTerm, GeneralClause generalClause);

    public boolean postHandle(GeneralTerm generalTerm, GeneralClause generalClause);

    public boolean process(GeneralTerm generalTerm, GeneralClause generalClause);
}
